package com.gwd.controller;

import com.gwd.entity.FlowInfo;
import com.gwd.service.ActFlowCommService;
import com.gwd.service.FlowService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@Api("流程管理")
public class FlowController {


    @Autowired
    private FlowService flowService;
    @Autowired
    private ActFlowCommService actFlowCommService;

    @ApiOperation("查询所有流程")
    @GetMapping("/flow/findAll")
    public List<FlowInfo> findAllFlow(){
        return flowService.findAllFlow();
    }

    @ApiOperation("部署流程:0-部署失败  1- 部署成功  2- 已经部署过")
    @PutMapping("/flow/deployment/{id}")
    public Integer deployment(HttpServletRequest request, @PathVariable(name = "id")Long id){
        FlowInfo flowInfo = flowService.findOneFlow(id);
        if(flowInfo.getState() == 1 || flowInfo.getState() == 2){
            return flowInfo.getState();
        }
        actFlowCommService.saveNewDeploy(flowInfo);
        return flowService.updateDeployState(id);
    }

    @ApiOperation("查询用户任务")
    @GetMapping("/flow/findUserTask")
    public List<Map<String,Object>> findUserTask(HttpServletRequest request){
        Long userId = (Long)request.getSession().getAttribute("userid");
        return flowService.findUserTask(userId);
    }

    @ApiOperation("查询任务详细信息")
    @GetMapping("/flow/findTaskInfo")
    public List<Map<String,Object>> findTaskInfo(HttpServletRequest request){
        Long userId = (Long)request.getSession().getAttribute("userid");
        return flowService.findTaskInfo(userId);
    }

    @ApiOperation("完成任务")
    @PutMapping("/flow/completeTask/{taskId}")
    public void completeTask(HttpServletRequest request,@PathVariable("taskId")String taskId){
        Long userId = (Long)request.getSession().getAttribute("userid");
        flowService.completeTask(taskId,userId);
    }


    @ApiOperation("根据businessKey查询历史任务")
    @GetMapping("/flow/findFlowTask/{id}")
    public Map<String,Object> findFlowTask(@PathVariable(name = "id")Long id){
        String businessKey = "evection:"+id;
        actFlowCommService.searchHistory(businessKey);
        return null;
    }
}

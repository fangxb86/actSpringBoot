package com.gwd.controller.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.activiti.engine.*;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/subp")
@Api("Activiti子流程例子subp")
public class SubProcessController {
 
 
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
 
    @Autowired
    private HistoryService historyService;
 
 
    private static String processDefindKey= "myProcess";

    @ApiOperation("部署流程")
    @GetMapping("deployProcess")
    public void saveNewDeploy() {
        Deployment deployment = repositoryService.createDeployment()
                .addClasspathResource("bpmn/subprocess.bpmn") // 添加bpmn资源
                .name("子流程")
                .deploy();
//        4、输出部署信息
        System.out.println("流程部署id：" + deployment.getId());
        System.out.println("流程部署名称：" + deployment.getName());
    }
 
    @ApiOperation("启动实例")
    @GetMapping("startProcess")
    public void startProcess(){
        System.out.println("启动实例");
        Map paramMap = new HashMap<>();
        paramMap.put("nextStepFlag","0");
        runtimeService.startProcessInstanceByKey(processDefindKey,paramMap);
 
    }
 
    @ApiOperation("完成任务")
    @GetMapping("submitTaskProcess")
    public void  submitTaskProcess(){
        System.out.println("完成任务");
        String taskId = "65041";
        taskService.complete(taskId);
 
    }
 
    @ApiOperation("查询任务")
    @GetMapping("queryTask")
    public void  queryTask(){
        System.out.println("查询任务");
        List<Task> taskList = taskService.createTaskQuery().processDefinitionKey(processDefindKey).list();
        for (Task task : taskList){
            System.out.println("taskId:"+task.getId()+" execId:"+task.getExecutionId()+" 流程实例id："+task.getProcessInstanceId()+" 任务key："+task.getTaskDefinitionKey());
        }
    }

    @ApiOperation("删除流程部署")
    @GetMapping("delDeploy")
    public void deleteDeployMent(){
//        通过部署id来删除流程部署信息
        String deploymentId = "1040813f-0b1e-11ec-a5b1-4ccc6a42031c";
        repositoryService.deleteDeployment(deploymentId,true);
    }
}

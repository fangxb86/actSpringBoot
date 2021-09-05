package com.gwd.controller;

import com.gwd.entity.SiteMessage;
import com.gwd.service.SiteMessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@Api("消息管理")
public class SiteMessageController {

    @Autowired
    private SiteMessageService siteMessageService;

    @ApiOperation("查询所有站内消息")
    @GetMapping("/msg/findAll")
    public List<SiteMessage> findAll(HttpServletRequest request){
        Long userId = (Long)request.getSession().getAttribute("userid");
        return siteMessageService.findAll(userId);
    }

    @ApiOperation("根据id查询消息")
    @GetMapping("/msg/findOne/{id}")
    public SiteMessage findOne(@PathVariable(name = "id")Long id,
                               HttpServletRequest request){
        Long userId = (Long)request.getSession().getAttribute("userid");
        return siteMessageService.findOne(id,userId);
    }

    @ApiOperation("修改消息")
    @PutMapping("/msg/{id}")
    public void readMsg(@PathVariable(name = "id")Long id,HttpServletRequest request){
        Long userId = (Long)request.getSession().getAttribute("userid");
        siteMessageService.readMsg(id,userId);
    }
}

package com.gwd.controller.test;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/**
* 控制层 简单演示增删改查及分页
*
*/
@RestController
@RequestMapping("api")
@Api("swaggerDemoController相关的api")
public class SwaggerDemoController {

    //1.商品添加
    //@PutMapping("add") 添加方法--restful风格
    @PutMapping("add")
    @ApiOperation(value="商品新增")
    //正常业务时， 需要在category类里或者server层进行事务控制，控制层一般不进行业务控制的。
    //@Transactional(rollbackFor = Exception.class)
    //@RequestParam 接收页面中的请求的参数
    public Map<String,Object> addCategory(@RequestParam  String name){

        Map<String,Object> result = new  HashMap<String,Object>();
        result.put("respCode", "01");
        result.put("respMsg", "新增成功！");
        result.put("data", "aaa");
        return result;
    }

    
}
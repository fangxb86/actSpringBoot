package com.gwd.controller.adtprj;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adtprj")
@Api("项目列表控制器")
public class AdtprjController {

    @PutMapping("queryPrjListPage")
    @ApiOperation(value="查询项目列表")
    public void queryPrjListPage(){
        return ;
    }
}

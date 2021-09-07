package com.gwd.controller.adtplan;

import com.gwd.service.adtplan.AdtPlanService;
import com.gwd.vo.adtplan.PrjPlanVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/adtplan")
@Api("审计计划管理")
public class AdtPlanController {

    @Autowired
    private AdtPlanService adtPlanService;

    @PutMapping("queryPrjListPage")
    @ApiOperation(value="查询项目列表")
    public void queryPrjPlanPage(PrjPlanVo prjPlanVo){
        adtPlanService.queryPrjPlanPage(prjPlanVo);
    }
}

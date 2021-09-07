package com.gwd.service.adtplan;

import com.github.pagehelper.PageHelper;
import com.gwd.entity.AdtPlan;
import com.gwd.mapper.AdtPlanMapper;
import com.gwd.vo.adtplan.PrjPlanVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
public class AdtPlanService {
    @Autowired
    private AdtPlanMapper adtPlanMapper;
    @Transactional
    public void queryPrjPlanPage(PrjPlanVo prjPlanVo){
        PageHelper.startPage(1,5);
        List<AdtPlan> adtPlans = adtPlanMapper.getAll();
        log.info(""+adtPlans.size());
    }
}

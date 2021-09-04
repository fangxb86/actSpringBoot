package com.gwd.service;

import com.gwd.mapper.EvectionMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class EvectionServiceTest {

    @Autowired
    private EvectionMapper evectionMapper;

    @Test
    public void findList() {
        evectionMapper.selectAll(1l);
    }
}
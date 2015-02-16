package org.david.service.impl;

import org.david.entity.Test;
import org.david.mapper.TestMapper;
import org.david.service.TestService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by william on 14-12-23.
 */
@Repository(value = "testService")
@Transactional
public class TestServiceImpl implements TestService {

    @Resource(name = "testMapper")
    private TestMapper testMapper;

    @Override
    public List<Test> find() {
        return this.testMapper.operateReturnBeans();
    }

    @Override
    public int add(Test test) {
        return this.testMapper.add(test);
    }

}

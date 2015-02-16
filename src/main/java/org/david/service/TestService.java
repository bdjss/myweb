package org.david.service;


import org.david.entity.Test;

import java.util.List;


/**
 * Created by william on 14-12-23.
 */
public interface TestService {

    List<Test> find();

    int add(Test test);
}

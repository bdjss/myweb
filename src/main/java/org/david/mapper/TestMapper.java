package org.david.mapper;

import org.david.entity.Test;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by william on 14-12-23.
 */
@Repository(value = "testMapper")
public interface TestMapper {

    @Select("select * from user")
    /*@Results(value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "age", column = "age")
    })*/
    List<Test> operateReturnBeans();

    @Insert("insert into user (name,age) values (#{name},#{age})")
    int add(Test test);
}

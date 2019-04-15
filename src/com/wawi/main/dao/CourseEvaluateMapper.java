package com.wawi.main.dao;

import com.wawi.main.pojo.CourseEvaluate;
import com.wawi.main.pojo.CourseEvaluateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseEvaluateMapper {
    int countByExample(CourseEvaluateExample example);

    int deleteByExample(CourseEvaluateExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseEvaluate record);

    int insertSelective(CourseEvaluate record);

    List<CourseEvaluate> selectByExample(CourseEvaluateExample example);

    CourseEvaluate selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CourseEvaluate record, @Param("example") CourseEvaluateExample example);

    int updateByExample(@Param("record") CourseEvaluate record, @Param("example") CourseEvaluateExample example);

    int updateByPrimaryKeySelective(CourseEvaluate record);

    int updateByPrimaryKey(CourseEvaluate record);
}
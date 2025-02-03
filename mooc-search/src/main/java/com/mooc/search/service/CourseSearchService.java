package com.mooc.search.service;

import com.mooc.base.model.PageParams;
import com.mooc.base.model.PageResult;
import com.mooc.search.dto.SearchCourseParamDto;
import com.mooc.search.dto.SearchPageResultDto;
import com.mooc.search.po.CourseIndex;

/**
 * @description 课程搜索service
 * @author Mr.M
 * @date 2022/9/24 22:40
 * @version 1.0
 */
public interface CourseSearchService {


    /**
     * @description 搜索课程列表
     * @param pageParams 分页参数
     * @param searchCourseParamDto 搜索条件
     * @return com.mooc.base.model.PageResult<com.mooc.search.po.CourseIndex> 课程列表
     * @author Mr.M
     * @date 2022/9/24 22:45
    */
    SearchPageResultDto<CourseIndex> queryCoursePubIndex(PageParams pageParams, SearchCourseParamDto searchCourseParamDto);

 }

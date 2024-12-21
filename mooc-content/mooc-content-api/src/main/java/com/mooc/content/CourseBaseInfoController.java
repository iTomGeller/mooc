package com.mooc.content;

import com.mooc.base.model.PageParams;
import com.mooc.base.model.PageResult;
import com.mooc.content.model.dto.QueryCourseParamsDto;
import com.mooc.content.model.po.CourseBase;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseBaseInfoController {

    @RequestMapping("/course/list")
    public PageResult<CourseBase> list(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto) {
        return null;
    }
}

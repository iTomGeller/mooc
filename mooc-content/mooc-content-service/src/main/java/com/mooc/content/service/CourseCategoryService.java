package com.mooc.content.service;

import com.mooc.content.model.dto.CourseCategoryTreeDto;

import java.util.List;

/**
 * @author Mr.M
 * @version 1.0
 * @description TODO
 * @date 2023/2/12 14:49
 */
public interface CourseCategoryService {
 /**
  * 课程分类树形结构查询
  *
  * @return
  */
 public List<CourseCategoryTreeDto> queryTreeNodes(String id);
}

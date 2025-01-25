package com.mooc.content.service;

import com.mooc.content.model.dto.BindTeachplanMediaDto;
import com.mooc.content.model.dto.SaveTeachplanDto;
import com.mooc.content.model.dto.TeachplanDto;

import java.util.List;

/**
 * @author Mr.M
 * @version 1.0
 * @description 课程计划管理相关接口
 * @date 2023/2/14 12:10
 */
public interface TeachplanService {
 /**
  * 根据课程id查询课程计划
  * @param courseId 课程计划
  * @return
  */
  public List<TeachplanDto> findTeachplanTree(Long courseId);

 /**
  * 新增/修改/保存课程计划
  * @param saveTeachplanDto
  */
 public void saveTeachplan(SaveTeachplanDto saveTeachplanDto);

 /**
  * 删除课程计划
  * @param teachplanId
  */
 public void deleteTeachplan(Long teachplanId);

 /**
  * 排序课程计划
  * @param teachplanId,courseId
  */
 public void orderByTeachplan(String moveType, Long teachplanId);

 /**
  * @description 教学计划绑定媒资
  * @param bindTeachplanMediaDto
  * @return com.xuecheng.content.model.po.TeachplanMedia
  * @author Mr.M
  * @date 2022/9/14 22:20
  */
 public void associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);

 /** 解绑教学计划与媒资信息
  * @param teachPlanId       教学计划id
  * @param mediaId           媒资信息id
  */
 void unassociationMedia(Long teachPlanId, String mediaId);
}

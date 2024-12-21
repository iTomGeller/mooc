package com.mooc.base.model;

import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class PageParams {

    //当前页码
    private Long pageNo = 1l;

    //每页显示记录数
    private Long pageSize = 1l;

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}

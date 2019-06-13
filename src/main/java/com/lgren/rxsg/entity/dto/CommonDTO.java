package com.lgren.rxsg.entity.dto;

import lombok.Data;

/**
 * 前端传输公共类 用处1. 传输当前页 每页大小
 * @author Lgren
 * @create 2018-12-07 18:12
 **/
@Data
public class CommonDTO {
    private Integer current = 1;
    private Integer pageSize = 20;
    private String id;
    private String keyword;
//    private Integer pages;
//    private Integer total;
//    private List<> records;
}

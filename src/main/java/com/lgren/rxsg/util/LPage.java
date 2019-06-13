package com.lgren.rxsg.util;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Getter;

import java.util.List;

/**
 * TODO
 * @author lgren
 * @create 2019-06-13 09:00
 **/
public class LPage<T> extends Page<T> {
    private List<T> pages;

    public LPage() {
        super();

    }

    public LPage(long current, long size) {
        super(current, size);
    }

    public LPage(long current, long size, Long total) {
        super(current, size, total);
    }

    // @Override
    // public List<T> getPages() {
    //     return pages;
    // }

    public void setPages(List<T> pages) {
        this.pages = super.getRecords();
    }
}

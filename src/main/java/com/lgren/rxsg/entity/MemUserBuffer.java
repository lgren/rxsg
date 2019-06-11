package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemUserBuffer extends Model<MemUserBuffer> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * buffer类型
1:神农锄
2:鲁班斧
3:开山锤
4:玄铁炉
5:陷阵战鼓
6:八卦阵图
7:免战中
8:免战冷却
9:青囊书
10:清仓令
11:徭役令
12:考工记1
13:考工记2
14:考工记3
     */
    private Integer buftype;

    /**
     * 结束时间
     */
    private Integer endtime;

    private Integer bufparam;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class RankActivity extends Model<RankActivity> {

    private static final long serialVersionUID = 1L;

    /**
     * 名排
     */
    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    private Integer uid;

    /**
     * 玩家君主名
     */
    private String name;

    /**
     * 第一排序数值
     */
    private String sort3;

    /**
     * 第二排序数值
     */
    private String sort4;

    /**
     * 第三排序数值
     */
    private String sort5;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

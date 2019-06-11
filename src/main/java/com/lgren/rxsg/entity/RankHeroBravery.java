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
public class RankHeroBravery extends Model<RankHeroBravery> {

    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    /**
     * 武将的ID
     */
    private Integer hid;

    /**
     * 武将名
     */
    private String name;

    private String user;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 内政
     */
    private Integer affairs;

    /**
     * 勇武
     */
    private Integer bravery;

    /**
     * 智谋
     */
    private Integer wisdom;

    private Integer uid;

    /**
     * 统率
     */
    private Integer command;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

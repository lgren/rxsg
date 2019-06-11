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
public class RankUnion extends Model<RankUnion> {

    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    /**
     * 联盟ID
     */
    private Integer uid;

    /**
     * 盟联
     */
    private String name;

    /**
     * 盟主
     */
    private String leader;

    /**
     * 成员数
     */
    private Integer member;

    private Integer famouscity;

    /**
     * 声望
     */
    private Integer prestige;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

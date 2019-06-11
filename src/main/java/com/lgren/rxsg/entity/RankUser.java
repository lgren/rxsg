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
public class RankUser extends Model<RankUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    private Integer uid;

    /**
     * 君主
     */
    private String name;

    /**
     * 联盟
     */
    private String union;

    private String nobility;

    /**
     * 声望
     */
    private Integer prestige;

    /**
     * 城池数
     */
    private Integer city;

    /**
     * 人口数
     */
    private Integer people;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

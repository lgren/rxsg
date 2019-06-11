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
public class RankCityType extends Model<RankCityType> {

    private static final long serialVersionUID = 1L;

    /**
     * 排名
     */
    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    /**
     * 城池名
     */
    private String name;

    private Integer type;

    /**
     * 君主
     */
    private String user;

    /**
     * 联盟
     */
    private String union;

    /**
     * 城池id(位置)
     */
    private Integer cid;

    /**
     * 人口数
     */
    private Integer people;

    private Integer uid;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

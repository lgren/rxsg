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
public class CfgGoodsDrop extends Model<CfgGoodsDrop> {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    /**
     * 在哪用这个物品
     */
    private Integer act;

    /**
     * 多少个
     */
    private Integer count;

    /**
     * 是什么东西，1宝物，
2thing，3装备
     */
    private Boolean type;

    /**
     * 开启时间
     */
    private Integer starttime;

    /**
     * 结束时间
     */
    private Integer endtime;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

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
public class CfgPkFirst extends Model<CfgPkFirst> {

    private static final long serialVersionUID = 1L;

    private Integer battleid;

    private Integer rankid;

    private Integer type;

    /**
     * 类型，物品id，数量；0,11,1;1,11,2。0,goods;1,armor
     */
    private String reward;

    private Integer uid;

    private Integer passtime;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.battleid;
    }

}

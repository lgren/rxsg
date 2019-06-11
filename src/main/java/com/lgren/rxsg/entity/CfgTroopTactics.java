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
public class CfgTroopTactics extends Model<CfgTroopTactics> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "stype", type = IdType.AUTO)
    private Integer stype;

    private Integer plunderAction;

    private Integer plunderTarget;

    private Integer invadeAction;

    private Integer invadeTarget;

    private Integer invadeAction2;

    private Integer invadeTarget2;

    private Integer patrolAction;

    private Integer fieldAction;

    private Integer fieldTarget;


    @Override
    protected Serializable pkVal() {
        return this.stype;
    }

}

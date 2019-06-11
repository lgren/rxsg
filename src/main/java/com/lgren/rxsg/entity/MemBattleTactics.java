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
public class MemBattleTactics extends Model<MemBattleTactics> {

    private static final long serialVersionUID = 1L;

    private Integer battleid;

    private Integer attack;

    private Integer stype;

    private Integer action;

    private Integer target;

    private Integer action2;

    private Integer target2;


    @Override
    protected Serializable pkVal() {
        return this.battleid;
    }

}

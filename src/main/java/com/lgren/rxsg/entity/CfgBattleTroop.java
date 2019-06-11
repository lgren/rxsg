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
public class CfgBattleTroop extends Model<CfgBattleTroop> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private Integer xy;

    private String drop;

    private Integer rate;

    private Integer hid;

    private Integer npcvalue;

    private String soldiers;

    /**
     * 0:初始军，1: 重生军
     */
    private Integer type;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer unionid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

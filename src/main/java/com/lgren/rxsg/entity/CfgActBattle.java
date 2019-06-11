package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 战场每周活动
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgActBattle extends Model<CfgActBattle> {

    private static final long serialVersionUID = 1L;

    private Integer actid;

    /**
     * 日期(0：为每周定期，>0：为临时手动添加)
     */
    private Integer date;

    private String actname;

    private String acttime;

    private Integer starthour;

    private Integer endhour;

    /**
     * 倍率
     */
    private Integer rate;

    /**
     * 战场活动状态:0不上，1全部开启，2部分开启（到cfg_act_battle_details里找）
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}

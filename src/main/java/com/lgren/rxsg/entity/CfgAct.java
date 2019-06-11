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
public class CfgAct extends Model<CfgAct> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "actid", type = IdType.AUTO)
    private Integer actid;

    /**
     * 活动开始时间
     */
    private Integer starttime;

    /**
     * 活动结束时间
     */
    private Integer endtime;

    /**
     * 触发概率， 以100为单位， 15表示 15%的概率触发该事件
     */
    private Integer rate;

    /**
     * 活动名称
     */
    private String name;

    /**
     * 活动类型, 0:寻宝活动 1:客栈刷将领 2:充值活动 3:乐透活动 4:击败张角概率掉落 5:官渡掉落 6:战场勋章掉落增加 7:战斗效果加成 8:历练
     */
    private Integer type;

    private Integer totalcount;

    private Integer daycount;


    @Override
    protected Serializable pkVal() {
        return this.actid;
    }

}

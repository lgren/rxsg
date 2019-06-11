package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class SysTroops extends Model<SysTroops> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家
     */
    private Integer uid;

    /**
     * 城池
     */
    private Integer cid;

    /**
     * 将领
     */
    private Integer hid;

    /**
     * 目标地点
     */
    private Integer targetcid;

    private Integer task;

    private Integer state;

    /**
     * 出发时间
     */
    private Integer starttime;

    private Integer pathtime;

    /**
     * 结束时间
     */
    private Integer endtime;

    /**
     * 中了关门打狗，不能回去
     */
    private Integer noback;

    /**
     * 士兵，格式为
num:sid,cnt;sid,cnt....
     */
    private String soldiers;

    /**
     * 携带资源 黄金,粮食,木材,石料,铁锭
     */
    private String resource;

    /**
     * 发生战斗时的战斗ＩＤ
     */
    private Integer battleid;

    /**
     * 军队占用人口数
     */
    private Integer people;

    private Double fooduse;

    /**
     * 上一次使用金蝉脱壳的时间
     */
    private Integer lastrun;

    /**
     * 上一次中八门金锁的时间
     */
    private Integer lastlock;

    @TableField("lastTempt")
    private Integer lastTempt;

    /**
     * 上一次千里奔袭的时间
     */
    private Integer lastacc;

    private Integer battlefieldid;

    private Integer startcid;

    private Integer battleunionid;

    private Integer targettroopid;

    private String drop;

    private Integer rate;

    private Integer bid;

    private Integer arriveTime;

    private Integer ulimit;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

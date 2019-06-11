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
public class LogHeroExprReward extends Model<LogHeroExprReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家编号
     */
    private Integer uid;

    /**
     * 将领历练出发城池
     */
    private Integer cid;

    /**
     * 将领编号
     */
    private Integer hid;

    /**
     * 公共奇遇订单类型
     */
    private Integer type;

    /**
     * 奖励类型1:普通道具，2:特殊道具，3:装备道具,4:基础属性,5:宝珠转换,6:强化装备,7:好感度
     */
    private Integer sort;

    /**
     * 需要花费的元宝数
     */
    private Integer money;

    /**
     * 各种道具
     */
    private String details;

    /**
     * 将领历练得到奖励的时间
     */
    private Integer endtime;

    /**
     * 接受订单时间
     */
    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

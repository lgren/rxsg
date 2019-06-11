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
 * 将领历练奖励内容
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgHeroExprReward extends Model<CfgHeroExprReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 历练类型
     */
    private Integer type;

    /**
     * 奖励类型1:普通道具，2:特殊道具，3:装备道具,4:基础属性,5:宝珠转换,6:强化装备,7:好感度
     */
    private Integer sort;

    /**
     * 奖励明细公式
     */
    private String details;

    /**
     * 触发概率
     */
    private Integer rate;

    /**
     * 是否发通知
     */
    private Integer inform;

    /**
     * 奖励内容
     */
    private String name;

    /**
     * 元宝数值下限
     */
    private Integer minnum;

    /**
     * 元宝数值下限
     */
    private Integer maxnum;

    /**
     * 每天每个玩家最多获取的次数,0表示不限制
     */
    private Integer total;

    /**
     * 在将领切磋中，玩家是否胜利
     */
    private Integer win;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

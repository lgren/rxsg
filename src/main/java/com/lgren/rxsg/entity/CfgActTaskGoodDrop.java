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
public class CfgActTaskGoodDrop extends Model<CfgActTaskGoodDrop> {

    private static final long serialVersionUID = 1L;

    /**
     * id标记
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作类型，是哪种操作，如1表示每日签到，2表示参加战场
     */
    private Integer actiontype;

    /**
     * 动活id
     */
    private Integer actid;

    /**
     * 品物的sort，和cfg——reward的sort一样
     */
    private Integer sort;

    /**
     * 品物的type，和cfg——reward的一样
     */
    private Integer type;

    /**
     * 励奖此物品的个数
     */
    private Integer count;

    /**
     * 奖励描述
     */
    private String name;

    /**
     * 此奖励是否给的概率，100表示一定，0表示一定不给
     */
    private Integer rate;

    /**
     * 附加参数，例如需要多长时间才掉落此物品啊之类,如果比param小将不给
     */
    private String param;

    /**
     * 始开掉时间
     */
    private Integer starttime;

    /**
     * 束结掉时间
     */
    private Integer endtime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

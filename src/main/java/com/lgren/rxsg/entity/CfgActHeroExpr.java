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
public class CfgActHeroExpr extends Model<CfgActHeroExpr> {

    private static final long serialVersionUID = 1L;

    /**
     * 活动历练ID
     */
    private Integer id;

    private Integer actid;

    /**
     * 练历类型
     */
    private Integer type;

    /**
     * 奇遇ID
     */
    private Integer qid;

    /**
     * 奇遇花费元宝数
     */
    private Integer money;

    /**
     * 奇遇最小需要小时数
     */
    private Integer hours;

    private Integer rate;

    /**
     * 该奇遇活动期间发生上限
     */
    private Integer oncecount;

    /**
     * 所有奇遇活动期间发生上限
     */
    private Integer totalcount;

    /**
     * 奇遇描述
     */
    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

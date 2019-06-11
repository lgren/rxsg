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
public class CfgStrongProbability extends Model<CfgStrongProbability> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer level;

    /**
     * 成功概率
     */
    private Integer sucValue;

    /**
     * 强化的值
     */
    private Integer strongValue;

    /**
     * 失败后归0的概率
     */
    private Integer zeroValue;

    /**
     * 失败后降级的概率
     */
    private Integer degradeValue;

    /**
     * 失败后无损失的概率
     */
    private Integer intactValue;

    /**
     * 洗练出极品属性的概率
     */
    private Integer xilianRate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

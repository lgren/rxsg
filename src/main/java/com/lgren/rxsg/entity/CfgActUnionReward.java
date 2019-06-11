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
public class CfgActUnionReward extends Model<CfgActUnionReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 联盟任务id
     */
    private Integer tid;

    /**
     * 奖励物品类型
     */
    private Integer sort;

    /**
     * 奖励类型ID
     */
    private Integer type;

    /**
     * 奖励数量
     */
    private Integer count;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

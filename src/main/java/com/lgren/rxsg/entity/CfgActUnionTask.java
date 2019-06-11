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
public class CfgActUnionTask extends Model<CfgActUnionTask> {

    private static final long serialVersionUID = 1L;

    /**
     * 联盟任务id
     */
    private Integer id;

    /**
     * 获得物品明细id
     */
    private Integer detailId;

    /**
     * 达到目标数量
     */
    private Integer count;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

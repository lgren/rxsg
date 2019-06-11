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
public class CfgTaskCid extends Model<CfgTaskCid> {

    private static final long serialVersionUID = 1L;

    /**
     * 战场id
     */
    private Integer bid;

    /**
     * 任务id
     */
    private Integer tid;

    /**
     * 任务相关联的城池id
     */
    private Integer cid;

    /**
     * 0:主线任务 1:支线任务
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

}

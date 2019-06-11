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
public class CfgTaskGroup extends Model<CfgTaskGroup> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private String description;

    /**
     * 任务类型
0：成长任务
1：日常任务
2：名将任务
3：史诗任务
     */
    private Integer type;

    private Integer priority;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

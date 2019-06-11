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
public class LuoyangProgress extends Model<LuoyangProgress> {

    private static final long serialVersionUID = 1L;

    /**
     * 户用联盟id，对应到sys_union表里面的键
     */
    private Integer unionId;

    /**
     * 务任id，对应到cfg_task里面的键
     */
    private Integer tid;

    /**
     * 任务组
     */
    private Integer group;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 要需交多少次
     */
    private Integer maxvalue;

    /**
     * 已经完成多少次
     */
    private Integer curvalue;


    @Override
    protected Serializable pkVal() {
        return this.unionId;
    }

}

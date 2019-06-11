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
public class CfgTask extends Model<CfgTask> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 任务组
     */
    private Integer group;

    private Integer pretid;

    private String name;

    private String content;

    private String todo;

    /**
     * 默认状态
     */
    private Integer defaultA;

    private Integer inform;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

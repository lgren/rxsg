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
public class SysMailContent extends Model<SysMailContent> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "mid", type = IdType.AUTO)
    private Integer mid;

    private String content;

    /**
     * 信件入库时间，便于删除
     */
    private Integer posttime;


    @Override
    protected Serializable pkVal() {
        return this.mid;
    }

}

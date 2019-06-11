package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 母亲和孩子的对应关系
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemMarryRelation extends Model<MemMarryRelation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 母亲的hid
     */
    @TableField("mHid")
    private Integer mHid;

    /**
     * 孩子的hid
     */
    private Integer shid;

    /**
     * 0：保存母子培养关系，1：孩子周游列国去了，2：孩子被解雇了，3：逃亡状态，4：保存母子将领状态
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class SysUserRelation extends Model<SysUserRelation> {

    private static final long serialVersionUID = 1L;

    private Integer time;

    private Integer tuid;

    private Integer uid;

    /**
     * 关系类型,0:好友 ,1仇人 
     */
    private Integer type;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer cid;

    private Integer tcid;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

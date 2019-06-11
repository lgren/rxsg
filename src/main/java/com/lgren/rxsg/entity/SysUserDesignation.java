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
public class SysUserDesignation extends Model<SysUserDesignation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer did;

    private Integer uid;

    /**
     * 0:未穿戴
1:穿戴
     */
    private Integer ison;

    /**
     * 0:失去称号
1:拥有称号
2:获得称号
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

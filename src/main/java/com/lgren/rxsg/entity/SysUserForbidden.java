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
public class SysUserForbidden extends Model<SysUserForbidden> {

    private static final long serialVersionUID = 1L;

    /**
     * 户用UID
     */
    private Integer uid;

    /**
     * 聊天禁言结束时间
     */
    private Integer chat;

    /**
     * 帐号冻结结束时间
     */
    private Integer login;

    private String reason;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

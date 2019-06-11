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
public class SysUnionInvite extends Model<SysUnionInvite> {

    private static final long serialVersionUID = 1L;

    private Integer unionid;

    /**
     * 发出邀请的联盟官员
     */
    private String inviter;

    private Integer uid;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.unionid;
    }

}

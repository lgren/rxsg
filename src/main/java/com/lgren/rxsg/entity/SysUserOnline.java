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
public class SysUserOnline extends Model<SysUserOnline> {

    private static final long serialVersionUID = 1L;

    /**
     * 1 成人
     */
    private Integer uid;

    private Integer loginTime;

    private Integer logoutTime;

    private Integer onlineTime;

    private Integer offlineTime;

    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

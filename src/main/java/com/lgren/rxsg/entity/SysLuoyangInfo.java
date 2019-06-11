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
public class SysLuoyangInfo extends Model<SysLuoyangInfo> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer unionid;

    private String name;

    private String initname;

    private Integer count;

    /**
     * 上次发送全服公告的时间
     */
    private Integer lastSendInform;

    /**
     * 上次使用联盟诏安的时间
     */
    private Integer lastUseBuffer;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

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
public class LogArmorStrong extends Model<LogArmorStrong> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer sid;

    private Integer armorid;

    /**
     * 0,装备，1，坐骑
     */
    private Integer type;

    private Integer startlevel;

    private Integer endlevel;

    /**
     * gid
     */
    private String usegoods;

    /**
     * 0,未成功，1成功
     */
    private Integer success;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

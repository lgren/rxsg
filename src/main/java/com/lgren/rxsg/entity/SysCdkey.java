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
public class SysCdkey extends Model<SysCdkey> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 类型，０表示白银CDKEY，１表示黄金CDKEY
     */
    private Integer type;

    /**
     * CDKEY
     */
    private String cdkey;

    /**
     * 领取的用户，０表示未用
     */
    private Integer uid;

    /**
     * 领取时间
     */
    private Integer time;

    /**
     * 获得徐径 ０表示天赐褔禄活动，１表示天书残卷活动
     */
    private Integer remark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

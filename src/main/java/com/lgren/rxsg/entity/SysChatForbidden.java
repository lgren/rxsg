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
public class SysChatForbidden extends Model<SysChatForbidden> {

    private static final long serialVersionUID = 1L;

    /**
     * 户用UID
     */
    private Integer uid;

    /**
     * 公聊频道禁言时间
     */
    private Integer publicA;

    /**
     * 联盟频道禁言时间
     */
    private Integer union;

    /**
     * 聊私禁言时间
     */
    private Integer privateA;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

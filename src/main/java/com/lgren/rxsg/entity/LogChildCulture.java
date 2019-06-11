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
 * 孩子培养记录表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class LogChildCulture extends Model<LogChildCulture> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 孩子hid
     */
    private Integer hid;

    /**
     * 1：统帅，2：内政，3：勇武，4：智谋
     */
    private Integer attid;

    /**
     * 加的点数
     */
    private Integer value;

    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

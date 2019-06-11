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
public class LogMerchant extends Model<LogMerchant> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 户用id
     */
    private Integer uid;

    /**
     * 作操时间
     */
    private Integer time;

    /**
     * 购买的数量
     */
    private Integer wood;

    /**
     * 购买的数量
     */
    private Integer food;

    /**
     * 购买的数量
     */
    private Integer iron;

    /**
     * 购买的数量
     */
    private Integer rock;

    /**
     * 购买的数量
     */
    private Integer gold;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

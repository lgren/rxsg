package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 打开宝箱需要钥匙
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgBoxOpenCondition extends Model<CfgBoxOpenCondition> {

    private static final long serialVersionUID = 1L;

    /**
     * 宝箱gid
     */
    private Integer boxid;

    /**
     * 钥匙描述
     */
    private String keyid;

    /**
     * 没有宝箱描述
     */
    private String noboxdesc;

    /**
     * 没有钥匙描述
     */
    private String nokeydesc;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

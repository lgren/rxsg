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
public class CfgActUnionGains extends Model<CfgActUnionGains> {

    private static final long serialVersionUID = 1L;

    /**
     * 获得明细ID
     */
    private Integer detailId;

    /**
     * 联盟ID
     */
    private Integer unionId;

    /**
     * 获得总数量
     */
    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.detailId;
    }

}

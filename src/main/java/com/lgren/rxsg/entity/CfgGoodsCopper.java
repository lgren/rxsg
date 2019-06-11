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
public class CfgGoodsCopper extends Model<CfgGoodsCopper> {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    private Integer price;

    private Integer rate;

    private Integer type;

    /**
     * 是否上架
     */
    private Integer onsale;

    /**
     * 是否属于推荐商品
0：不推荐
1：不推荐
     */
    private Integer commend;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

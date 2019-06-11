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
public class CfgPackGoods extends Model<CfgPackGoods> {

    private static final long serialVersionUID = 1L;

    /**
     * 道具包ID
     */
    private Integer gid;

    /**
     * 商品编码
N,gid,count,gid,count......
N表示有多个个商品，gid指定道具ID（0指定元宝），count指定该道具个数
     */
    private String goods;

    private String armor;

    private String res;

    private String things;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

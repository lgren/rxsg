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
public class CfgGoodsTimeout extends Model<CfgGoodsTimeout> {

    private static final long serialVersionUID = 1L;

    /**
     * 道具ID
50000以上表示自动生产的礼包
     */
    private Integer gid;

    /**
     * 该宝物过期时间
     */
    private Integer endtime;

    /**
     * 0 商品 1 任务 2 任务物品
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

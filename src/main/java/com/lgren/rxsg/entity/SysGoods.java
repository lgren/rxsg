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
public class SysGoods extends Model<SysGoods> {

    private static final long serialVersionUID = 1L;

    /**
     * 玩家ID
     */
    private Integer uid;

    /**
     * 物品ID
     */
    private Integer gid;

    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

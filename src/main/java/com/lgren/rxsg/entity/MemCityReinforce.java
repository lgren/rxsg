package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 正在征的兵

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemCityReinforce extends Model<MemCityReinforce> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 城市ID,也就是城市的位置
     */
    private Integer cid;

    /**
     * 士兵ID
     */
    private Integer did;

    private Integer count;

    /**
     * 该建筑状态结束时间
     */
    private Integer stateEndtime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

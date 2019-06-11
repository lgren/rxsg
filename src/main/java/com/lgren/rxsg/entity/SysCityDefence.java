package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 玩家拥有的所有建筑

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCityDefence extends Model<SysCityDefence> {

    private static final long serialVersionUID = 1L;

    /**
     * 城市ID,也就是城市的位置
     */
    private Integer cid;

    /**
     * 建筑ID,默认为0,代表无建筑
     */
    private Integer did;

    /**
     * 士兵数量
     */
    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}

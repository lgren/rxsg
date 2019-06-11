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
public class SysBuildingBackup extends Model<SysBuildingBackup> {

    private static final long serialVersionUID = 1L;

    /**
     * 玩家ID
     */
    private Integer uid;

    /**
     * 建筑ID
     */
    private Integer bid;

    /**
     * 建筑位置
     */
    private Integer xy;

    /**
     * 建筑等级
     */
    private Integer level;

    /**
     * 被灭时间
     */
    private Integer time;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 合并建筑的升级顺序
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgBuildingMerge extends Model<CfgBuildingMerge> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private Integer seq;


    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}

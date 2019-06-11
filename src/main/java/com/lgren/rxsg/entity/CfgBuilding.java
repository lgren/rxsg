package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 建筑的设定
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgBuilding extends Model<CfgBuilding> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private String name;

    private String tableName;

    private String description;

    private Integer inner;


    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}

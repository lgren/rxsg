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
public class CfgUnionBuildingUpgrade extends Model<CfgUnionBuildingUpgrade> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private String name;

    private Integer level;

    private String intro;

    private String curintro;

    private String nextintro;

    private Integer num;

    private Integer nextnum;

    private Integer open;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

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
public class CfgPkLevel extends Model<CfgPkLevel> {

    private static final long serialVersionUID = 1L;

    /**
     * 战役编号
     */
    private Integer battleid;

    /**
     * 关卡编号
     */
    private Integer levelid;

    /**
     * 0,普通；1,精英
     */
    private Integer type;

    /**
     * 关卡名称
     */
    private String levelname;

    private Integer hid;

    private Integer area;


    @Override
    protected Serializable pkVal() {
        return this.battleid;
    }

}

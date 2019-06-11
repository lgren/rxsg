package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
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
public class CfgCityTactics extends Model<CfgCityTactics> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "stype", type = IdType.AUTO)
    private Integer stype;

    /**
     * 1:参加,2:留守
     */
    private Integer deplunderJoin;

    /**
     * １：进攻２：防御３：后退
     */
    private Integer deplunderAction;

    /**
     * 目标
     */
    private Integer deplunderTarget;

    private Integer depatrolJoin;

    private Integer depatrolAction;

    private Integer deinvadeJoin;

    private Integer deinvadeAction;

    private Integer deinvadeTarget;

    private Integer deinvadeAction2;

    private Integer deinvadeTarget2;


    @Override
    protected Serializable pkVal() {
        return this.stype;
    }

}

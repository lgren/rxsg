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
 * 建筑的设定
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgDefence extends Model<CfgDefence> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "did", type = IdType.AUTO)
    private Integer did;

    private Integer type;

    private String name;

    private String description;

    /**
     * 生命
     */
    private Integer hp;

    /**
     * 攻击
     */
    private Integer ap;

    /**
     * 防御
     */
    private Integer dp;

    private Integer range;

    private Integer speed;

    private Integer carry;

    private Integer timeNeed;

    private Double woodNeed;

    private Double rockNeed;

    private Double ironNeed;

    private Double foodNeed;

    private Double goldNeed;

    private Integer areaNeed;


    @Override
    protected Serializable pkVal() {
        return this.did;
    }

}

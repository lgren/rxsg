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
public class CfgSoldier extends Model<CfgSoldier> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "sid", type = IdType.AUTO)
    private Integer sid;

    /**
     * 兵种类型
1：民夫
2：义兵
3：斥侯
4：长枪兵
5：刀盾兵
6：弓箭兵
7：轻骑兵
8：铁骑兵
9：辎重兵
10：床弩
11：冲车
12：投石车
     */
    private Integer type;

    /**
     * 是否为城内可招兵种
     */
    private Integer fromcity;

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

    private Integer peopleNeed;

    private Double foodUse;


    @Override
    protected Serializable pkVal() {
        return this.sid;
    }

}

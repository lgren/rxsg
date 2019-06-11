package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class AdmShopSale extends Model<AdmShopSale> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 则规是否启用
     */
    private Integer enable;

    /**
     * 操作类型 1-打折，2-限总量，3-每人每天限购，4-每人活动期间限购，5-打包 可以多种类型组合格式：1,2,3
     */
    private String operateType;

    /**
     * 操作商品id
     */
    private Integer operateSid;

    /**
     * 效生时间
     */
    private Integer startTime;

    /**
     * 束结时间
     */
    private Integer endTime;

    /**
     * 应对的档期号
     */
    private Integer campaignId;

    /**
     * 不做修改，为空；修改的话不为空
     */
    private String description;

    /**
     * 调整商品位置 暂时没有用到
     */
    private Integer position;

    /**
     * 商品价格
     */
    private Integer price;

    /**
     * 是否是特价商品
0：非特价
N：推到特价N号位置
     */
    private Integer rebate;

    /**
     * 是否属于推荐商品
0：不推荐
N：推荐到N号位置
     */
    private Integer commend;

    /**
     * 是否属于热卖商品
0：非热卖
N：推到热卖N号位置
     */
    private Integer hot;

    /**
     * 该商品总量，买完为止
2000000000：表示不限
N表示限制N个
     */
    @TableField("totalCount")
    private Integer totalCount;

    /**
     * 每人购买次数
0：表示不限购买次数
N：表示每人最多购买N次
     */
    private Integer userbuycnt;

    /**
     * 每天购买次数
0：不限制
N：每天只能买N个
     */
    private Integer daybuycnt;

    /**
     * 品商是否上架
     */
    private Integer onsale;

    private Integer inuse;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

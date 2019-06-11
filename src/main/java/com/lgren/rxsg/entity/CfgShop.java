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
public class CfgShop extends Model<CfgShop> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 品商名称
     */
    private String name;

    private Integer gid;

    /**
     * 商品包含多少个道具
     */
    private Integer pack;

    /**
     * 商品价格
     */
    private Integer price;

    /**
     * 商品原价
     */
    private Integer oriprice;

    /**
     * 是否上架
     */
    private Integer onsale;

    /**
     * 该商品总量，买完为止
2000000000：表示不限
N表示限制N个
     */
    @TableField("totalCount")
    private Integer totalCount;

    private Integer userbuycnt;

    /**
     * 每天购买次数
0：不限制
N：每天只能买N个
     */
    private Integer daybuycnt;

    /**
     * 商城里道具出现的位置，按group分类后从小到大显示
     */
    private Integer position;

    private Integer group;

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
     * 商品上柜时间
     */
    private Integer starttime;

    /**
     * 商品撤下时间
2000000000：表示永久卖
其他表示具体时间
     */
    private Integer endtime;

    /**
     * 指定商品图片
0表示用道具图片
N表示指定N号商品图片
     */
    private Integer image;

    /**
     * 商品说明
     */
    private String description;

    private Integer battleshop;

    @TableField("creditPrice")
    private Integer creditPrice;

    @TableField("medalPrice")
    private Integer medalPrice;

    @TableField("medalTypeId")
    private Integer medalTypeId;

    @TableField("battleGoodsType")
    private Integer battleGoodsType;

    private Integer battledaybuycnt;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

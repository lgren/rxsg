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
public class CfgGoods extends Model<CfgGoods> {

    private static final long serialVersionUID = 1L;

    /**
     * 道具ID
500000以上表示自动生产的礼包
     */
    private Integer gid;

    /**
     * 名称
     */
    private String name;

    /**
     * 是否在使用中
     */
    private Integer inuse;

    private Integer battle;

    private Integer copperbox;

    private Integer silverbox;

    private Integer goldbox;

    private Integer woodbox;

    private Integer lovebean;

    private Integer value;

    /**
     * 0:宝物类
1:加速类
2:生产类
3:宝箱类
4:珠宝类
5:任务类
     */
    private Integer group;

    /**
     * 道具的图片
0：默认规则下的图片
N：pack_N.png
     */
    private Integer image;

    private String description;

    private Integer position;

    /**
     * 使用说明
     */
    private String useguide;

    private Integer treasurebox;

    /**
     * 能否在宝物界面直接使用
     */
    private Integer autouse;

    /**
     * 1:盔类, 2:甲类, 3:鞍类, 4:绳类, 5:脚类
     */
    private Integer zuojiType;

    /**
     * 等级
     */
    private Integer level;

    /**
     * 比如1,2,2,2 表示统帅+2 内政+2
     */
    private String attr;

    /**
     * 1:将领头像image=x对应hero_boy_x.jpg
     */
    private Integer imagetype;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

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
 * 玩家数据表
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "uid", type = IdType.AUTO)
    private Integer uid;

    private String name;

    /**
     * 通行证类型
     */
    private String passtype;

    private String passport;

    /**
     * 状态
0：正常玩家
1：新手玩家
2：免战玩家
3：刚注册没有建新城及玩家名
4：被人打完了需要重新建新城
5：锁定，不能登录
     */
    private Integer state;

    /**
     * 玩家组
0：一般玩家;
1：GM;
2：NPC;
     */
    private Integer group;

    private Integer sex;

    private Integer face;

    /**
     * 声望
     */
    private Double prestige;

    /**
     * 战争获得的声望
     */
    private Double warprestige;

    /**
     * 元宝数
     */
    private Integer money;

    /**
     * 排名
     */
    private Integer rank;

    private Integer lastcid;

    private Integer unionId;

    /**
     * ０表示普通成员，１表示盟主，２表示副盟主，３表示长老，４表示官员
     */
    private Integer unionPos;

    private Integer nobility;

    private Integer officepos;

    private String flagchar;

    private Integer regtime;

    private Integer domainid;

    private Integer warAttackPrestige;

    private Integer warDefencePrestige;

    private Integer gift;

    private Integer lastPay;

    private Integer honour;

    private Integer armorColumn;

    private Integer achivementCount;

    private Integer achivementPoint;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

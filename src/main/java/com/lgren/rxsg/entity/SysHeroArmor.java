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
public class SysHeroArmor extends Model<SysHeroArmor> {

    private static final long serialVersionUID = 1L;

    /**
     * 领将ID
     */
    private Integer hid;

    /**
     * 备装部件位置
10：头部
20：颈部
30：肩部
40：胸部
50：背部
60：腰部
70：手臂
80：脚部
90：手指
91：手指
100：饰品
101：饰品
110：武器
111：武器
112：武器
120：坐骑
     */
    private Integer spart;

    /**
     * 装备在sys_user_arm表里的序号，主要用在一个玩家有多个同样的装备的时候，区别哪个是给将领装备了的，哪个是还在包包里的
     */
    private Integer sid;

    /**
     * 装备ID
     */
    private Integer armorid;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}

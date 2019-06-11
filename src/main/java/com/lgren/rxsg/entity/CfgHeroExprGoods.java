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
public class CfgHeroExprGoods extends Model<CfgHeroExprGoods> {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    /**
     * 奖励类型1:普通道具，2:特殊道具，3:装备道具,4:基础属性,5:宝珠转换,6:强化装备,7:好感度
     */
    private Integer type;

    private String name;

    private Integer value;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

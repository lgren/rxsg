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
public class CfgAssembleSpecialHero extends Model<CfgAssembleSpecialHero> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 对应过关斩将精英难度楼层数
     */
    private Integer battleid;

    /**
     * 将领的品质，和君主将的修为匹配
     */
    private Integer type;

    private Integer rate;

    private Integer rewardid;

    private Integer rewardcount;

    /**
     * 当前刷出来的将领
     */
    private Integer isopen;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

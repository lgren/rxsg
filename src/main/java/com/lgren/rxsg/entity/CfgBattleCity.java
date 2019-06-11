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
public class CfgBattleCity extends Model<CfgBattleCity> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private Integer xy;

    private String nextxy;

    /**
     * 落掉哪种类型 1 宝物 2 装备 3 东西
     */
    private String drop;

    /**
     * 阵营ID
     */
    private Integer unionid;

    private Integer rate;

    private String name;

    private Integer image;

    private Integer winpoint;

    private Integer losepoint;

    private Integer position;

    private String reinforceSoldiers;

    private Integer canQuest;


    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}

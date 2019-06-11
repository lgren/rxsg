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
public class CfgBattleStartCity extends Model<CfgBattleStartCity> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private Integer xy;

    private String name;

    private Integer unionid;

    private Integer needhonour;


    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}

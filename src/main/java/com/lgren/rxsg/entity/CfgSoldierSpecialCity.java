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
public class CfgSoldierSpecialCity extends Model<CfgSoldierSpecialCity> {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    /**
     * 可造兵的兵种id
     */
    private Integer sid;

    /**
     * 所在州标记
     */
    private Integer province;

    /**
     * 1,州城;2,郡城;3,县城;0,活动城池
     */
    private Integer type;

    /**
     * 所在州的名称
     */
    private String provincename;

    /**
     * 0,表示定了，1表示随机。是不是兵种为随机
     */
    private String rsid;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}

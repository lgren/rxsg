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
public class CfgNpcHero extends Model<CfgNpcHero> {

    private static final long serialVersionUID = 1L;

    private Integer npcid;

    private Integer uid;

    private String name;

    private String zi;

    private Integer sex;

    private Integer face;

    private Integer affairsBase;

    private Integer braveryBase;

    private Integer wisdomBase;

    private Integer province;

    private String introduce;

    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.npcid;
    }

}

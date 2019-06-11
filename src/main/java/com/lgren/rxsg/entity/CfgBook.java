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
public class CfgBook extends Model<CfgBook> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    private Integer level;

    /**
     * 书对应的技能id
     */
    private Integer skill;

    private Integer attr;

    private String description;

    private Integer attrType;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class CfgPkBattle extends Model<CfgPkBattle> {

    private static final long serialVersionUID = 1L;

    /**
     * 战役编号
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 战役名称
     */
    private String battlename;

    /**
     * 君主将等级
     */
    private Integer heroLevel;

    /**
     * 修为等级
     */
    private Integer userLevel;

    private String description;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

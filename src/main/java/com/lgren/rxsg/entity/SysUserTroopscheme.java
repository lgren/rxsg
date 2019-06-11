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
public class SysUserTroopscheme extends Model<SysUserTroopscheme> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家
     */
    private Integer uid;

    /**
     * 方案类型，1：方案1、2：方案2
     */
    private Integer type;

    /**
     * 士兵，格式为
num:sid,cnt;sid,cnt....
     */
    private String soldiers;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

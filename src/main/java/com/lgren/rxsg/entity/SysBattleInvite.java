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
public class SysBattleInvite extends Model<SysBattleInvite> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer fromuid;

    private String battlename;

    private Integer battlefieldid;

    private Integer level;

    private Integer time;

    private Integer touid;

    private Integer state;

    private String fromname;

    private String toname;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

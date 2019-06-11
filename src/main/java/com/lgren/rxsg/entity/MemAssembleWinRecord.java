package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class MemAssembleWinRecord extends Model<MemAssembleWinRecord> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer fromuid;

    private Integer touid;

    /**
     * 连胜次数
     */
    private Integer times;

    /**
     * 防守方将领的修为等级
     */
    @TableField("rKingLevel")
    private Integer rKingLevel;

    /**
     * 最后一次挑战时间
     */
    private Integer lastChallengeTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

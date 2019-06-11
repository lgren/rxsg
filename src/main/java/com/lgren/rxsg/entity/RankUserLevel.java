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
public class RankUserLevel extends Model<RankUserLevel> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    private Integer uid;

    private String name;

    private String levelname;

    private String level;

    private String nobility;

    private Integer battle;

    private Integer prestige;

    private Integer heroLevel;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

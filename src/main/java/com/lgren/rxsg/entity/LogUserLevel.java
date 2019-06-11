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
public class LogUserLevel extends Model<LogUserLevel> {

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

    /**
     * 是否已经领奖，0未领奖，1已经领奖
     */
    private Integer reward;

    /**
     * 领取时间
     */
    private Integer time;

    private Integer heroLevel;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

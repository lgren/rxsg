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
public class MemManeuver extends Model<MemManeuver> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 状态
0：等待演习
1：演习结束
     */
    private Integer state;

    private Integer result;

    private Integer round;

    /**
     * num:sid,count,sid,count...
     */
    private String attacksoldiers;

    private String resistsoldiers;

    private String attackdie;

    private String resistdie;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

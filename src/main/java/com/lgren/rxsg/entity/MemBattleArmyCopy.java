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
public class MemBattleArmyCopy extends Model<MemBattleArmyCopy> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer tid;

    private Integer cid;

    private Integer sid;

    private Integer count;

    private String sidname;

    private Integer peopleNeed;

    /**
     * 0为士兵1为城防
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class CfgTaskReward extends Model<CfgTaskReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer tid;

    /**
     * 1:资源
2:宝物
3:军队
4:城防
5:任务物品
     */
    private Integer sort;

    /**
     * 资源是:
1黄金,
2粮食,
3木材,
4石料,
5铁锭,
6人口,
7民心,
8民怨,
9声望,
     */
    private Integer type;

    private Integer count;

    private String name;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

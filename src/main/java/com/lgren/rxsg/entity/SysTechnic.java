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
 * 玩家拥有的所有建筑

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysTechnic extends Model<SysTechnic> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户ID
     */
    private Integer uid;

    /**
     * 科技ID
     */
    private Integer tid;

    /**
     * 该科技的级别
     */
    private Integer level;

    /**
     * 在建的时候是哪个城在建的
     */
    private Integer cid;

    /**
     * 科技当前状态
0:正常状态
1:升级中

     */
    private Integer state;

    /**
     * 该科技状态开始时间
     */
    private Integer stateStarttime;

    /**
     * 该科技状态结束时间
     */
    private Integer stateEndtime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

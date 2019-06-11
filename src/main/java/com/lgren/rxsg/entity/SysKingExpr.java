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
 * 君主历练
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysKingExpr extends Model<SysKingExpr> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家
     */
    private Integer uid;

    /**
     * 城池
     */
    private Integer cid;

    /**
     * 将领
     */
    private Integer hid;

    /**
     * 历练类型,0寻访红颜
     */
    private Integer type;

    /**
     * 历练出发时间
     */
    private Integer starttime;

    /**
     * 历练结束时间
     */
    private Integer endtime;

    /**
     * 历练小时数
     */
    private Integer hours;

    /**
     * 累计加速次数
     */
    @TableField("accTimes")
    private Integer accTimes;

    /**
     * 0:历练过程中 1:返回途中
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

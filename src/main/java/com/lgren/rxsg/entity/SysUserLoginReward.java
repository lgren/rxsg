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
 * 用户登陆奖励

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserLoginReward extends Model<SysUserLoginReward> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 每日奖励类型
     */
    private Integer rewardtype;

    /**
     * 奖励生成日期
     */
    private String date;

    /**
     * 奖励生成时间
     */
    private Integer time;

    /**
     * 奖励领取时间
     */
    private Integer gettime;

    private Integer boxdetailId;

    private Integer goalId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

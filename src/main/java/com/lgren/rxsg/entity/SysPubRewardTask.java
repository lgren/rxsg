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
public class SysPubRewardTask extends Model<SysPubRewardTask> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 被悬赏的目标坐标
     */
    private Integer targetcid;

    /**
     * 被悬赏的城池
     */
    private String targetname;

    /**
     * 悬赏任务类型
     */
    private Integer type;

    /**
     * 任务目标
     */
    private Integer goal;

    private Integer endtime;

    private Integer money;

    /**
     * 少人多领取
     */
    private Integer number;

    /**
     * 0 未完成 1 完成
     */
    private Integer state;

    private Integer uid;

    /**
     * -1:无人完成
     */
    private Integer finishuid;

    private String todo;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

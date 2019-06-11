package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class SysUserAssemble extends Model<SysUserAssemble> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 当前排名
     */
    private Integer rank;

    /**
     * 今日已挑战次数
     */
    private Integer count;

    /**
     * 历史最高排名
     */
    private Integer maxrank;

    /**
     * 最高连胜记录
     */
    private Integer maxwin;

    /**
     * 下一次可挑战时间
     */
    private Integer nextChallengeTime;

    /**
     * 下一次可刷新时间
     */
    private Integer nextRefreshTime;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

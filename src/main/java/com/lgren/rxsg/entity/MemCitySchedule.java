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
public class MemCitySchedule extends Model<MemCitySchedule> {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    /**
     * 上次被占领时间
     */
    private Integer createTime;

    private Integer lastGovernTime;

    /**
     * 上次修改城名时间
     */
    private Integer lastChangeName;

    /**
     * 上次征收物资时间
     */
    private Integer lastLevyResource;

    /**
     * 上次安抚百姓时间
     */
    private Integer lastPacifyPeople;

    /**
     * 下一次天赐时间
     */
    private Integer nextGoodEvent;

    /**
     * 下一次天灾时间
     */
    private Integer nextBadEvent;

    private Integer lastResetRecruit;

    private Integer lastResetRumor;

    private Integer lastChangeArmy;

    /**
     * 被使用了妖言惑众之计的时间
     */
    private Integer lastTrickMorale;

    private Integer lastTrickWeiweijiuzhao;

    private Integer lastTrickChenhuodajie;

    /**
     * 被使用了十面埋伏之计的时间
     */
    private Integer lastTrickMaifu;

    /**
     * 使用安民告示时间
     */
    private Integer lastAnming;

    private Integer governCount;

    /**
     * 上次使用高级迁城时间
     */
    private Integer lastAdvMove;

    private Integer lastBeGovernTime;

    private Integer lastTrickFenshaoliangcao;

    private Integer lastTrickHudichouxin;

    /**
     * 最后一次被使用上屋抽梯的时间
     */
    private Integer lastTrickShangwuchouti;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}

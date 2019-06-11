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
public class MemUserSchedule extends Model<MemUserSchedule> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 每日送宝时间
     */
    private Integer lastDailyGift;

    private Integer startNewProtect;

    private Integer lastTrickWar;

    private Integer todayWarCount;

    private Integer lastResetSysTask;

    /**
     * 上次使用巧舌游说时间
     */
    private Integer lastPersuade;

    /**
     * 上次发布专属任务的武将id
     */
    private Integer lastReleaseHero;

    private Integer lastlogingif;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

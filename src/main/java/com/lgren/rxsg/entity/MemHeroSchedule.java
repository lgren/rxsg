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
public class MemHeroSchedule extends Model<MemHeroSchedule> {

    private static final long serialVersionUID = 1L;

    private Integer hid;

    private Integer lastLargess;

    /**
     * 上次中挑拨离间的时间
     */
    private Integer lastTrick;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}

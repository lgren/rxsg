package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 流亡将领
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class MemHeroExile extends Model<MemHeroExile> {

    private static final long serialVersionUID = 1L;

    private Integer hid;

    private Integer uid;

    /**
     * 忠诚
     */
    private Integer loyalty;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}

package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDateTime;
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
public class SysUserChibiState extends Model<SysUserChibiState> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer battlefieldid;

    private Integer honour;

    private Integer bid;

    private Integer unionid;

    private Integer startcid;

    private Integer level;

    /**
     * 加入时间
     */
    private LocalDateTime jointime;

    private Integer sentTroopCount;

    private Integer state;

    private Integer inCrossBattle;

    private String inBattleHids;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

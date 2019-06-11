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
public class BakSysUserBattleState extends Model<BakSysUserBattleState> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer battlefieldid;

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

    private Integer attackWinScore;

    private Integer finishTaskScore;

    private Integer killEnemyNo;

    private Integer beKilledNo;

    private Integer quittime;

    private Integer iswinner;

    /**
     * 在这个跨服战场中得到的总积分
     */
    private Integer gainedScore;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

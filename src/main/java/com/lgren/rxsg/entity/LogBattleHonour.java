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
public class LogBattleHonour extends Model<LogBattleHonour> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer battlefieldid;

    private Integer honour;

    private Integer starttime;

    private Integer battleid;

    /**
     * 完成时间
     */
    private Integer finishtime;

    /**
     * 0 胜利 1 失败 2 中途退出
     */
    private Integer result;

    private Integer quittime;

    private Integer metal;

    private Integer unionid;

    private Integer level;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

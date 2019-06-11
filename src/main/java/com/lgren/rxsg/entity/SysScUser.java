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
public class SysScUser extends Model<SysScUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    /**
     * 玩家沙场的积分
     */
    private Integer point;

    /**
     * 还有多少场pk可以玩，玩完了用道具置0
     */
    private Integer remain;

    /**
     * 天当赢才场数
     */
    private Integer win;

    /**
     * 历史积分
     */
    private Integer totalPoint;

    /**
     * 历史胜利场数
     */
    private Integer totalWin;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

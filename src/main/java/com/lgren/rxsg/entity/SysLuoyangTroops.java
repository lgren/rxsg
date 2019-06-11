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
public class SysLuoyangTroops extends Model<SysLuoyangTroops> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家
     */
    private Integer uid;

    /**
     * 城池
     */
    private Integer cid;

    /**
     * 将领
     */
    private Integer hid;

    /**
     * 目标地点
     */
    private Integer targetcid;

    private Integer state;

    /**
     * 出发时间
     */
    private Integer starttime;

    private Integer pathtime;

    /**
     * 结束时间
     */
    private Integer endtime;

    /**
     * 士兵，格式为
num:sid,cnt;sid,cnt....
     */
    private String soldiers;

    /**
     * 发生战斗时的战斗ＩＤ
     */
    private Integer battleid;

    private Integer startcid;

    private Integer unionid;

    private Integer lastcc;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class SysUserBattleField extends Model<SysUserBattleField> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 战场id
     */
    private Integer bid;

    private Integer createuid;

    private Integer level;

    private Integer maxpeople;

    /**
     * 0:正常开启 1:冻结 2:准备 3:关闭
     */
    private Integer state;

    private Integer starttime;

    private Integer endtime;

    private Integer finishtime;

    private Integer type;

    private Integer minpeople;

    private Integer winner;

    private Integer progress;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

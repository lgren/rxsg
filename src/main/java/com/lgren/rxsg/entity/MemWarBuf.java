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
public class MemWarBuf extends Model<MemWarBuf> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家ID
     */
    private Integer uid;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * 战场ID
     */
    private Integer battleid;

    /**
     * 战场联盟ID
     */
    private Integer unionid;

    /**
     * 玩家状态
     */
    private Integer state;

    private Integer updatetime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

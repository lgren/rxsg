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
public class SysTicket extends Model<SysTicket> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 礼券码
     */
    private String code;

    /**
     * 礼券内容ID，对应sys_ticket_content表的id
     */
    private Integer contentid;

    /**
     * 使用这个礼券的玩家
     */
    private Integer uid;

    /**
     * 使用时间
     */
    private Integer time;

    /**
     * 礼券绑定的UID
     */
    private Integer binduid;

    /**
     * 礼券码发放时间
     */
    private Integer givetime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

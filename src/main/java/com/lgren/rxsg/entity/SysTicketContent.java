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
public class SysTicketContent extends Model<SysTicketContent> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 礼券内容,gift_cnt,type,id,cnt,type,id,cnt,type,id,cnt.....(type:1道具(id=0表示元宝)、2装备、3任务物品,id表示道具或装备或任务物品的ID，cnt表示个数)
     */
    private String content;

    /**
     * 礼券组合的名字
     */
    private String name;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

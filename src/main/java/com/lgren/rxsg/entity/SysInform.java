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
public class SysInform extends Model<SysInform> {

    private static final long serialVersionUID = 1L;

    /**
     * 息消ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 息消ID，0表示在聊天框里的公告，1表示飘动公告
     */
    private Integer type;

    /**
     * 是否开启，0表示未开启，1表示开启
     */
    private Integer inuse;

    /**
     * 公告开始滚动时间
     */
    private Integer starttime;

    /**
     *  公告停止滚动时间
     */
    private Integer endtime;

    /**
     * 隔间时间
     */
    private Integer interval;

    /**
     * 动滚次数
     */
    private Integer scrollcount;

    /**
     * 公告颜色
     */
    private Integer color;

    /**
     * 消息内容
     */
    private String msg;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

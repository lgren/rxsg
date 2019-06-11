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
public class SysMailSysBox extends Model<SysMailSysBox> {

    private static final long serialVersionUID = 1L;

    /**
     * 信件ID
     */
    @TableId(value = "mid", type = IdType.AUTO)
    private Integer mid;

    /**
     * 玩家UID
     */
    private Integer uid;

    /**
     * 信件内容ID
     */
    private Integer contentid;

    /**
     * 信件标题
     */
    private String title;

    /**
     * 是否已读，０表示未读，１表示已读
     */
    private Integer read;

    /**
     * 信件发送时间
     */
    private Integer posttime;


    @Override
    protected Serializable pkVal() {
        return this.mid;
    }

}

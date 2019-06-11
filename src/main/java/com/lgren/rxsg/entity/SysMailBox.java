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
public class SysMailBox extends Model<SysMailBox> {

    private static final long serialVersionUID = 1L;

    /**
     * 件信ID
     */
    @TableId(value = "mid", type = IdType.AUTO)
    private Integer mid;

    /**
     * 发信人UID
     */
    private Integer uid;

    /**
     * 收信人名称
     */
    private String name;

    /**
     * 发件人UID
     */
    private Integer fromuid;

    /**
     * 发件人名字
     */
    private String fromname;

    /**
     * 信件标题
     */
    private String title;

    /**
     * 信件内容ID
     */
    private Integer contentid;

    /**
     * 信件状态，０表示未读，１表示已读
     */
    private Integer read;

    /**
     * 收件人看到的信件删除状态，０表示可见，１表示删除
     */
    private Integer recvstate;

    /**
     * 发件人看到的信件删除状态，０表示可见，１表示删除
     */
    private Integer sendstate;

    /**
     * 信件发送时间
     */
    private Integer posttime;

    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.mid;
    }

}

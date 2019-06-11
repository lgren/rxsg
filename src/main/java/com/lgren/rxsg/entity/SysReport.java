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
public class SysReport extends Model<SysReport> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * UID
     */
    private Integer uid;

    /**
     * 出发地
     */
    private Integer origincid;

    private String origincity;

    /**
     * 发生地
     */
    private Integer happencid;

    private String happencity;

    /**
     * 主题索引
     */
    private Integer title;

    /**
     * 战报分类
     */
    private Integer type;

    /**
     * 发送时间
     */
    private Integer time;

    /**
     * 已读状态
     */
    private Integer read;

    /**
     * 战斗ID
     */
    private Integer battleid;

    /**
     * 报告内容
     */
    private String content;

    private Integer state;

    private Integer fromBattlenet;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

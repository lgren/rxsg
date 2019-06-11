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
public class SysUnion extends Model<SysUnion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 联盟名称
     */
    private String name;

    /**
     * 盟主UID
     */
    private Integer leader;

    private Integer creator;

    /**
     * 成员数
     */
    private Integer member;

    /**
     * 排名
     */
    private Integer rank;

    /**
     * 联盟声望
     */
    private Integer prestige;

    /**
     * 联盟介绍
     */
    private String intro;

    /**
     * 联盟公告
     */
    private String announcement;

    private Integer chieforder;

    /**
     * 建立时间
     */
    private Integer createtime;

    /**
     * 联盟活动期间总充值
     */
    private Integer actmoney;

    /**
     * SNS平台推送标志
     */
    private Integer snsFlag;

    private Integer donate;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

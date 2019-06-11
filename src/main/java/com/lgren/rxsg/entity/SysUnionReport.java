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
public class SysUnionReport extends Model<SysUnionReport> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 1：进攻，2：防御
     */
    private Integer type;

    /**
     * 己方联盟
     */
    private Integer unionid;

    /**
     * 对方联盟
     */
    private String enemy;

    private Integer origincid;

    private String origincity;

    private Integer happencid;

    private String happencity;

    /**
     * 发生时间
     */
    private Integer time;

    private String description;

    private String content;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

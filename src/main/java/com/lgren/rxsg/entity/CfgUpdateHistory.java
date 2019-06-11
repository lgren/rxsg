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
public class CfgUpdateHistory extends Model<CfgUpdateHistory> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 新更时间
     */
    private Integer time;

    /**
     * 更新提要
     */
    private String title;

    /**
     * 更新具体内容
     */
    private String detail;

    /**
     * 版本号
     */
    private String version;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

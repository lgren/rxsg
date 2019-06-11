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
public class SysUnionMark extends Model<SysUnionMark> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 联盟id
     */
    private Integer unionid;

    /**
     * cid
     */
    private Integer cid;

    /**
     * wid
     */
    private Integer wid;

    /**
     * 结束时间
     */
    private Integer endtime;

    /**
     * 标记类型
     */
    private Integer type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class MemUnionRelation extends Model<MemUnionRelation> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 关系：0：友好，2：敌对
     */
    private Integer type;

    /**
     * 己方联盟
     */
    private Integer unionid;

    /**
     * 目标联盟
     */
    private Integer target;

    /**
     * 上次申请时间
     */
    private Integer time;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

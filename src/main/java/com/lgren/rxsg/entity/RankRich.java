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
public class RankRich extends Model<RankRich> {

    private static final long serialVersionUID = 1L;

    private Integer total;

    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    private String name;

    private String unionname;

    private Integer day;

    private Integer month;

    private Integer uid;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

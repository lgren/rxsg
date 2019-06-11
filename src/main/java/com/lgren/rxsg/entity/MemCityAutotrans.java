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
public class MemCityAutotrans extends Model<MemCityAutotrans> {

    private static final long serialVersionUID = 1L;

    private Integer fromcid;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer tocid;

    private Integer state;

    private Integer resType;

    private Integer count;

    private Integer transType;

    private Integer uid;

    private Integer startTime;

    private Double distance;

    private Integer endTime;

    private Integer costTime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

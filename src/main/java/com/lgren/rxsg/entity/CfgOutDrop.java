package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
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
public class CfgOutDrop extends Model<CfgOutDrop> {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    /**
     * 品物掉落的概率
     */
    private Integer rate;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

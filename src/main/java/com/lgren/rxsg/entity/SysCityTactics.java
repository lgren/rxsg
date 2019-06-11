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
public class SysCityTactics extends Model<SysCityTactics> {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    private String deplunderJoin;

    private String deplunder;

    private String depatrolJoin;

    private String depatrol;

    private String deinvadeJoin;

    private String deinvade;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}

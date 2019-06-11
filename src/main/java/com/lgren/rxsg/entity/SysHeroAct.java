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
public class SysHeroAct extends Model<SysHeroAct> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer hid;

    private String name;

    /**
     * 0，专属任务；1，任命；2，招降；3，公共任务
     */
    private Integer state;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

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
public class MemUserSystaskNum extends Model<MemUserSystaskNum> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 玩家一天刷新的随机任务次数
     */
    private Integer count;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

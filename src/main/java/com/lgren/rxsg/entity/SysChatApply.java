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
public class SysChatApply extends Model<SysChatApply> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    /**
     * 玩家名字
     */
    private String name;

    /**
     * 申请时间
     */
    private Integer time;

    /**
     * 0:未处理
1:正在处理
2:处理完毕
     */
    private Integer status;

    /**
     * 题问内容
     */
    private String content;

    private Integer admid;

    /**
     * 处理该请求的GM
     */
    private String admname;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

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
public class LogAdmin extends Model<LogAdmin> {

    private static final long serialVersionUID = 1L;

    /**
     * 管理员ID
     */
    private Integer uid;

    /**
     * 目标ID,可能是用户UID,也可能是其他ID，跟op相关
     */
    private Integer target;

    /**
     * 操作, ０表示登录，１表示下线，２表示查看联盟聊天，３表示关闭联盟聊天，４表示添加屏蔽字，５表示取消屏蔽字，６表示对玩家禁言，７表示对玩家解禁，８管理员发言
     */
    private Integer op;

    private Integer time;

    /**
     * 释注
     */
    private String remark;

    /**
     * 作操理由
     */
    private String reason;


    @Override
    protected Serializable pkVal() {
        return null;
    }

}

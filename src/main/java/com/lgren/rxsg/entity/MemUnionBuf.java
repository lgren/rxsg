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
public class MemUnionBuf extends Model<MemUnionBuf> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 玩家ID
     */
    private Integer uid;

    /**
     * 用户昵称
     */
    private String nick;

    /**
     * 盟联ID
     */
    private Integer unionId;

    /**
     * 玩家状态，０表示退出联盟，１表示加入联盟,
     */
    private Integer state;

    /**
     * 记录插入时间
     */
    private Integer updatetime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

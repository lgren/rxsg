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
public class AdmUser extends Model<AdmUser> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "userid", type = IdType.AUTO)
    private Integer userid;

    /**
     * 用户组
     */
    private Integer group;

    private String username;

    private String pwd;

    /**
     * 理管员名称
     */
    private String nick;

    private Integer isUnin;


    @Override
    protected Serializable pkVal() {
        return this.userid;
    }

}

package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 记录进入过该服务器的用户的来源信息
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysUserComming extends Model<SysUserComming> {

    private static final long serialVersionUID = 1L;

    private Integer uid;

    private Integer siteId;

    private String pageId;

    private String subPageId;


    @Override
    protected Serializable pkVal() {
        return this.uid;
    }

}

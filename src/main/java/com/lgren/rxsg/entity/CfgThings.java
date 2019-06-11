package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.TableField;
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
public class CfgThings extends Model<CfgThings> {

    private static final long serialVersionUID = 1L;

    private Integer tid;

    private String name;

    /**
     * 是否开启使用
     */
    private Integer inuse;

    private Integer position;

    /**
     * 物品的图像，０表示用thing_tid，其他表示画像
     */
    private Integer image;

    private String description;

    @TableField("battleBelong")
    private Integer battleBelong;


    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

}

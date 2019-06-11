package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 引导

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgGuide extends Model<CfgGuide> {

    private static final long serialVersionUID = 1L;

    private Integer gid;

    /**
     * 引导类别
     */
    private Integer group;

    private Integer pregid;

    private String name;

    /**
     * 引导提示内容
     */
    private String content;

    /**
     * 触发条件 1：使用某个宝箱时
     */
    private Integer triggertype;

    /**
     * 消失条件详细设置 disType=1,内容：leftTopX,leftTopY,width,height 
     */
    private String triggerdetails;

    /**
     * 显示的位置D,X,Y表示方向,X坐标,Y坐标,D: 1向上 2，向右，3向下，4向左
     */
    private String showpos;

    /**
     * 消失类型 1：点击界面上的方形区域时
     */
    private Integer distype;

    /**
     * 消失条件详细设置 disType=1,内容：leftTopX,leftTopY,width,height 
     */
    private String disdetails;


    @Override
    protected Serializable pkVal() {
        return this.gid;
    }

}

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
public class SysUnionEvent extends Model<SysUnionEvent> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 盟联ID
     */
    private Integer unionid;

    /**
     * 事件类型
０加入联盟
１退出联盟
２开除成员
３转让盟主
４联盟改名
５友好关系
６中立关系
７敌对关系
８宣战
９权限更改
１０辞职
     */
    private Integer type;

    /**
     * 事件描述
     */
    private String content;

    /**
     * 发生时间
     */
    private Integer evttime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class CfgRumorThing extends Model<CfgRumorThing> {

    private static final long serialVersionUID = 1L;

    private Integer tid;

    /**
     * 消息类型
0：一般物品，没有详细介绍
1：全服只有一个在刷的物品，和将领一样
2：特定物品，有介绍和详细描述
     */
    private Integer type;

    private Integer price;

    private String introduce;

    private String detail;


    @Override
    protected Serializable pkVal() {
        return this.tid;
    }

}

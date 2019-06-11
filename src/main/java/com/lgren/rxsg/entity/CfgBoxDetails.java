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
public class CfgBoxDetails extends Model<CfgBoxDetails> {

    private static final long serialVersionUID = 1L;

    /**
     * 0:对应cfg_goods
     */
    private Integer srctype;

    /**
     * srctype=0时道具ID, 对应cfg_goods中的gid，srctype=1时,对应cfg_act对应宝藏开出的id
     */
    private Integer srcid;

    /**
     * 1:资源
2:宝物
3:军队
4:城防
5:任务物品
6:装备
     */
    private Integer sort;

    private Integer type;

    private Integer count;

    /**
     * 如果是联盟充值活动则为金额标准
     */
    private Integer rate;

    /**
     * 0:表示不发通知 1：发通知
     */
    private Integer inform;

    private Integer dayopencount;

    private Integer totalopencount;

    private Integer owncount;

    private Integer id;

    private String name;

    private Integer temp;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

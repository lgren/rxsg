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
 * 用户登陆奖励条件

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CfgLoginRewardGoal extends Model<CfgLoginRewardGoal> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 每日奖励类型
     */
    private Integer rewardtype;

    private String name;

    /**
     * 0:其它
1:资源
2:宝物
3:军队
4:城防
5:任务物品
6:建造建筑
7:升级科技
     */
    private Integer sort;

    private Integer type;

    private Integer count;

    private Integer reduce;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

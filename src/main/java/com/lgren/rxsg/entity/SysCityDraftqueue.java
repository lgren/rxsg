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
 * 玩家拥有的所有建筑

 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCityDraftqueue extends Model<SysCityDraftqueue> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 城市ID,也就是城市的位置
     */
    private Integer cid;

    /**
     * 建筑位置
编码方式是 (城内?1:0)*10000 + x * 100 + y
     */
    private Integer xy;

    /**
     * 士兵ID
     */
    private Integer sid;

    /**
     * 个数
     */
    private Integer count;

    /**
     * 开始排队的时间，按这个时间顺序建设
     */
    private Integer queuetime;

    /**
     * 是否正在征兵中
     */
    private Integer state;

    private Integer draftInterval;

    /**
     * 征兵开始时间
     */
    private Integer stateStarttime;

    /**
     * 这个队列需要的时间
     */
    private Integer needtime;

    /**
     * 速加标记
     */
    private Integer accmark;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

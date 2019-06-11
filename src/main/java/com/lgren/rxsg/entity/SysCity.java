package com.lgren.rxsg.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 玩家拥有的所有城市
 * </p>
 *
 * @author Lgren
 * @since 2019-05-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysCity extends Model<SysCity> {

    private static final long serialVersionUID = 1L;

    /**
     * 城池ID
     */
    private Integer cid;

    private Integer uid;

    /**
     * 城池名
     */
    private String name;

    /**
     * 类型
0:玩家城池
1:名城
2:郡城
3:州城
4:都城
5:玩家主城
     */
    private Integer type;

    /**
     * 城池状态
0：正常;1：新手保护;
2：免战;3：休假
     */
    private Integer state;

    private Integer chiefhid;

    /**
     * 州
     */
    private Integer province;

    private Integer discardtime;

    private Integer counsellorid;

    private Integer generalid;

    /**
     * 否是可以募兵，0表示不可以，1表示可以，大于2，最后招募时间
     */
    private Integer conscript;

    private Integer isSpecial;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}

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
public class MemWorld extends Model<MemWorld> {

    private static final long serialVersionUID = 1L;

    private Integer wid;

    /**
     * 格子地型：
0:城池;
1:平地;
2:沙漠;
3:森林;
4:草地;
5:高山;
6:湖泊;
7:沼泽;

     */
    private Integer type;

    /**
     * 归属城池,0代表野地
     */
    private Integer ownercid;

    /**
     * 当前地点状态
0:和平
1:战乱
     */
    private Integer state;

    /**
     * 级别
     */
    private Integer level;

    private Integer maxlevel;

    private Integer updatetime;

    /**
     * 州
     */
    private Integer province;

    private Integer jun;


    @Override
    protected Serializable pkVal() {
        return this.wid;
    }

}

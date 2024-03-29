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
public class CfgBattleUnion extends Model<CfgBattleUnion> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private Integer unionid;

    private String name;

    private String flag;

    private String taskgroup;

    private String initTasks;

    private Integer metalGid;

    private String taskthing;


    @Override
    protected Serializable pkVal() {
        return this.unionid;
    }

}

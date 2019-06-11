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
public class CfgBattleEvent extends Model<CfgBattleEvent> {

    private static final long serialVersionUID = 1L;

    /**
     * 触发者ID 可以是 军队 或者 据点
     */
    private Integer triggerid;

    /**
     * 0 军队完成任务 1 据点完成任务 2 军队触发我方任务  3 据点触发敌方任务 4 触发军队重生时间
     */
    private Integer triggertype;

    private Integer targetid1;

    private Integer unionid;

    private Integer targettype;

    private Integer bid;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String msg;

    private Integer targetid2;

    private Integer triggercount;

    private Integer targettype2;

    private String targetid1Option;

    private String targetid2Option;

    private String failMsg;

    private Integer dialogInform;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class AdmLog extends Model<AdmLog> {

    private static final long serialVersionUID = 1L;

    private String admName;

    /**
     * apply_yuanbao：申请元宝；verify_yuanbao：审核元宝；make_liquan：生成礼券；send_mesg：发送系统信件
     */
    private String opration;

    private String oprationContent;

    private Integer oprateTime;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

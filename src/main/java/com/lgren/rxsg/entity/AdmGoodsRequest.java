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
public class AdmGoodsRequest extends Model<AdmGoodsRequest> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer count;

    private Integer time;

    private String reason;

    private Integer adminid;

    /**
     * 0:请求中
1:已经处理
2:取消
     */
    private Integer state;

    private String mesgContent;

    private String mesgTitle;

    private Integer gid;

    private String name;

    private String type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

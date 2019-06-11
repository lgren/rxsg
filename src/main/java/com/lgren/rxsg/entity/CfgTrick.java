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
public class CfgTrick extends Model<CfgTrick> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String name;

    /**
     * 使用方式
0：对本城
1：对敌城
2：本人军队
3：敌人军队
     */
    private Integer usetype;

    /**
     * 锦囊使用数量
     */
    private Integer cost;

    private String description;

    private String manual;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

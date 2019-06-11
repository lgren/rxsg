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
public class CfgXilian extends Model<CfgXilian> {

    private static final long serialVersionUID = 1L;

    private Integer id;

    /**
     * 该兵种可洗练出的属性,0生命，1攻击，2防御，3射程，4速度，5负重
     */
    private String property;

    private String name;

    /**
     * a,b  a：1defence，2soldier   b：did或sid
     */
    private String type;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

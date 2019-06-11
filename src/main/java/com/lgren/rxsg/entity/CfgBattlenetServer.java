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
public class CfgBattlenetServer extends Model<CfgBattlenetServer> {

    private static final long serialVersionUID = 1L;

    private Integer bid;

    private String url;

    private Integer chatport;

    private String chathost;

    private String neturl;


    @Override
    protected Serializable pkVal() {
        return this.bid;
    }

}

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
public class SysCityTrade extends Model<SysCityTrade> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer cid;

    /**
     * 当前状态：0:wait; 1:onway
     */
    private Integer state;

    /**
     * 资源类型：0=>food;1=>wood;2=>rock;3=>iron
     */
    private Integer restype;

    private Double count;

    private Double price;

    private Double gold;

    private Double distance;

    private Integer endtime;

    private Integer buycid;

    /**
     * 允许买的联盟
0表示所有人都可以买
非０表示只能该盟的人买
     */
    private Integer unionid;

    /**
     * 交易上限时间
     */
    private Integer limittime;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

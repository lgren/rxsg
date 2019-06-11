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
public class MemCityBuffer extends Model<MemCityBuffer> {

    private static final long serialVersionUID = 1L;

    private Integer cid;

    /**
     * 类型：
1:草木皆兵
2:空城计
3:抛砖引玉
4:坚壁清野
5:暗度陈仓
8:十面埋伏
     */
    private Integer buftype;

    private Integer bufparam;

    private Integer endtime;


    @Override
    protected Serializable pkVal() {
        return this.cid;
    }

}

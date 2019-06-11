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
public class MemHeroBuffer extends Model<MemHeroBuffer> {

    private static final long serialVersionUID = 1L;

    private Integer hid;

    /**
     * 1：虎符
2：文曲星符
3：武曲星符
4：智多星符 
5:武魂 
     */
    private Integer buftype;

    private Integer endtime;

    private Integer bufparam;


    @Override
    protected Serializable pkVal() {
        return this.hid;
    }

}

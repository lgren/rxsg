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
public class RankQinwangUnion extends Model<RankQinwangUnion> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "rank", type = IdType.AUTO)
    private Integer rank;

    /**
     * 盟联ID
     */
    private Integer unionid;

    /**
     * 联盟名字
     */
    private String name;

    /**
     * 盟主
     */
    private String leader;

    /**
     * 军功册数量
     */
    private Integer jungong;

    /**
     * 捐献薄
     */
    private Integer juanxian;

    /**
     * 勤王诏
     */
    private Integer qinwang;

    /**
     * 贡品录
     */
    private Integer gongpin;


    @Override
    protected Serializable pkVal() {
        return this.rank;
    }

}

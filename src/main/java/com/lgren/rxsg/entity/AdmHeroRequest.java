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
public class AdmHeroRequest extends Model<AdmHeroRequest> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer uid;

    private Integer cid;

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

    private String heroName;

    private Integer heroLevel;

    private Integer heroSex;

    private Integer heroFace;

    private Integer affairsBase;

    private Integer braveryBase;

    private Integer wisdomBase;

    private Integer loyalty;

    private Integer affairsAdd;

    private Integer braveryAdd;

    private Integer wisdomAdd;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}

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
public class HuangjinTaskLog extends Model<HuangjinTaskLog> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    private Integer uid;

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
        return this.uid;
    }

}

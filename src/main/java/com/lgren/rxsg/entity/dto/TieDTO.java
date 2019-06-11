package com.lgren.rxsg.entity.dto;

import com.lgren.rxsg.controller.validatorGroup.GroupEdit;
import com.lgren.rxsg.entity.CfgTie;
import com.lgren.rxsg.entity.CfgTieAttribute;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @author lgren
 * @create 2019-05-25 14:11
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class TieDTO extends CfgTie {
    @NotNull(message = "套装ID不能为空", groups = GroupEdit.class)
    private Integer tieid;
    @NotBlank(message = "套装名称不能为空!")
    @Pattern(regexp = "^.*套装$", message = "必须以套装收尾!")
    private String name;
    @NotNull
    @Range(min = 1, max = 16, message = "套装总数在1-16之间!")
    private Integer count;
    @Size(min = 1, max = 16, message = "具体属性个数在1-16之间!")
    private List<CfgTieAttribute> tieAttrList;
}

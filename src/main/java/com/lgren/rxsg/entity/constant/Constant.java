package com.lgren.rxsg.entity.constant;

import com.google.common.collect.ImmutableMap;
import com.lgren.rxsg.entity.CfgAttribute;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO
 * @author lgren
 * @create 2019-06-13 11:18
 **/
public class Constant {
    public static final Map<Integer, List<CfgAttribute>> ARMOR_ATTR_MAP = new HashMap<>(4);

    public static final Map<Integer, String> PART_MAP = ImmutableMap.<Integer, String>builder()
            .put(1, "头部")
            .put(2, "颈部")
            .put(3, "肩部")
            .put(4, "胸部")
            .put(5, "背部")
            .put(6, "腰部")
            .put(7, "手臂")
            .put(8, "脚部")
            .put(9, "手指")
            .put(10, "饰品")
            .put(11, "武器")
            .put(12, "坐骑").build();
}

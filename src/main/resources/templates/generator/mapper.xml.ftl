<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${package.Mapper}.${table.mapperName}">

<#if enableCache>
    <!-- 开启二级缓存 -->
    <cache type="org.mybatis.caches.ehcache.LoggingEhcache"/>

</#if>
<#if baseResultMap>
    <!-- 通用查询映射结果 -->
    <resultMap id="ResultMap" type="${package.Entity}.${entity}Domain">
<#list table.fields as field>
<#if field.keyFlag><#--生成主键排在第一位-->

    <id column="${field.name}" property="${field.propertyName}" /><#if (field.comment)??><!--${field.comment}--></#if>
</#if>
</#list>
<#list table.commonFields as field><#--生成公共字段 -->
    <result column="${field.name}" property="${field.propertyName}" /><#if (field.comment)??><!--${field.comment}--></#if>
</#list>
<#list table.fields as field>
<#if !field.keyFlag><#--生成普通字段 -->
    <result column="${field.name}" property="${field.propertyName}" /><#if (field.comment)??><!--${field.comment}--></#if>
</#if>
</#list>
    </resultMap>

</#if>
<#if baseColumnList>
    <!-- 通用查询结果列 -->
    <sql id="fields">
<#list table.commonFields as field>
        a.${field.name},
</#list>
        a.${table.fieldNames}
    </sql>

</#if>
    <sql id="table">
        ${table.name} a
    </sql>
</mapper>

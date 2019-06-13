<?xml version="1.0" encoding="UTF-8" standalone="no"?>
<!DOCTYPE sqlMap PUBLIC "-//iBATIS.com//DTD SQL Map 2.0//EN" "http://www.ibatis.com/dtd/sql-map-2.dtd">
<#--<mapper namespace="${package.Mapper}.${table.mapperName}">-->
<!-- ${table.comment!} -->
<sqlMap namespace="${table.name}">

<#if enableCache>
    <!-- 开启二级缓存 -->
    <cache type="org.mybatis.caches.ehcache.LoggingEhcache"/>

</#if>
<#--<#if baseResultMap>-->
    <#--<!-- 通用查询映射结果 &ndash;&gt;-->
    <#--<resultMap id="ResultMap" class="${package.Entity}.${entity}Domain">-->
<#--<#list table.fields as field>-->
<#--<#if field.keyFlag>&lt;#&ndash;生成主键排在第一位&ndash;&gt;-->
    <#--<result column="${field.name}" property="${field.propertyName}" /><#if (field.comment)??><!--${field.comment}&ndash;&gt;</#if>-->
<#--</#if>-->
<#--</#list>-->
<#--<#list table.commonFields as field>&lt;#&ndash;生成公共字段 &ndash;&gt;-->
    <#--<result column="${field.name}" property="${field.propertyName}" /><#if (field.comment)??><!--${field.comment}&ndash;&gt;</#if>-->
<#--</#list>-->
<#--<#list table.fields as field>-->
<#--<#if !field.keyFlag>&lt;#&ndash;生成普通字段 &ndash;&gt;-->
    <#--<result column="${field.name}" property="${field.propertyName}" /><#if (field.comment)??><!--${field.comment}&ndash;&gt;</#if>-->
<#--</#if>-->
<#--</#list>-->
    <#--</resultMap>-->

<#--</#if>-->
<#if baseColumnList>
    <!-- 通用查询结果列 -->
    <sql id="fields">
<#list table.commonFields as field>
        ${field.name},
</#list>
    ${table.fieldNames}
    </sql>

    <sql id="select_fields">
<#list table.commonFields as field>
        a.${field.name} AS ${field.propertyName}, <#if (field.comment)??><!--${field.comment}--></#if>
</#list>
<#list table.fields as field>
        a.${field.name} AS ${field.propertyName}<#if field_has_next>,<#else> </#if> <#if (field.comment)??><!--${field.comment}--></#if>
</#list>
    </sql>

</#if>
    <sql id="table">
        ${table.name} a
    </sql>

    <select id="list" resultClass="${package.Entity}.${entity}Domain">
        SELECT <include refid="select_fields"/>
        FROM <include refid="table"/>
        WHERE 1 = 1
        <#list table.commonFields as field>
        <isNotEmpty prepend="AND" property="${field.propertyName}"> <#if (field.comment)??><!--${field.comment}--></#if>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            a.${field.name} = to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")
            <#else>
            a.${field.name} = #${field.propertyName}#
            </#if>
        </isNotEmpty>
        </#list>
        <#list table.fields as field>
        <isNotEmpty prepend="AND" property="${field.propertyName}"> <#if (field.comment)??><!--${field.comment}--></#if>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            a.${field.name} = to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")
            <#else>
            a.${field.name} = #${field.propertyName}#
            </#if>
        </isNotEmpty>
        </#list>
    </select>

    <select id="get" parameterClass="map" resultClass="java.util.HashMap">
        SELECT <include refid="select_fields"/>
        FROM <include refid="table"/>
        WHERE 1 = 1
        <#list table.commonFields as field>
        <isNotEmpty prepend="AND" property="${field.propertyName}"> <#if (field.comment)??><!--${field.comment}--></#if>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            a.${field.name} = to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")
            <#else>
            a.${field.name} = #${field.propertyName}#
            </#if>
        </isNotEmpty>
        </#list>
        <#list table.fields as field>
        <isNotEmpty prepend="AND" property="${field.propertyName}"> <#if (field.comment)??><!--${field.comment}--></#if>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            a.${field.name} = to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")
            <#else>
            a.${field.name} = #${field.propertyName}#
            </#if>
        </isNotEmpty>
        </#list>
    </select>

    <insert id="insert" parameterClass="map">
        INSERT INTO <include refid="table"/> (
        <include refid="fields"/>
        )VALUES(
        <#list table.commonFields as field>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")<#if field_has_next>,<#else> </#if> <#if (field.comment)??><!--${field.comment}--></#if>
            <#else>
            #${field.propertyName}#<#if field_has_next>,<#else> </#if> <#if (field.comment)??><!--${field.comment}--></#if>
            </#if>
        </#list>
        <#list table.fields as field>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")<#if field_has_next>,<#else> </#if> <#if (field.comment)??><!--${field.comment}--></#if>
            <#else>
            #${field.propertyName}#<#if field_has_next>,<#else> </#if> <#if (field.comment)??><!--${field.comment}--></#if>
            </#if>
        </#list>
        )
    </insert>

    <delete id="deleteById" parameterClass="java.lang.String">
        delete from <include refid="table"/>
        <#list table.fields as field>
        <#if field.keyFlag><#--生成主键排在第一位-->
        where a.${field.name} = #${field.propertyName}#
        </#if>
        </#list>
    </delete>

    <update id="updateById" parameterClass="map">
        update <include refid="table"/>
        <dynamic prepend="SET">
            <#list table.commonFields as field>
        <isPropertyAvailable prepend="," property="${field.propertyName}"> <#if (field.comment)??><!--${field.comment}--></#if>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            a.${field.name} = to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")
            <#else>
            a.${field.name} = #${field.propertyName}#
            </#if>
        </isPropertyAvailable>
            </#list>
        <#list table.fields as field>
        <isPropertyAvailable prepend="," property="${field.propertyName}"> <#if (field.comment)??><!--${field.comment}--></#if>
            <#if field.columnType.type=="LocalDateTime" || field.columnType.type=="java.sql.Date">
            a.${field.name} = to_date(#${field.propertyName}#, "yyyy-mm-dd hh24:mi:ss")
            <#else>
            a.${field.name} = #${field.propertyName}#
            </#if>
        </isPropertyAvailable>
        </#list>
        </dynamic>
        <#list table.fields as field>
        <#if field.keyFlag><#--生成主键排在第一位-->
        where a.${field.name} = #${field.propertyName}#
        </#if>
        </#list>
    </update>

</sqlMap>

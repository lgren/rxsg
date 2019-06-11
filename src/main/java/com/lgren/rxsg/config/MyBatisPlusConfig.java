package com.lgren.rxsg.config;

import com.baomidou.mybatisplus.core.injector.ISqlInjector;
import com.baomidou.mybatisplus.extension.injector.LogicSqlInjector;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisMapperRefresh;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.annotation.Resource;
import java.io.IOException;

@SpringBootConfiguration
public class MyBatisPlusConfig {
    @Resource
    private SqlSessionFactory sqlSessionFactory;

    @Bean
    public ISqlInjector sqlInjector() {
        return new LogicSqlInjector();
    }

    // @Bean
    // public MetaObjectHandler metaObjectHandler() {
    //     return new MyMetaObjectHandler();
    // }

    @Bean
    public MybatisMapperRefresh mapperRefresh() {
        org.springframework.core.io.Resource[] resources;
        try {
            resources = new PathMatchingResourcePatternResolver()
                    .getResources("classpath*:com/lgren/rxsg/mapper/*.xml");
        } catch (IOException e) {
            resources = new org.springframework.core.io.Resource[0];
            e.printStackTrace();
        }
        return new MybatisMapperRefresh(resources ,sqlSessionFactory, 5, 10, true);
    }

    /**
     * 分页插件
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
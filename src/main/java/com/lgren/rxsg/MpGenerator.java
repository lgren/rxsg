package com.lgren.rxsg;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.*;

/**
 * <p>
 * 代码生成器演示
 * </p>
 */
public class MpGenerator {
    /**
     * <p>
     * MySQL 生成演示
     * </p>
     */
    public static void main(String[] args) {
        //region 参数配置
        Integer dbType = 2;// 1:mysql 2:oracle
        String url = "jdbc:mysql://localhost:3306/bloodwar?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=GMT%2B8";
        String username = "root";
        String password = "123456";

        String parent = "com.lgren";
        String modelName = "rxsg";

        String[] includeTable = null;
        String[] excludeTable = null;

        boolean controller = false;
        boolean service = false;
        boolean serviceImpl = false;
        boolean entity = false;
        boolean mapper = false;
        boolean xml = false;
        //endregion

        AutoGenerator mpg = new AutoGenerator();
        //region GlobalConfig全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java/");// 项目地址
        gc.setFileOverride(true);// 如果文件存在是否覆盖
        gc.setActiveRecord(true);// 不需要ActiveRecord特性的请改为false
        gc.setEnableCache(false);// XML 二级缓存
        gc.setBaseResultMap(true);// XML ResultMap
        gc.setBaseColumnList(true);// XML columnList
        // .setKotlin(true) 是否生成 kotlin 代码
        gc.setAuthor("Lgren");
        // 自定义文件命名，注意 %s 会自动填充表实体属性！
        // gc.setMapperName("I%sDao");
        // gc.setXmlName("%sDao");
        // gc.setServiceName("MP%sService");
        // gc.setServiceImplName("%sServiceDiy");
        // gc.setControllerName("%sAction");
        gc.setOpen(false);// 生成完成后是否打开文件夹
        gc.setSwagger2(false);// 自带接口文档
        mpg.setGlobalConfig(gc);
        //endregion

        //region DataSourceConfig数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(Objects.equals(dbType, 2) ? DbType.ORACLE : DbType.MYSQL);
        // dsc.setTypeConvert(new MySqlTypeConvert() {
        //     // 自定义数据库表字段类型转换【可选】
        //     @Override
        //     public IColumnType processTypeConvert(GlobalConfig globalConfig, String fieldType) {
        //         // 注意！！processTypeConvert 存在默认类型转换，如果不是你要的效果请自定义返回、非如下直接返回。
        //         return super.processTypeConvert(globalConfig, fieldType);
        //     }
        // });
        // dsc.setDriverName("com.mysql.jdbc.Driver");
        // dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setDriverName(Objects.equals(dbType, 2) ? "oracle.jdbc.driver.OracleDriver" : "com.mysql.cj.jdbc.Driver");
        dsc.setUrl(url);
        dsc.setUsername(username);
        dsc.setPassword(password);
        mpg.setDataSource(dsc);
        //endregion

        //region PackageConfig包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent(parent);
        pc.setModuleName(modelName);
        // pc.setController("controller");
        // pc.setService("service");
        // pc.setServiceImpl("service.impl");
        // pc.setEntity("pojo");
        // pc.setMapper("dao");
        // pc.setXml("dao.xml");
        mpg.setPackageInfo(pc);
        //endregion

        //region StrategyConfig数据库表配置
        StrategyConfig strategy = new StrategyConfig();
        // strategy.setCapitalMode(true);// 全局大写命名 ORACLE 注意
        // strategy.setTablePrefix(new String[] { "tlog_", "tsys_" });// 此处可以修改为您的表前缀
        strategy.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        // 【实体】是否为构建者模型（默认 false）
        strategy.setEntityBuilderModel(true);
        // 【实体】是否为lombok模型（默认 false）
        strategy.setEntityLombokModel(true);
        // 【实体】是否生成实体时，生成字段注解
        strategy.entityTableFieldAnnotationEnable(true);
        strategy.setInclude(includeTable); // 需要生成的表
        strategy.setExclude(excludeTable); // 排除生成的表
        // 自定义 entity父类
        // strategy.setSuperEntityClass("com.baomidou.demo.TestEntity");
        // 自定义 entity，公共字段
        // strategy.setSuperEntityColumns(new String[]{"test_id", "age"});
        // 自定义 mapper 父类
        // strategy.setSuperMapperClass("com.baomidou.demo.TestMapper");
        // 自定义 service 父类
        // strategy.setSuperServiceClass("com.baomidou.demo.TestService");
        // 自定义 serviceImpl 父类
        // strategy.setSuperServiceImplClass("com.baomidou.demo.TestServiceImpl");
        // 自定义 controller 父类
        // strategy.setSuperControllerClass("com.baomidou.demo.TestController");
        // Boolean类型字段是否移除is前缀（默认 false）
        // strategy.setEntityBooleanColumnRemoveIsPrefix(false);
        // 生成 @RestController 控制器
        // strategy.setRestControllerStyle(true);
        // 乐观锁属性名称
        // strategy.setVersionFieldName();
        // 逻辑删除属性名称
        // strategy.setLogicDeleteFieldName();
        // 表填充字段
        // strategy.setTableFillList();
        // 【实体】是否生成字段常量（默认 false）
        // public static final String ID = "test_id";
        // strategy.setEntityColumnConstant(false);
        // 【实体】是否为构建者模型（默认 false）
        // public User setName (String name){
        //     this.name = name;
        //     return this;
        // }
        // strategy.setEntityBuilderModel(true);
        mpg.setStrategy(strategy);
        //endregion

        //region InjectionConfig
        // 注入自定义配置，可以在 VM 中使用 cfg.abc 【可无】
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // Map<String, Object> map = new HashMap<>();
                // map.put("abc", this.getConfig().getGlobalConfig().getAuthor() + "-mp");
                // this.setMap(map);
            }
        };
        //
        // 自定义 xxList.jsp 生成
        List<FileOutConfig> focList = new ArrayList<>();
        // 调整 xml 生成目录演示
        if (xml) focList.add(new FileOutConfig("/templates/mapper.xml.ftl") {
            @Override
            public String outputFile(TableInfo tableInfo) {
                return projectPath + "/src/main/resources/mapper/" + tableInfo.getEntityName() + "Mapper.xml";
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);
        // 自定义模板配置，可以 copy 源码 mybatis-plus/src/main/resources/templates 下面内容修改，
        // 放置自己项目的 src/main/resources/templates 目录下, 默认名称一下可以不配置，也可以自定义模板名称

        // 关闭默认 xml 生成，调整生成 至 根目录
        TemplateConfig tc = new TemplateConfig();
        if (!controller) tc.setController(null);
        if (!service) tc.setService(null);
        if (!serviceImpl) tc.setServiceImpl(null);
        if (!entity) tc.setEntity(null);
        if (!mapper) tc.setMapper(null);
        tc.setXml(null);
        mpg.setTemplate(tc);
        //endregion

        // 执行生成
        mpg.setTemplateEngine(new FreemarkerTemplateEngine());
        mpg.execute();

    }

}
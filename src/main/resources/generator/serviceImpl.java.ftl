package ${package.ServiceImpl};

import com.yinhai.sysframework.dto.ParamDTO;
import com.yinhai.sysframework.persistence.PageBean;
import com.yinhai.sysframework.persistence.ibatis.IDao;
import ${package.Entity}.${entity}Domain;
<#--import ${package.Mapper}.${table.mapperName};-->
import ${package.Service}.${table.serviceName};
import ${superServiceImplClassPackage};
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

/** 服务实现类 */
@Service
<#if kotlin>
open class ${table.serviceImplName} : ${superServiceImplClass}<${table.mapperName}, ${entity}>(), ${table.serviceName} {

}
<#else>
public class ${table.serviceImplName} extends ${superServiceImplClass} implements ${table.serviceName} {
    @Autowired
    public void autowired(IDao dao){
        super.dao=dao;//父类属性注入
    }

    @Override
    public PageBean page(ParamDTO dto) {
        return getDao().queryForPageWithCount("", "${table.name}.list", dto, dto);
    }

    @Override
    public int deleteById(String id) {
        return getDao().delete("${table.name}.deleteById", id);
    }

    @Override
    public int updateById(ParamDTO dto) {
        return getDao().update("${table.name}.updateById", dto);
    }

    @Override
    public Map<String, Object> get(ParamDTO dto) {
        return (Map) getDao().queryForObject("${table.name}.get");
    }
}
</#if>

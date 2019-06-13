package ${package.Service};

import ${package.Entity}.${entity}Domain;
import ${superServiceClassPackage};

/** ${table.comment!} 服务类 */
<#if kotlin>
interface ${table.serviceName} : ${superServiceClass}<${entity}>
<#else>
public interface ${table.serviceName} extends ${superServiceClass} {

}
</#if>

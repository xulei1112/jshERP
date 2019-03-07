package com.jsh.erp.datasource.mappers;

import com.jsh.erp.datasource.entities.MaterialCategory;
import com.jsh.erp.datasource.entities.Organization;
import com.jsh.erp.datasource.vo.TreeNode;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Description
 *
 * @Author: cjl
 * @Date: 2019/3/6 15:51
 */
public interface OrganizationMapperEx {


    List<TreeNode> getNodeTree();
    List<TreeNode> getNextNodeTree(@Param("id") Long id);

    int addOrganization(Organization org);

    int batchDeleteOrganizationByIds(@Param("updateTime") Date updateTime, @Param("updater") Long updater, @Param("ids") String ids[]);

    int editOrganization(Organization org);
    List <Organization> getOrganizationRootByIds(@Param("ids") String ids[]);
}

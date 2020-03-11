package com.finalbi.whale.provider.tests;

import com.finalbi.whale.provider.api.UmsRolePermissionRelationService;
import com.finalbi.whale.provider.domain.UmsRolePermissionRelation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(properties = "spring.profiles.active=dev")
@RunWith(SpringRunner.class)
public class UmsRolePermissionRelationTest {

    @Resource
    private UmsRolePermissionRelationService rolePermissionRelationService;

    @Test
    public void insertTest() {
        UmsRolePermissionRelation umsRolePermissionRelation = new UmsRolePermissionRelation();
        umsRolePermissionRelation.setRoleId(2L);
        umsRolePermissionRelation.setPermissionId(1L);
        int insert = rolePermissionRelationService.insert(umsRolePermissionRelation);
        System.out.println(insert);
    }

    @Test
    public void deleteTest() {
        UmsRolePermissionRelation umsRolePermissionRelation = new UmsRolePermissionRelation();
        umsRolePermissionRelation.setRoleId(2L);
        umsRolePermissionRelation.setPermissionId(1L);
        int delete = rolePermissionRelationService.delete(umsRolePermissionRelation);
        System.out.println(delete);
    }

    @Test
    public void getRolePermissionRelationsTest() {
        List<UmsRolePermissionRelation> rolePermissionRelations = rolePermissionRelationService.getRolePermissionRelations(1L);
        rolePermissionRelations.forEach(relation -> {
            System.out.println(relation);
        });
    }
}

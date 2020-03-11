package com.finalbi.whale.provider.tests;

import com.finalbi.whale.provider.api.UmsAdminRoleRelationService;
import com.finalbi.whale.provider.domain.UmsAdminRoleRelation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(properties = "spring.profiles.active=dev")
@RunWith(SpringRunner.class)
public class UmsAdminRoleRelationTest {

    @Resource
    private UmsAdminRoleRelationService adminRoleRelationService;

    @Test
    public void insertTest() {
        UmsAdminRoleRelation umsAdminRoleRelation = new UmsAdminRoleRelation();
        umsAdminRoleRelation.setAdminId(1L);
        umsAdminRoleRelation.setRoleId(2L);
        int result = adminRoleRelationService.insert(umsAdminRoleRelation);
        System.out.println(result);
    }

    @Test
    public void deleteTest() {
        UmsAdminRoleRelation umsAdminRoleRelation = new UmsAdminRoleRelation();
        umsAdminRoleRelation.setAdminId(1L);
        umsAdminRoleRelation.setRoleId(2L);
        int result = adminRoleRelationService.delete(umsAdminRoleRelation);
        System.out.println(result);
    }

    @Test
    public void getUserRoleRelationsTest() {
        List<UmsAdminRoleRelation> userRoleRelations = adminRoleRelationService.getUserRoleRelations(1L);
        userRoleRelations.forEach(relation -> {
            System.out.println(relation);
        });
    }
}

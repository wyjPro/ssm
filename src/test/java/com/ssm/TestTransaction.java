package com.ssm;

import com.ssm.pojo.Role;
import com.ssm.service.RoleListService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestTransaction {
    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
        RoleListService roleListService = ctx.getBean(RoleListService. class);
        List<Role> roleList = new ArrayList<Role>();
        for (int i=1; i<=2; i++) {
            Role role = new Role();
            role.setRoleName("role_name_" + i);
            role.setNote("note_" + i);
            roleList.add(role);
        }
        int count = roleListService.insertRoleList(roleList);
        System.out.println(count);
    }
}

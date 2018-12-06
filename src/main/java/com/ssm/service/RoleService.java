package com.ssm.service;

import com.ssm.pojo.Role;

import java.util.List;

public interface RoleService {
    public int insertRole(Role role);
    public int insertRoleList(List<Role> roleList);
    public int insertRoleList2(List<Role> roleList);
}

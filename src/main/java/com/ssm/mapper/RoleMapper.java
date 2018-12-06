package com.ssm.mapper;

import com.ssm.pojo.Role;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapper {
    public int insertRole(Role role);
}

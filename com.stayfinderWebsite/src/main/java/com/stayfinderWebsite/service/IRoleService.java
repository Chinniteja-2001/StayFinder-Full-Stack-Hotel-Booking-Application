package com.stayfinderWebsite.service;

import com.stayfinderWebsite.model.Role;
import com.stayfinderWebsite.model.Usersubject;

import java.util.List;

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    Usersubject removeUserFromRole(Long userId, Long roleId);

    Role removeAllUsersFromRole(Long roleId);

    Usersubject assignRoleToUser(Long userId, Long roleId);
}

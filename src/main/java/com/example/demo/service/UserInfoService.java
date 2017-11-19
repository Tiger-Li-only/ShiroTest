package com.example.demo.service;

import com.example.demo.domain.SysRole;
import com.example.demo.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoService extends JpaRepository<SysUser,Long> {
    /**通过username查找用户信息;*/
    public SysUser findByUsername(String username);
}
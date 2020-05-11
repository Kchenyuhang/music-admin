package com.soft1851.music.admin.service;

import com.soft1851.music.admin.common.ResponseResult;
import com.soft1851.music.admin.domain.dto.LoginDto;
import com.soft1851.music.admin.domain.dto.SysAdminDto;
import com.soft1851.music.admin.domain.dto.UpdateDto;
import com.soft1851.music.admin.domain.entity.SysAdmin;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.Date;
import java.util.Map;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yhChen
 * @since 2020-04-21
 */
public interface SysAdminService extends IService<SysAdmin> {
    /**
     * 登录
     *
     * @param loginDto
     * @return boolean
     */
    Map<String, Object> login(LoginDto loginDto);


    /**
     * 根据name查询Admin信息，包含其所有角色
     *
     * @param name
     * @return
     */
    SysAdmin getAdminAndRolesByName(String name);

    /**
     * 为指定的管理员生成token
     * @param adminId
     * @param roles
     * @param secrect
     * @param expiresAt
     * @return String
     */
    String getToken(final String adminId, final String roles, final String secrect, Date expiresAt);

    /**
     * 管理员修改信息
     * @param sysAdminDto
     * @return boolean
     */
    boolean updateInfo(SysAdminDto sysAdminDto);

    /**
     * 根据id获取admin
     * @param id
     * @return SysAdminDto
     */
    SysAdmin getSysAdminById(String id);

    /**
     * 改头像
     * @param sysAdminDto
     * @return
     */
    boolean updateAvatar(SysAdminDto sysAdminDto);

    /**
     * github第三方登录
     * @param uId
     * @return
     */
    Map<String, Object> githubLogin(String uId);
}

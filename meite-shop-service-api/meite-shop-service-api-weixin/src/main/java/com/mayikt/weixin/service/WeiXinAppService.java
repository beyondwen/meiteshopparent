package com.mayikt.weixin.service;

import com.mayikt.weixin.entity.AppEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * WeiXinAppService
 *
 * @blame Android Team
 */
@Repository
public interface WeiXinAppService {

    /**
     * 获取应用信息方法
     *
     * @return AppEntity
     */
    @GetMapping("/getApp")
    AppEntity getApp();
}

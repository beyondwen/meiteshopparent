package com.mayikt.weixin.service;

import com.mayikt.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * WeiXinAppService
 *
 * @blame Android Team
 */
@Api(tags = "微信服务")
public interface WeiXinAppService {

    /**
     * 获取应用信息方法
     *
     * @return AppEntity
     */
    @ApiOperation("获取app服务")
    @GetMapping("/getApp")
    AppEntity getApp();
}

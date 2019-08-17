package com.mayikt.member.feign;

import com.mayikt.weixin.service.WeiXinAppService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

@FeignClient(name = "app-mayikt-weixin")
public interface WeixinAppServiceFeign extends WeiXinAppService {

    /**
     * 获取应用信息方法
     *
     * @return AppEntity
     *//*
    @GetMapping("/getApp")
    AppEntity getApp();*/
}

package com.mayikt.weixin.service.impl;

import com.mayikt.weixin.entity.AppEntity;
import com.mayikt.weixin.service.WeiXinAppService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeixinServiceImpl implements WeiXinAppService {

    @Override
    public AppEntity getApp() {
        AppEntity appEntity = new AppEntity();
        appEntity.setAppId("1111");
        appEntity.setAppName("appname");
        return appEntity;
    }
}

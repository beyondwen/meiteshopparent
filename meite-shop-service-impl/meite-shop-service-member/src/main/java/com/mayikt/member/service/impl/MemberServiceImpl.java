package com.mayikt.member.service.impl;

import com.mayikt.member.feign.WeixinAppServiceFeign;
import com.mayikt.weixin.entity.AppEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 会员实现服务
 */

@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeixinAppServiceFeign weixinAppServiceFeign;


    /**
     * 会员调用微信服务
     *
     * @return AppEntity
     */
    @Override
    public AppEntity memberInvokeWeiXin() {
        return weixinAppServiceFeign.getApp();
    }
}

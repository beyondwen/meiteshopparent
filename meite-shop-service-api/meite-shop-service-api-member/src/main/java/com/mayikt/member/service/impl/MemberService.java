package com.mayikt.member.service.impl;

import com.mayikt.weixin.entity.AppEntity;

/**
 * 会员接口服务
 */
public interface MemberService {
    /**
     * 会员调用微信服务
     *
     * @return
     */
    AppEntity memberInvokeWeiXin();
}

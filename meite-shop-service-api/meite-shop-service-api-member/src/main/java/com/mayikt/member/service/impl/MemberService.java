package com.mayikt.member.service.impl;

import com.mayikt.weixin.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 会员接口服务
 */
@Api(tags = "会员服务接口")
public interface MemberService {
    /**
     * 会员调用微信服务
     *
     * @return
     */
    @ApiOperation("会员调用微信服务")
    @GetMapping("/memberInvokeWeiXin")
    AppEntity memberInvokeWeiXin();
}

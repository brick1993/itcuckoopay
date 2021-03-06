package com.bocs.sys.model;

import com.baomidou.mybatisplus.annotations.TableName;
import com.bocs.core.base.BaseModel;

import java.time.LocalDateTime;

/**
 * 描述:<p>商户授权信息 </p>
 *
 * @Author: songqi
 * @Date: 2018/2/7 14:42
 */
@TableName("alipay_open_auth_token")
public class AlipayOpenAuthToken extends BaseModel{

    /**
     * 授权appId
     */
    private String appId;

    /**
     * 商户授权令牌:通过该令牌来帮助商户发起请求，完成业务
     */
    private String appAuthToken;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

    /**
     * 商户支付宝PID
     */
    private String userId;

    /**
     * 应用程序的AppId（如果有服务窗，则为服务窗的AppId）
     */
    private String authAppId;

    /**
     * 令牌有效期:交换令牌的有效期，单位秒，换算成天的话为365天
     */
    private long expiresIn;

    /**
     * 交换令牌的有效期：日期格式
     */
    private LocalDateTime expiresInDateTime;

    /**
     * 刷新令牌有效期，单位秒，换算成天的话为372天
     */
    private long reExpiresIn;

    /**
     * 刷新令牌有效期：日期格式
     */
    private LocalDateTime reExpiresInDateTime;

    /**
     * 刷新令牌时使用。刷新令牌后，我们会保证老的app_auth_token从刷新开始10分钟内可继续使用，请及时替换为最新token
     */
    private String appRefreshToken;

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppAuthToken() {
        return appAuthToken;
    }

    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAuthAppId() {
        return authAppId;
    }

    public void setAuthAppId(String authAppId) {
        this.authAppId = authAppId;
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
    }

    public LocalDateTime getExpiresInDateTime() {
        return expiresInDateTime;
    }

    public void setExpiresInDateTime(LocalDateTime expiresInDateTime) {
        this.expiresInDateTime = expiresInDateTime;
    }

    public void setReExpiresInDateTime(LocalDateTime reExpiresInDateTime) {
        this.reExpiresInDateTime = reExpiresInDateTime;
    }

    public long getReExpiresIn() {
        return reExpiresIn;
    }

    public void setReExpiresIn(long reExpiresIn) {
        this.reExpiresIn = reExpiresIn;
    }

    public String getAppRefreshToken() {
        return appRefreshToken;
    }

    public void setAppRefreshToken(String appRefreshToken) {
        this.appRefreshToken = appRefreshToken;
    }
}

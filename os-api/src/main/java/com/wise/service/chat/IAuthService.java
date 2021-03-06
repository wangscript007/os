package com.wise.service.chat;

import com.wise.bean.Proto;
import com.wise.exception.ConnectionAuthException;

/**
 * 用户验证接口
 */
public interface IAuthService {

    /**
     * 用户身份验证
     *
     * @param serverId 服务ID
     * @param proto    协议
     * @return 用户KEY
     * @throws ConnectionAuthException 验证异常
     */
    String auth(int serverId, Proto proto) throws ConnectionAuthException;

    /**
     * 用户推出
     *
     * @param serverId 服务ID
     * @param key      用户KEY
     * @return 是否成功
     */
    boolean quit(int serverId, String key);

}

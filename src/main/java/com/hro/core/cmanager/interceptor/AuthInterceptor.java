package com.hro.core.cmanager.interceptor;

import com.hro.core.cmanager.common.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 权限拦截器
 */
@Component
public class AuthInterceptor implements HandlerInterceptor{

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String authHeader = request.getHeader(Constant.X_AUTH_HEADER);
        String reqHost = request.getRemoteHost();
        String reqUrl = request.getRequestURL().toString();

        logger.debug("authHeader={}, reqHost={}, reqUrl={}", authHeader, reqHost, reqUrl);

//        if(!"111".equals(authHeader)) {
//            return false;
//        }

        return true;
    }
}

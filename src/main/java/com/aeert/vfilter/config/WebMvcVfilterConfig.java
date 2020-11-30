package com.aeert.vfilter.config;

import com.aeert.vfilter.interceptor.CustomRequestMappingHandlerMapping;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

/**
 * @Author l'amour solitaire
 * @Description WebMvcVfilterConfig
 * @Date 2020/7/16 上午9:53
 **/
@Configuration
public class WebMvcVfilterConfig extends WebMvcConfigurationSupport {

    /**
     * 重写请求过处理的方法
     *
     * @return
     */
    @Override
    public RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
        RequestMappingHandlerMapping handlerMapping = new CustomRequestMappingHandlerMapping();
        handlerMapping.setOrder(0);
        return handlerMapping;
    }

}
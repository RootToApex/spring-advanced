package org.example.expert.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Configuration // 이 클래스는 설정 파일이라는 것을 알려주는 어노테이션
public class WebConfig implements WebMvcConfigurer { // MVC 설정으로 바꾸기

    // SpringMVC 설정에 ArgumentResolver를 등록
    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new AuthUserArgumentResolver());
    }
}

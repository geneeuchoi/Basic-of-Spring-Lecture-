package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(
        //컴포넌트 스캔 대상에서 제외
        basePackages = "hello.core.member", //찾는 시작 위치 지정. 멤버만 스캔 대상이 됨
        basePackageClasses = AutoAppConfig.class,
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
//지정안하면 @ComponentScan이 붙은 설정 정보 클래스의 패키지가 시작 위치가 된다.
//권장방법: 설정 정보 클래스의 위치를 프로젝트 최상단에 두고 패키지 위치를 지정x
public class AutoAppConfig {
}

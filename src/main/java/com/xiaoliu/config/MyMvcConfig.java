package com.xiaoliu.config;

import com.xiaoliu.pojo.Department;
import com.xiaoliu.pojo.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author:小刘
 * @date:2022/7/14-07-16:36
 * @Description: boottest
 * @version:
 */


    //@EnableConfigurationProperties(Car.class)

    @Import({Employee.class, Department.class})
    @Configuration(proxyBeanMethods = false)  //配置文件类
    public class MyMvcConfig implements WebMvcConfigurer {
        /** @Bean 给容器中添加组件 以方法名作为组件的id ,返回类型就是组件类型. 返回的值,就是组件在容器中保存的对象(实例)
         *   @Bean("用户") 给实体类自定义名字
         *      外部无论对配置类中的这个组件注册方法调用多少次获取的都是之前注册容器中的单实例对象
         */
        @Bean("部门")
        public Department department(){
            return  new Department();
        }


        @Override //重写 增加视图控制器方法  就是请求路径过来,可以转发到哪个地方
    public void addViewControllers(ViewControllerRegistry registry) {
            //就是访问了url:"/" 控制器返回 index 名字叫做  前缀index后缀  的页面
            registry.addViewController("/").setViewName("index");
            registry.addViewController("/index.html").setViewName("index");
            registry.setOrder(Ordered.HIGHEST_PRECEDENCE); //设置优先级为最高
            registry.addViewController("/main.html").setViewName("dashboard");

        }

        /**配置拦截器
         *    addPathPatterns("/**")  设置拦截所有请求
         *    .excludePathPatterns("/index.html","/","/user/login")  设置放行的请求
         * */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**").excludePathPatterns()
                .excludePathPatterns("/index.html","/","/user/login","/css/**","/img/**","/js/**","/emp/**","/delemp/**");
    }
}

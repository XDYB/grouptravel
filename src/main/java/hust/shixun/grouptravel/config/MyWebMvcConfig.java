package hust.shixun.grouptravel.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class MyWebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //浏览器发送/csc请求来到success
        registry.addViewController("/userManagement").setViewName("pages/userManage/userManagement");
        registry.addViewController("/dataManagement").setViewName("pages/dataManage/dataManagement");
        registry.addViewController("/orderManagement").setViewName("pages/orderManage/orderManagement");
        registry.addViewController("/productManagement").setViewName("pages/productManage/productManagement");
        registry.addViewController("/youjiManagement").setViewName("pages/youjiManage/youjiManagement");
        registry.addViewController("/KanjiaManagement").setViewName("pages/KanjiaManage/KanjiaManagement");
        registry.addViewController("/jueSeManagement").setViewName("pages/jueSeManage/jueSeManagement");
        registry.addViewController("/main").setViewName("main");

        registry.addViewController("/userEdit").setViewName("pages/userManage/userEdit");
        registry.addViewController("/orderEdit").setViewName("pages/orderManage/orderEdit");
        registry.addViewController("/productEdit").setViewName("pages/productManage/productEdit");
        registry.addViewController("/youjiEdit").setViewName("pages/youjiManage/youjiEdit");
        registry.addViewController("/jueSeEdit").setViewName("pages/jueSeManage/jueSeEdit");

    }
}
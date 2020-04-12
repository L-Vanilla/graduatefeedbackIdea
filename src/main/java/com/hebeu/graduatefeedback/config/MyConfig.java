package com.hebeu.graduatefeedback.config;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import javax.servlet.MultipartConfigElement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

@Configuration
public class MyConfig {
    @Bean
    public PageHelper getPageHelper(){
        PageHelper pageHelper = new PageHelper();
        Properties properties = new Properties();
        properties.setProperty("dialect", "mysql");
        properties.setProperty("reasonable", "true");
        pageHelper.setProperties(properties);
        return pageHelper;
    }
    @Bean
    public CorsFilter getCorsFilter(){
        UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(true);
        corsConfiguration.addAllowedOrigin("*");
        corsConfiguration.addAllowedMethod("*");
        corsConfiguration.addAllowedHeader("*");
        urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration );
        return new CorsFilter(urlBasedCorsConfigurationSource);
    }
    @Bean
    public Converter<String,Date> getConverter(){
        return new Converter<String, Date>() {
            @Override
            public Date convert(String s) {
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
                Date date=null;
                try {
                    date=sdf.parse(s);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                return date;
            }
        };
    }

//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/temp-rainy/**").addResourceLocations("file:D:/temp-rainy/");
//    }

//    /**     * 在配置文件中配置的文件保存路径     */
//    @Value("${cbs.imagesPath}")
//    private String mImagesPath;
//    @Bean
//    public MultipartConfigElement multipartConfigElement(){
//        MultipartConfigFactory factory = new MultipartConfigFactory();
//        //文件最大KB,MB
//        factory.setMaxFileSize("1024MB");        //设置总上传数据总大小
//        factory.setMaxRequestSize("1024MB");
//        return factory.createMultipartConfig();    }
//        /**
//         * * 这里是映射文件路径的方法
//         * */
//
//        public void addResourceHandlers(ResourceHandlerRegistry registry) {
//            if(mImagesPath.equals("") || mImagesPath.equals("${cbs.imagesPath}")){
//                String imagesPath = MyConfig.class.getClassLoader().getResource("").getPath();
//                if(imagesPath.indexOf(".jar")>0){
//                    imagesPath = imagesPath.substring(0, imagesPath.indexOf(".jar"));
//                }else if(imagesPath.indexOf("classes")>0){
//                    imagesPath = "file:"+imagesPath.substring(0, imagesPath.indexOf("classes"));
//                }
//                imagesPath = imagesPath.substring(0, imagesPath.lastIndexOf("/"))+"/img/";
//                mImagesPath = imagesPath;
//            }
//            registry.addResourceHandler("/img/**").addResourceLocations(mImagesPath);
//            addResourceHandlers(registry);
//        }

}

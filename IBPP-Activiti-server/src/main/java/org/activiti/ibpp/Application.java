package org.activiti.ibpp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAutoConfiguration(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
})
@EnableTransactionManagement
@ServletComponentScan
@MapperScan("org.activiti.ibpp.**.*.dao")
@SpringBootApplication
@EnableCaching
@EnableFeignClients
@EnableScheduling
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    Tachinare ta server 启动成功      ヾ(◍°∇°◍)ﾉﾞ\n" +
                "  ______  __    __   __  .__ ..__....... ___     .______      ________\n" + 
                " /      ||  |  |  | |  | |  \\ |  |     /   \\     |   _  \\    |  _____|\n" + 
                "|  ,----'|  |__|  | |  | |   \\|  |    /  ^  \\    |  |_)  |   |  |____ \n" + 
                "|  |     |   __   | |  | |  . `  |   /  /_\\  \\   |      /    |   ____|  \n" + 
                "|  `----.|  |  |  | |  | |  |\\   |  /  _____  \\  |  |\\  \\--| |  |_____ \n" + 
                " \\______||__|  |__| |__| |__| \\__| /__/     \\__\\ | _| `.___| |_______|");
    }
}

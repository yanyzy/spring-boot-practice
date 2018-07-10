package top.zhyee.springbootproctice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 这是一个启动类
 */
@SpringBootApplication(scanBasePackages = {"top.zhyee.springbootproctice"})
public class SpringBootProcticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootProcticeApplication.class, args);
    }
}

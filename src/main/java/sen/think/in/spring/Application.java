package sen.think.in.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sen.think.in.spring.enable.SenService;
import sen.think.in.spring.enable.demo01.EnableSenServiceRegistrar;

import javax.annotation.PostConstruct;

@EnableSenServiceRegistrar
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private SenService senService;

    @PostConstruct
    public void test() {
        System.out.println(senService.getName());
    }

}

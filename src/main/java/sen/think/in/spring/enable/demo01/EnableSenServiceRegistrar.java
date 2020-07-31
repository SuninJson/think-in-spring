package sen.think.in.spring.enable.demo01;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(SenServiceRegistrar.class)
public @interface EnableSenServiceRegistrar {
}

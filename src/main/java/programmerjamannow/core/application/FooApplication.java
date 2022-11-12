package programmerjamannow.core.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import programmerjamannow.core.data.Bar;
import programmerjamannow.core.data.Foo;
import programmerjamannow.core.factory.listener.AppStartingListener;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class FooApplication {
//    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(FooApplication.class, args);
//        Foo foo = context.getBean(Foo.class);
//        System.out.println(foo);
//    }
    @Bean
    public Foo foo(Bar bar) {
        return new Foo();
    }

//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        List <SpringApplication> applications = new ArrayList<>();
//        applications.add(application);
//        application.setListeners(applications.get(0).getListeners());
//        ConfigurableApplicationContext applicationContext = application.run(args);
//        Foo foo = applicationContext.getBean(Foo.class);
//
//        System.out.println(foo);
//    }
}

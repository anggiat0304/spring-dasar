package programmerjamannow.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.application.FooApplication;
import programmerjamannow.core.data.Foo;

public class WithoutSpringBootTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(FooApplication.class);
        context.registerShutdownHook();
    }
//    @Test
//    void fooApplicationTest(){
//        Foo foo = context.getBean(Foo.class);
//    }
}

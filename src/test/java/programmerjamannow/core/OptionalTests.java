package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.Foo;
import programmerjamannow.core.data.FooBar;

public class OptionalTests {

    private ConfigurableApplicationContext context ;

    @BeforeEach
    void setUp(){
     context = new AnnotationConfigApplicationContext(OptionalConfiguration.class);
     context.registerShutdownHook();
    }

    @Test
    void optionalTest(){
        Foo foo = context.getBean(Foo.class);
        FooBar fooBar = context.getBean(FooBar.class);
        Assertions.assertNull(fooBar.getBar());
        Assertions.assertSame(fooBar.getFoo(), foo);

    }


}

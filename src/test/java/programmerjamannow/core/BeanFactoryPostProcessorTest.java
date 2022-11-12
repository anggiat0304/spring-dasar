package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerjamannow.core.data.Foo;
import programmerjamannow.core.processor.FooBeanFactoryPostProcessor;

public class BeanFactoryPostProcessorTest {

    @Configuration
    @Import({
            FooBeanFactoryPostProcessor.class
    })
    public static class TestConfiguration{

    }

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(TestConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testBeanFactoryProcessor(){
        Foo foo = context.getBean("foo",Foo.class);
        Assertions.assertNotNull(foo);

    }
}

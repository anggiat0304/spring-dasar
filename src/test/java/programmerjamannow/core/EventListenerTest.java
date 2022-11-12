package programmerjamannow.core;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerjamannow.core.factory.listener.LoginSuccessListener;
import programmerjamannow.core.factory.listener.UserListener;
import programmerjamannow.core.service.UserService;


public class EventListenerTest {
    @Configuration
    @Import({
            UserService.class,
            LoginSuccessListener.class,
            UserListener.class
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
    void testEventListener(){
        UserService userService = context.getBean(UserService.class);
        userService.login("anggiat","anggiat");
        userService.login("coki", "coki");
        userService.login("lala", "lala");

    }
}

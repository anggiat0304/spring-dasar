package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.service.MerchantService;
import programmerjamannow.core.service.MerchantServiceImpl;

public class  InheritanceTests {
    private ConfigurableApplicationContext context ;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void inheritanceTest(){
        MerchantService merchantService= context.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = context.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantServiceImpl, merchantService);
    }
}

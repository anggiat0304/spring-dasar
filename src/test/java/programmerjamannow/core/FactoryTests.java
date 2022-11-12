package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.client.PaymentGatewayClient;
import programmerjamannow.core.factory.PaymentGatewayFactoryBean;

public class FactoryTests {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void  setUp(){
        context = new AnnotationConfigApplicationContext(PaymentGatewayFactoryBean.class);
        context.registerShutdownHook();
    }

    @Test
    void paymentGatewayTests(){
        PaymentGatewayClient paymentGatewayClient = context.getBean(PaymentGatewayClient.class);
        Assertions.assertSame("https://example.com", paymentGatewayClient.getEndpoint());
        Assertions.assertSame("PUBLICKEY",paymentGatewayClient.getPublicKey());
        Assertions.assertSame("SECRETKEY", paymentGatewayClient.getSecretKey());

    }
}

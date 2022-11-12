package programmerjamannow.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerjamannow.core.factory.PaymentGatewayFactoryBean;

@Configuration
@Import({
        PaymentGatewayFactoryBean.class
})
public class FactoryConfiguration {

}

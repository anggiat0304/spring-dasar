package programmerjamannow.core.factory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;
import programmerjamannow.core.client.PaymentGatewayClient;

@Component("paymentGatewayClient")
public class PaymentGatewayFactoryBean implements FactoryBean<PaymentGatewayClient> {
    @Override
    public PaymentGatewayClient getObject() throws Exception {
       PaymentGatewayClient client = new PaymentGatewayClient();
       client.setEndpoint("https://example.com");
       client.setPublicKey("PUBLICKEY");
       client.setSecretKey("SECRETKEY");

       return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}

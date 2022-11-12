package programmerjamannow.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerjamannow.core.service.MerchantServiceImpl;

@Configuration
@Import({
        MerchantServiceImpl.class
})
public class InheritanceConfiguration {

}

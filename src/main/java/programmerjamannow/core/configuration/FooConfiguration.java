/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: FooConfiguration.java, v 0.1 2022‐10‐29 10.00 anggiat.pangaribuan Exp $$
 */
@Configuration public class FooConfiguration {

    @Bean public Foo foo() {
        return new Foo();
    }

}
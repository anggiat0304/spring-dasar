/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: BeanConfiguration.java, v 0.1 2022‐10‐27 13.08 anggiat.pangaribuan Exp $$
 */
@Slf4j
@Configuration
public class BeanConfiguration {
    @Bean public Foo foo() {
        Foo foo = new Foo();
        log.info("create new foo");

        return foo;
    }
}
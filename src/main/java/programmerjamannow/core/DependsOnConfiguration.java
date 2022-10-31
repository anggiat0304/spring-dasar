/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import programmerjamannow.core.data.Bar;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: DependsOnConfiguration.java, v 0.1 2022‐10‐28 22.15 anggiat.pangaribuan Exp $$
 */
@Slf4j
@Configuration
public class DependsOnConfiguration {
        @Lazy
        @Bean
        @DependsOn("bar")
        public Foo foo(){
            log.info("create new foo");
            return new Foo();
        }

        @Bean
        public Bar bar(){
            log.info("create new bar");
            return new Bar();
        }
}
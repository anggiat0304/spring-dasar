/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.Bar;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: ScanTests.java, v 0.1 2022‐10‐29 10.18 anggiat.pangaribuan Exp $$
 */
public class ScanTests {
        private ConfigurableApplicationContext context;

        @BeforeEach
        void setUp(){
                context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
                context.registerShutdownHook();
        }
        @Test
        void scanTest(){
                Foo foo = context.getBean(Foo.class);
                Bar bar = context.getBean(Bar.class);
        }
}
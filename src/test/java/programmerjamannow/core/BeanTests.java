/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.Foo;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: BeanTests.java, v 0.1 2022‐10‐27 13.19 anggiat.pangaribuan Exp $$
 */
public class BeanTests {
        @Test
        void testCreateBean(){
            ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

            Assertions.assertNotNull(context);
        }
        @Test
        void testGetBean(){
            ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

            Foo foo1 = context.getBean(Foo.class);
            Foo foo2 = context.getBean(Foo.class);

            Assertions.assertSame(foo1, foo2);
        }
}
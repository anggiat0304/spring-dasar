/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: CyclicTests.java, v 0.1 2022‐10‐28 21.24 anggiat.pangaribuan Exp $$
 */
public class CyclicTests {
        @Test
        void cyclicTest(){
                Assertions.assertThrows(Throwable.class, ()->{
                        ApplicationContext context = new AnnotationConfigApplicationContext(CyclicConfiguration.class);
                });

        }
}
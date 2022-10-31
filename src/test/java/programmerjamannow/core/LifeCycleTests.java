/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.web.reactive.context.ConfigurableReactiveWebApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import programmerjamannow.core.data.Connection;
import programmerjamannow.core.data.Server;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: LifeCycleTests.java, v 0.1 2022‐10‐29 00.32 anggiat.pangaribuan Exp $$
 */
public class LifeCycleTests {

    private ConfigurableApplicationContext context;

    @BeforeEach
    void setUp(){
        context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        context.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
       // context.close();
    }

    @Test
    void testConnection(){
        Connection  connection = context.getBean(Connection.class);
    }

    @Test
    void serverTests(){
        Server server = context.getBean(Server.class);
    }

}
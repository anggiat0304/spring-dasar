/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import programmerjamannow.core.configuration.BarConfiguration;
import programmerjamannow.core.configuration.FooConfiguration;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: MainConfiguration.java, v 0.1 2022‐10‐29 10.03 anggiat.pangaribuan Exp $$
 */
@Configuration
@Import({
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {
    
}
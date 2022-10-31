/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: ScanConfiguration.java, v 0.1 2022‐10‐29 10.15 anggiat.pangaribuan Exp $$
 */
@Configuration
@ComponentScan(basePackages = {
        "programmerjamannow.core.configuration"
})
public class ScanConfiguration {

}
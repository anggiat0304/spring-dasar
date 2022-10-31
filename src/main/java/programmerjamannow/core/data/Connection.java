/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: Connection.java, v 0.1 2022‐10‐29 00.28 anggiat.pangaribuan Exp $$
 */
@Slf4j
public class Connection implements InitializingBean , DisposableBean {
    @Override public void destroy() throws Exception {
        log.info("connection is ready to closed");
    }

    @Override public void afterPropertiesSet() throws Exception {
        log.info("connection already to use");
    }
}
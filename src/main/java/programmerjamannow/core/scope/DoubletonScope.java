/**
 * Alipay.com Inc.
 * Copyright (c) 2004‐2022 All Rights Reserved.
 */
package programmerjamannow.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author anggiat.pangaribuan (anggiat.pangaribuan@dana.id)
 * @version $Id: DoubletonScope.java, v 0.1 2022‐10‐28 23.54 anggiat.pangaribuan Exp $$
 */
public class DoubletonScope implements Scope {

    private List<Object> objects = new ArrayList<Object>(2);

    private Long counter =  -1L;

    @Override public Object get(String s, ObjectFactory<?> objectFactory) {
        counter++;
        
        if(objects.size() == 2){
            int index = (int )(counter % 2);
            return objects.get(index);
        }else{
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override public Object remove(String s) {
        if (!objects.isEmpty()){
           return objects.remove(0);
        }
        return null;
    }

    @Override public void registerDestructionCallback(String s, Runnable runnable) {

    }

    @Override public Object resolveContextualObject(String s) {
        return null;
    }

    @Override public String getConversationId() {
        return null;
    }
}
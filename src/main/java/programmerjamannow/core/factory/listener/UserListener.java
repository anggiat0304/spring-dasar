package programmerjamannow.core.factory.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import programmerjamannow.core.event.LoginSuccessEvent;

@Slf4j
@Component
public class UserListener {
    @EventListener(classes = LoginSuccessListener.class)
    public  void onLoginSuccessEvent(LoginSuccessEvent loginSuccessEvent){
        log.info("Success login again for user {}", loginSuccessEvent.getUser());
    }
}

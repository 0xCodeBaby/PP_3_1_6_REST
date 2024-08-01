package project.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import project.Communication;
import project.config.MyConfig;
import project.model.User;

import java.util.List;
@Component
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = applicationContext.getBean("communication", Communication.class);

        System.out.println("Все пользователи " + communication.getAllUsers());
        communication.saveUser(new User(3L, "User1", "User1", (byte) 3));
        communication.updateUser(new User(3L, "User2", "User2", (byte) 3));
        communication.deleteUser(new User(3L, "User2", "User2", (byte) 3), 3);
    }
}

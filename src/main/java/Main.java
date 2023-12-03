import controller.AuthController;
import db.DataBase;
import db.InitDataBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        DataBase.initTable();
//
//        InitDataBase.adminInit();
//        InitDataBase.addCompanyCard();

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-config.xml");
        AuthController authController = (AuthController) applicationContext.getBean("authController");
        authController.start();


    }
}

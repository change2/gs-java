package com.shclearing.config;

import com.etonenet.uuid.IdService;
import com.shclearing.database.mappers.User;
import com.shclearing.database.serivce.UserDAO;
import com.shclearing.database.serivce.UserDAO;
import com.shclearing.database.mappers.User;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * User: changejava
 * Date: 2015/1/17
 * Time: 19:56
 */
public class SpringInit {

    static UserDAO userDAO ;
    static IdService idService;
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("conf/application.xml");
        PropertyPlaceholderConfigurer propertyPlaceHolder = (PropertyPlaceholderConfigurer) context.getBean("configurer");
        userDAO = context.getBean(UserDAO.class);
        idService= context.getBean(IdService.class);
//        batchSave(userDAO, idService);
//        deleteByUserId(1);
//        updateUser();
          search();
    }

    private static void search() {
        User user = userDAO.searchUsers(2);
        System.out.println("database affected :" + user);
    }

    private static void updateUser() {
        User user = new User();
        user.setUserId(2);
        user.setUserName("aliceupdate");
        user.setPassword("aliceupdate");
        int rows = userDAO.updateUser(user);
        System.out.println("database affected :" + rows);
    }

    private static void deleteByUserId(int userID) {
        long start = System.currentTimeMillis();
        int rows = userDAO.deleteUser(userID);
        System.out.println("database affected :" + rows);
        System.out.println((System.currentTimeMillis() - start) / 1000d);
    }

    private static void batchSave(UserDAO userDAO, IdService idService) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            User user = new User();
            user.setUserId(idService.getId());
            user.setUserName("jerry");
            user.setPassword("jerry");
            int rows = userDAO.saveUser(user);
            System.out.println("database affected :" + rows);
        }

        System.out.println((System.currentTimeMillis()-start)/1000d);
    }
}

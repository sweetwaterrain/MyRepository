package Try.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    @org.junit.Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Try/Bean.xml");
        User user = (User) context.getBean("user");
        user.show();
    }

    @org.junit.Test
    public void testT(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Try/Bean.xml");
        UserT userT = (UserT) context.getBean("userT");
        userT.show();
    }

    @org.junit.Test
    public void testStudent01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Try/Bean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.getName());
    }

    @org.junit.Test
    public void testStudent02(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Try/Bean.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.show());
    }
    public void testAAA(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Try/Bean.xml");
        AAA aaa  = (AAA) context.getBean("");
    }
}

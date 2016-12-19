package validation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yf on 2016/12/19.
 */
public class ValidationProvider {
    public static void main(String[] args) throws Exception {
        String config = "D:\\work\\work-git\\work\\s-provider\\src\\main\\java\\validation\\validation-provider.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(config);
        context.start();
        System.in.read();
    }
}

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @Name DubboProvider
 * @Description
 * @Date 2020/8/5 23:24
 * @Author Zhouzhi
 * @Version 1.0
 */
public class DubboProvider {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        context.start();
        System.in.read(); // 按任意键退出
    }
}

package nullguo.dubbocustomer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import nullguo.dubboprovider.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"applicationConsumer.xml"});
        context.start();
        HelloWorld helloWorld=(HelloWorld)context.getBean("demoService");
        System.out.println(helloWorld.hello("nullguo get").name);
    }
}

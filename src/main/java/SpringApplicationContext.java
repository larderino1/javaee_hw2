import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContext {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
        Performer bug = (Performer)context.getBean("bug");
        bug.perform();
        Performer best = (Performer)context.getBean("best");
        best.perform();
        Performer KmaWierdMemes = (Performer)context.getBean("weird-memes");
        KmaWierdMemes.perform();
        Performer KmaMemes = (Performer)context.getBean("cool-memes");
        KmaMemes.perform();
    }
}

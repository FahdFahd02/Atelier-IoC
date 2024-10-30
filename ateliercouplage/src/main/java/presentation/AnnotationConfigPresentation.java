package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigPresentation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("metier", "data");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println(metier.calcule());
    }
}

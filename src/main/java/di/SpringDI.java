package di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ArvikV
 * @version 1.2
 * @since 29.01.2022
 * можно добавить в главный метод BasicConfigurator.configure(); для отображения логов,
 * а можно конф.файл
 * выставленны аннотации в классах зависящих и context.scan("di"); путь к папке где классы помеченные
 * аннотацией для регистрации в контексте
 * Добавленна аннотация @Scope("prototype") в Store, StartUI, которая позволит каждый раз при вызове
 * контекста создавать новый объект
 */
public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("di");
        context.refresh();
        /*
        StartUI ui = context.getBean(StartUI.class);
        ui.add();
        ui.print();
        */
        Store store = context.getBean(Store.class);
        store.add("Petr Arsentev");
        Store another = context.getBean(Store.class);
        another.getAll().forEach(System.out::println);
    }

}

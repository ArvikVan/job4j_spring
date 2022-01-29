package di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author ArvikV
 * @version 1.0
 * @since 29.01.2022
 * можно добавить в главный метод BasicConfigurator.configure(); для отображения логов,
 * а можно конф.файл 
 */
public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Store.class);
        context.register(StartUI.class);
        context.register(ConsoleInput.class);
        context.refresh();

        StartUI ui = context.getBean(StartUI.class);
        ui.add();
        ui.print();
    }

}

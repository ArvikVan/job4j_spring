package di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author ArvikV
 * @version 1.1
 * @since 28.01.2022
 * помечаем для регистрации в контексте
 * Три способа внедрения зависимости (dependency injection)
 * С помощью конструктора (делать только через конструктор)
 * С помощью аннотации @Autowired
 * C помощью сеттера и аннотации
 */
@Component
@Scope("prototype")
public class StartUI {
    @Autowired
    private Store store;
    private ConsoleInput consoleInput;

    public void setStore(Store store) {
        this.store = store;
    }

    @Autowired
    public void setConsoleInput(ConsoleInput consoleInput) {
        this.consoleInput = consoleInput;
    }

    public void askStr(String question) {
        consoleInput.askStr(question);
    }

    public void add() {
        store.add(consoleInput.askStr("Input something: "));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}

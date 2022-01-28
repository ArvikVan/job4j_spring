package di;

/**
 * @author ArvikV
 * @version 1.0
 * @since 28.01.2022
 */
public class StartUI {
    private Store store;
    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
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

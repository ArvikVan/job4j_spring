package di;

/**
 * @author ArvikV
 * @version 1.0
 * @since 28.01.2022
 */
public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);
        ui.add();
        ui.print();
    }
}

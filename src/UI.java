import java.util.*;

public class UI {
    void showFilterKeyMenu() {
        System.out.println("Введите критерий(ии) фильтрации и значение фильтра (через пробел):");
        System.out.println("1. Название");
        System.out.println("2. Цена");
        System.out.println("3. Частота процессора");
        System.out.println("4. Объем SSD");
        System.out.println("5. Объем HDD");
        System.out.println("0. Выйти");
    }

    void showFilterValueMenu() {
        System.out.println("Введите минимальные значение фильтра: ");
    }

    void showInputError() {
        System.out.println("Ошибка ввода");
    }
    Integer getFilterKey() {
        return Integer.valueOf(new Scanner(System.in).nextLine());
    }

    String getFilterValue() {
        return new Scanner(System.in).nextLine();
    }
}

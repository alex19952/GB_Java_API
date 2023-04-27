import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Set<Laptop> setLaptops = new HashSet<>();
        Laptops laptops = new Laptops();
        setLaptops.add(laptops.lap1);
        setLaptops.add(laptops.lap2);
        setLaptops.add(laptops.lap3);
        setLaptops.add(laptops.lap4);
        setLaptops.add(laptops.lap5);
        setLaptops.add(laptops.lap6);
        setLaptops.add(laptops.lap7);

        UI ui = new UI();
        HashMap<Integer, Object> filter = new HashMap<>();
        ui.showFilterKeyMenu();
        Integer key = ui.getFilterKey();
        Boolean flag = true;
        if (key == 0) flag = false;
        while (flag) {
            ui.showFilterValueMenu();
            String tempValue = ui.getFilterValue();
            filter.put(key, switch (key) {
                case 1:
                    yield tempValue;
                case 2:
                case 3:
                    yield Double.valueOf(tempValue);
                case 4:
                case 5:
                    yield Integer.valueOf(tempValue);
                default: throw new IllegalStateException("Unexpected value");
            });
            ui.showFilterKeyMenu();
            key = ui.getFilterKey();
            if (key == 0) flag = false;
        }
        for (Integer filterKey: filter.keySet()) {
            setLaptops = setLaptops.stream()
                    .filter(laptop -> {
                        if (laptop.execMethod(filterKey).get() instanceof Double &&
                                filter.get(filterKey) instanceof Double) {
                            return (Double) laptop.execMethod(filterKey).get() >= (Double) filter.get(filterKey);
                        } else if (laptop.execMethod(filterKey).get() instanceof Integer &&
                                filter.get(filterKey) instanceof Integer) {
                            return (Integer) laptop.execMethod(filterKey).get() >= (Integer) filter.get(filterKey);

                        } else if (laptop.execMethod(filterKey).get() instanceof String &&
                                filter.get(filterKey) instanceof String) {
                            return ((String) laptop.execMethod(filterKey).get()).toLowerCase(Locale.ROOT)
                                    .contains(((String) filter.get(filterKey)).toLowerCase(Locale.ROOT));
                        }
                        else {
                            ui.showInputError();
                        }
                        return laptop.execMethod(filterKey).get() == filter.get(filterKey);
                    })
                    .collect(Collectors.toSet());
        }
        setLaptops.forEach(laptop -> {
            System.out.println(laptop);
        });
    }
}
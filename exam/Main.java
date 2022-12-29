import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        // Создаем экземпляры Notebook и инициализируем поля.
        Notebook nb1 = new Notebook();
        nb1.setName("Irbis");
        nb1.setCpu("Intel Atom Z3735F");
        nb1.setRam(2);
        nb1.setMemoryCapacity(32);
        nb1.setScreenDiagonal(15, 6);
        nb1.setOperatingSystem("Windows 10 Home");
        nb1.setManufacturer("Acer");
        nb1.setColor("black");

        Notebook nb2 = new Notebook("MateBook");
        nb2.setCpu("Intel Core i7");
        nb2.setRam(8);
        nb2.setMemoryCapacity(256);
        nb2.setScreenDiagonal(14.1);
        nb2.setOperatingSystem("Windows 11 Home");
        nb2.setManufacturer("Huawei");
        nb2.setColor("silver");

        Notebook nb3 = new Notebook("Corebook", "AMD Ryzen 3");
        nb3.setRam(16);
        nb3.setMemoryCapacity(1024);
        nb3.setScreenDiagonal(15.6);
        nb3.setOperatingSystem("Eshell");
        nb3.setManufacturer("NCInt");
        nb3.setColor("blue");

        // Множество ноутбуков.
        Set<Notebook> notebooks = new HashSet<>();
        notebooks.add(nb1);
        notebooks.add(nb2);
        notebooks.add(nb3);

        // Выводод
        for (Notebook notebook : notebooks) {
            System.out.println(notebook.toString());
            System.out.println();
        }

        // Фильтруем ноутбуки по критерию пользователя и выводим результат.
        userInquiry(notebooks);

    }

    public static void userInquiry(Set<Notebook> notebooks) {

        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter the criteria id:\n1 - name,\n2 - manufacturer,\n3 - cpu,\n4 - RAM,\n5 - memory capacity,\n6 - operating system,\n7 - screen diagonal,\n8 - color \n");
        String line = sc.nextLine();

        System.out.println("Enter the desirable value of the criteria: ");
        String str = sc.nextLine();
        Set<Notebook> nb = new HashSet<>();
        Map<String, Set<Notebook>> userChoice = new HashMap<>();
        userChoice.put(str, nb);

        switch (line) {
            case "1":
                for (Notebook notebook : notebooks) {
                    if (notebook.getName().equalsIgnoreCase(str)) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "2":
                for (Notebook notebook : notebooks) {
                    if (notebook.getManufacturer().equalsIgnoreCase(str)) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "3":
                for (Notebook notebook : notebooks) {
                    if (notebook.getCpu().equalsIgnoreCase(str)) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "4":
                for (Notebook notebook : notebooks) {
                    if (notebook.getRam().equals(Integer.valueOf(str))) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "5":
                for (Notebook notebook : notebooks) {
                    if (notebook.getMemoryCapacity().equals(Integer.valueOf(str))) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "6":
                for (Notebook notebook : notebooks) {
                    if (notebook.getOperatingSystem().equalsIgnoreCase(str)) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "7":
                for (Notebook notebook : notebooks) {
                    if (notebook.getScreenDiagonal() == (Double.parseDouble(str))) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            case "8":
                for (Notebook notebook : notebooks) {
                    if (notebook.getColor().equalsIgnoreCase(str)) {
                        userChoice.get(str).add(notebook);
                    }
                }
                System.out.println(userChoice);
                break;

            default:
                System.out.println("Incorrect input!");
                break;
        }
        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Function r = new Function();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("""
                    Выберите действие:
                    1 - Добавьте новую игрушку в призовой фонд
                    2 - Измените частоту выпадения игрушки
                    3 - Проведите розыгрыш и сохраните результаты
                    0 - Выход
                    >\s""");
            var selection = sc.next();
            switch (selection) {
                case "1" -> r.addToy();
                case "2" -> r.setFrequency();
                case "3" -> r.raffle();
                case "0" -> {
                    System.out.println();
                    System.exit(0);
                }
                default -> System.out.println("Неправильный выбор. Попробуйте еще раз.");
            }
        }
    }
}

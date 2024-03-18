import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Выберите пункт меню, соответствующий желаемому формату отображения текущей даты и времени:");
        System.out.println("1.dd.MM.YYYY HH:mm:ss");
        System.out.println("2.dd.MMName.yy HH:mm");
        System.out.println("3.yyyy-MM-dd HH:mm");
        boolean exit = false;
        do {
            int choice = in.nextInt();
            if (choice >= 1 && choice <= 3) {
                Solution solution = new Solution();
                Strategy str = choiceSolution(choice);
                solution.setSolution(str);
                solution.getSolution().format();
                System.out.println("Вы хотите закончить выполнение программы? " +
                        "E/e - выйти, любое другое - продолжить");
                String isExit = in.next();
                if (isExit.equals("E") || isExit.equals("e")) {
                    exit = true;
                }
            } else {
                System.out.println("Вы ввели недопустимый пункт меню");
            }
        }while(!exit);
    }
    public static Strategy choiceSolution(int choice){
        switch (choice){
            case 1:
                return new Strategy1();
            case 2:
                return new Strategy2();
            case 3:
                return new Strategy3();
            default:
                return null;
        }
    }
}
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("nhap toc do quat");
//        int tocDo = scanner.nextInt();
//        System.out.println("nhap ban kinh");
//        int banKinh = scanner.nextInt();
//        System.out.println("nhap mau sac");
//        String color = scanner.nextLine();
        fan fan1 = new fan(3, 10, "yellow");
        fan1.on();
        System.out.println(fan1.toString());
        fan fan2 = new fan();
        fan2.setSpeed(2);
        System.out.println(fan2.toString());
        }
    }


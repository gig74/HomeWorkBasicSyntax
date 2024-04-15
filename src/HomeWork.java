import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Рассскажите о вашем друге");
        System.out.println("Как зовут вашего друга?");
        Scanner in = new Scanner(System.in,"Cp866");
        String name = in.nextLine();
        System.out.println("Сколько лет вашему другу");
        String age = in.nextLine();
        System.out.printf("Моему другу %s сейчас %s лет ", name, age);
    }
}
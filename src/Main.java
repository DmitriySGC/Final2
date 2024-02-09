import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите уравнение: ");
        String equation = in.nextLine();

        if (equation.charAt(0) =='x'){
            Integer a = new Integer (equation.charAt(2));
            Integer b = new Integer (equation.charAt(4));
            if (equation.charAt(1) =='-'){
                a = -1*a;
            }
            System.out.println("Ответ: " + (b-a));
        } else if (equation.charAt(2) =='x'){
            Integer a = new Integer (equation.charAt(0));
            Integer b = new Integer (equation.charAt(4));
            if (equation.charAt(1) =='-'){
                a = -1*a;
                b = -1*b;
            }
            System.out.println("Ответ: " + (b-a));
        } else if (equation.charAt(4) =='x'){
            Integer a = new Integer (equation.charAt(0));
            Integer b = new Integer (equation.charAt(2));
            if (equation.charAt(1) =='-'){
                b = -1*b;
            }
            System.out.println("Ответ: " + (a+b));

        }


    }

}

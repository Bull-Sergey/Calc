import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        Calc plus = new Plusator() ; //сложить
        Calc minus = new Minusator() ; // вычесть
        Calc delit = new Delitor() ; // разделить
        Calc multi = new Umnojator() ; // умножить

        System.out.println("Результат");
        System.out.println("Сложить "+a+" и "+b+" = "+((int)plus.calc(a,b)));
        System.out.println("Вычесть из "+a+" число "+b+" = "+((int)minus.calc(a,b)));
        System.out.println("Разделить "+a+" на "+b+" = "+ ((int)delit.calc(a,b)));
        System.out.println("Умножить "+a+" на "+b+" = "+((int)multi.calc(a,b)));
    }
}

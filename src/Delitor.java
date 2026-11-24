public class Delitor implements Calc {
    @Override
    public double calc(int a, int b) {
        if (b == 0) {
            System.out.println("Деление на ноль");
            return 0;
        }

        return (double) a / b;
    }
}

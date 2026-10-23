class ExpressionCalculator {
    public ExpressionCalculator() {
    }

    public double calculateFirst(double x) {
        return 3 * x + 5;
    }

    public double calculateSecond(double a, double b) {
        return a + b * (a - b);
    }

    public double calculateThird(double c, double a, double x, double b) {
        if (b == 0) {
            System.out.println("Ошибка: Деление на ноль! Передан знаменатель b = 0.");
            return Double.NaN;
        }
        return (c * a * x) / b;
    }
}

public class Main {
    public static void main(String[] args) {
        ExpressionCalculator calc1 = new ExpressionCalculator();
        ExpressionCalculator calc2 = new ExpressionCalculator();
        ExpressionCalculator calc3 = new ExpressionCalculator();

        System.out.println("--- Тестирование первого объекта ---");
        System.out.println("Выражение 1 (x=2): " + calc1.calculateFirst(2));
        System.out.println("Выражение 2 (a=5, b=3): " + calc1.calculateSecond(5, 3));
        System.out.println("Выражение 3 (c=2, a=3, x=4, b=2): " + calc1.calculateThird(2, 3, 4, 2));

        System.out.println("\n--- Тестирование второго объекта (с проверкой на 0) ---");
        System.out.println("Выражение 3 (b=0): " + calc2.calculateThird(2, 3, 4, 0));

        System.out.println("\n--- Тестирование третьего объекта ---");
        System.out.println("Выражение 1 (x=-1): " + calc3.calculateFirst(-1));
    }
}

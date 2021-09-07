package homeWork.except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation implements Task {
    @Override
    public void calc() throws CalcException {
        double a, b, c, x1, x2, d;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите коэффициент a");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Введите коэффициент b");
            b = Integer.parseInt(reader.readLine());
            System.out.println("Введите коэффициент c");
            c = Integer.parseInt(reader.readLine());
            if (a == 0)
                throw new ArithmeticException("Деление на 0!");

            d = b * b - 4 * a * c;
            if (d < 0)
                throw new ArithmeticException("Уравнение не имеет корней!");

            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);

            if (d == 0) {
                System.out.println("Уравнение имеет один корень x = " + x1);
            } else {
                System.out.println("Корень x1 = " + x1);
                System.out.println("Корень x2 = " + x2);
            }

        } catch (IOException | NumberFormatException e) {
            throw new CalcException("Нужно вводить числовые данные.");
        } catch (ArithmeticException e) {
            throw new CalcException(e.getMessage());
        }
    }
    @Override
    public String getDescription() {
        return "Решение квадратного уравнения";
    }
}

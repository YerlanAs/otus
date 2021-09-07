package homeWork.except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleArea implements Task {
    @Override
    public void calc() throws CalcException {
        double a, b, c;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите сторону a");
            a = Integer.parseInt(reader.readLine());
            System.out.println("Введите сторону b");
            b = Integer.parseInt(reader.readLine());
            System.out.println("Введите сторону c");
            c = Integer.parseInt(reader.readLine());

            if (a + b >= c && b + c >= a && a + c >= b)
            {
                double p = (a + b + c)/2;
                double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println("Площадь треугольника S = " + S);
            }
            else
            {
                throw new ArithmeticException("Сумма двух сторон не может быть меньше третьей. Такого треугольника не существует!");
            }
        } catch (IOException | NumberFormatException e) {
            throw new CalcException("Нужно вводить числовые данные.");
        } catch (ArithmeticException e) {
            throw new CalcException(e.getMessage());
        }
    }

    @Override
    public String getDescription() {
        return "Площадь треугольника по трем сторонам. Формула Герона.";
    }
}

package homeWork.except;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//4 20 25
public class TestExcept {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.addTask(new QuadraticEquation());
        taskManager.addTask(new TriangleArea());
        int selectIndex = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println(taskManager.getTaskList());

            selectIndex = Integer.parseInt(reader.readLine());
            taskManager.RunTask(selectIndex);
        } catch (IOException | NumberFormatException e) {
            System.out.println("Извините, выбранный Вами пункт отсутствует в списке");
        } catch (TaskManagerException e) {
            System.out.println("Ошибка: " + e.getsMessage());
        } catch (CalcException e) {
            System.out.println("Ошибка при вычислении: " + e.getsMessage());
        }
        finally {
            System.out.println("Работа программы завершена.");
        }

    }
}

package homeWork.except;

import java.util.ArrayList;

public class TaskManager {
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public String getTaskList() throws TaskManagerException {
        String taskList = "";
        for (int i = 0; i < tasks.size(); i++) {
            taskList = taskList + i + ". " + tasks.get(i).getDescription() + "\n";
        }
        if (taskList.equals("")) {
            throw new TaskManagerException("Список задач пуст!");
        }
        return "Выберите задачу из списка, указав порядковый номер:\n" + taskList;
    }

    public void RunTask(int taskIndex) throws TaskManagerException, CalcException {
        try {
            tasks.get(taskIndex).calc();
        } catch (IndexOutOfBoundsException e) {
            throw new TaskManagerException("Выбранными Вами пункт выходит за пределы списка");
        } catch (CalcException e) {
            throw e;
        }
    }
}

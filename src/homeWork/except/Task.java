package homeWork.except;

interface Task {
    void calc() throws CalcException;
    String getDescription ();
}
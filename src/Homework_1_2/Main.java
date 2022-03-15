package Homework_1_2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = result -> System.out.println(result);

        Worker worker = new Worker(listener);
        worker.start();

    }
}

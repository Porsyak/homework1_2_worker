package Homework_1_2;

public class Worker implements OnTaskDoneListener{

    private final OnTaskDoneListener callback;
    private final OnTaskErrorListener errorCallback = () -> System.out.println("Ошибка!");

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    @Override
    public void onDone(String result) {
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 32){
                errorCallback.onError();
                continue;
            }
            callback.onDone("Задача " + (i + 1) + " выполненна");

        }
    }
}

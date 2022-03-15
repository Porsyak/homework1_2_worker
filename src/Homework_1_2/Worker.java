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
        for (int i = 0; i < 10; i++) {
            callback.onDone("Задача " + (i + 1) + " выполненна");
            if (i == 2){
                errorCallback.onError();
            }
        }
    }
}

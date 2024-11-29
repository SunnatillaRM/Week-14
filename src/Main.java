import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {

        //TODO : Assignment 1
        ScheduledExecutorService a1 = Executors.newScheduledThreadPool(1);

        a1.scheduleAtFixedRate(() -> {
            System.out.println("Notification: This is your alert message.");
        }, 3, 1, TimeUnit.SECONDS);

        a1.schedule(() -> {
            System.out.println("Notification service has been stopped.");
            a1.shutdown();
        }, 17, TimeUnit.SECONDS);

        //TODO : Assignment 2
        ScheduledExecutorService a2 = Executors.newScheduledThreadPool(2);

    }
}

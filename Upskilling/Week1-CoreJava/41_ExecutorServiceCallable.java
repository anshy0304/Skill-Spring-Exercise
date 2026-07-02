import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorServiceCallable {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Callable<Integer>> tasks = List.of(
                () -> 10 + 20,
                () -> 30 + 40,
                () -> 50 + 60
        );

        try {
            List<Future<Integer>> futures = new ArrayList<>();
            for (Callable<Integer> task : tasks) {
                futures.add(executorService.submit(task));
            }

            for (Future<Integer> future : futures) {
                System.out.println("Task result: " + future.get());
            }
        } catch (InterruptedException exception) {
            Thread.currentThread().interrupt();
            System.out.println("Task interrupted.");
        } catch (ExecutionException exception) {
            System.out.println("Task failed: " + exception.getMessage());
        } finally {
            executorService.shutdown();
        }
    }
}

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

class VirtualThreads {
    public static void main(String[] args) throws InterruptedException {
        int threadCount = 100_000;
        List<Thread> threads = new ArrayList<>(threadCount);
        Instant start = Instant.now();

        for (int i = 1; i <= threadCount; i++) {
            int threadNumber = i;
            Thread thread = Thread.startVirtualThread(() -> {
                if (threadNumber <= 10 || threadNumber == threadCount) {
                    System.out.println("Virtual thread " + threadNumber + " executed.");
                }
            });
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.join();
        }

        Duration duration = Duration.between(start, Instant.now());
        System.out.println("Started and joined " + threadCount + " virtual threads in " + duration.toMillis() + " ms.");
        System.out.println("Traditional platform threads are heavier and should not usually be created in this quantity.");
    }
}

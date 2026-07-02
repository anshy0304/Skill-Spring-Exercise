class MessagePrinter implements Runnable {
    private final String message;

    MessagePrinter(String message) {
        this.message = message;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(message + " - " + i);
        }
    }
}

class ThreadCreation {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new MessagePrinter("First thread"));
        Thread secondThread = new Thread(new MessagePrinter("Second thread"));

        firstThread.start();
        secondThread.start();
    }
}

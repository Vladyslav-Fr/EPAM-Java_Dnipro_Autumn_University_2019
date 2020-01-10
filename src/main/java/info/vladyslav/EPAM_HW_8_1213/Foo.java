package info.vladyslav.EPAM_HW_8_1213;

class Foo {
    private int turn = 0;
    private String fooMessage = "";
    private Thread[] threads = new Thread[3];

    public Foo() {
    }

    public synchronized void first() {
        while (turn != 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        turn = 1;
        this.fooMessage += "first";
        Thread.currentThread().setName("A");
        this.notifyAll();
    }

    public synchronized void second()  {
        while (turn != 1) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        turn = 2;
        this.fooMessage += "second";
        Thread.currentThread().setName("B");
        this.notifyAll();
    }

    public synchronized void third()  {
        while (turn != 2) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        turn = 1;
        this.fooMessage += "third";
        Thread.currentThread().setName("C");
        this.notifyAll();
    }

    public String fooThreeThreads(int[] sequenceOfThreads) throws InterruptedException {
        for (int i = 0; i < sequenceOfThreads.length; i++) {
            switch (sequenceOfThreads[i]){
                case 1:
                    threads[i] = new Thread(this::first);
                    break;
                case 2:
                    threads[i] = new Thread(this::second);
                    break;
                case 3:
                    threads[i] = new Thread(this::third);
                    break;
            }
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
        return fooMessage;
    }


}


package info.vladyslav.EPAM_HW_8_1213;

class Foo {
    private int turn = 0;
    private String fooMessege = "";

    public Foo() {
    }

    public String getFooMessege() {
        return this.fooMessege;
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
        this.fooMessege += "first";
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
        this.fooMessege += "second";
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
        this.fooMessege += "third";
        Thread.currentThread().setName("C");
        this.notifyAll();
    }
}


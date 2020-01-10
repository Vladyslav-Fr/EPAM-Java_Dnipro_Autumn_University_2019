package info.vladyslav.EPAM_HW_8_1213;

class FooThreeThreads {
    private Foo foo = new Foo();
    private Thread[] threads = new Thread[3];

    public String getFoo() {
        return foo.getFooMessege();
    }

    public FooThreeThreads(int[] anInt) throws InterruptedException {
        for (int i = 0; i < anInt.length; i++) {
            switch (anInt[i]){
                case 1:
                    threads[i] = new Thread(foo::first);
                    break;
                case 2:
                    threads[i] = new Thread(foo::second);
                    break;
                case 3:
                    threads[i] = new Thread(foo::third);
                    break;
            }
            threads[i].start();
        }
        for (Thread thread : threads) {
            thread.join();
        }
    }

}

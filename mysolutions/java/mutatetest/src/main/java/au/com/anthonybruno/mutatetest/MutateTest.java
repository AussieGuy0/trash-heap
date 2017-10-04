package au.com.anthonybruno.mutatetest;

import java.util.concurrent.ThreadLocalRandom;

public class MutateTest {


    private long testsNum = 1000000000L; //1 billion!

    public void runTests() {
        for (int i = 0; i < 10; i++) {
            timeTests(() -> mutateWithArrayTest(), "Array");
            timeTests(() -> mutateWithObjectTest(), "Object");
            System.out.println();
        }
    }

    private void mutateWithObjectTest() {
        int toMutate = 5;
        for (int i = 0; i < testsNum; i++) {
            IntWrapper intWrapper = new IntWrapper(toMutate);
            mutate(intWrapper);
            int mutated = intWrapper.getWrapped();
        }
    }

    private void mutate(IntWrapper intWrapper) {
        intWrapper.setWrapped(generateRandomNumber());
    }

    private void mutateWithArrayTest() {
        int toMutate = 5;
        for (int i = 0; i < testsNum; i++) {
            int[] array = {toMutate};
            mutate(array);
            int mutated = array[0];
        }
    }

    private void mutate(int[] toMutate) {
        toMutate[0] = generateRandomNumber();
    }

    private void timeTests(Runnable test, String type) {
        long timeStarted = System.currentTimeMillis();
        test.run();
        long timeEnded = System.currentTimeMillis();
        long totalTime = timeEnded - timeStarted;
        System.out.println("Using " + type + " - avg: " + totalTime/testsNum + "ms. Total time: " + totalTime + "ms");
    }


    private int generateRandomNumber() {
        return ThreadLocalRandom.current().nextInt();
    }

    private static class IntWrapper {

        private int wrapped;

        public IntWrapper(int wrapped) {
            this.wrapped = wrapped;
        }

        public int getWrapped() {
            return wrapped;
        }

        public void setWrapped(int wrapped) {
            this.wrapped = wrapped;
        }
    }

    public static void main(String[] args) {
        new MutateTest().runTests();
    }

}

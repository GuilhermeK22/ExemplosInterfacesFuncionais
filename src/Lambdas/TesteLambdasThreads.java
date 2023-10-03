package Lambdas;

public class TesteLambdasThreads {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Executando comum");
            }
        };
        new Thread(r).start();

        /**
         * Utilizando Lambda
         */
        Runnable rlambda = () -> System.out.println("Executando lambda");
        new Thread(rlambda).start();

        /**
         * Outro método utilizando a Thread
         */
        new Thread(() -> System.out.println("Executando Thread com expressão Lambda")).start();
    }
}

package Anonimas;

import Lambdas.TesteLambdasThreads;

public class AnonimasTeste {
    public static void main(String[] args) {
        MyEventConsumer anonima = new MyEventConsumer() {
            @Override
            public void consumer(Object value) {
                System.out.println(value);
            }
        };
        anonima.consumer("Teste anônima");

        /**
         * Utilizando expressão lambda
         */
        MyEventConsumer anonimaLambda = (Object value) -> System.out.println(value);
        anonimaLambda.consumer("Teste Lambda");

        receberInterface((Object value) -> System.out.println(value));
    }

    private static void receberInterface(MyEventConsumer anonimaLambda) {
        anonimaLambda.consumer("Olá teste");
    }
}

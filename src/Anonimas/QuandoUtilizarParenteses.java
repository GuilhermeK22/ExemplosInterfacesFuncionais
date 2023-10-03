package Anonimas;

public class QuandoUtilizarParenteses {
    public static void main(String[] args) {
        MyEventConsumer myEvent = (Object s) -> {
            System.out.println(s);
        };

        MyEventConsumer myEvent1 = (s) -> {
            System.out.println(s);
        };
        MyEventConsumer myEvent2 = s -> System.out.println(s);
        }
        MyEventConsumerReturn<Integer> ret = s -> {
            System.out.println(s);
            System.out.println(s);
            return 1;
        };
        MyEventConsumerReturn<String> retS = s -> {
            System.out.println(s);
            System.out.println(s);
            return "Olá";
        };
}

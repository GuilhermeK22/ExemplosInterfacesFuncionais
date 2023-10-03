package Anonimas;

@FunctionalInterface
public interface MyEventConsumerReturn<T> {
    public T consumer(Object value);
}

package feb15.function;

@FunctionalInterface
public interface DLValidate<T, R> {

//    Object test(Object o);
    R test (T t);
}

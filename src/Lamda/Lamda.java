package Lamda;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lamda {
    public static void main(String[] args) {
        Predicate<Integer> isPositiveNumberAnon = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        Predicate<Integer> isPositiveNumber = value -> value > 0;


        Consumer<String> helloPrinterAnon = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        Consumer<String> helloPrinter = value -> System.out.println(value);

        Function<Double, Long> roundingAnon = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        Function<Double, Long> rounding = value -> Math.round(value);

        Supplier<Integer> numbersAnon = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return ThreadLocalRandom.current().nextInt(0, 100);
            }
        };
        Supplier<Integer> numbers = () -> ThreadLocalRandom.current().nextInt(0, 100);

    }
    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> predicate,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse){
        return (value) -> predicate.test(value) ? ifTrue.apply(value) : ifFalse.apply(value);
    }
}

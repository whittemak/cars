import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        findMinMax(Stream.of(1, 23, 322, 424242, 3232),
                Integer::compareTo,
                (min, max) -> System.out.println("Min " + min+ ", max " + max));

    }
    public static <T> void findMinMax(java.util.stream.Stream<? extends T> stream,
                                      Comparator<? super T> order,
                                      BiConsumer<? super T, ? super T> minMaxConsumer){
        List<? extends T> list = stream.sorted(order).toList();
        minMaxConsumer.accept(list.get(0), list.get(list.size() - 1));


    }
    public static void evensCount(List<Integer>list){
        long count = list.stream().filter(val -> val % 2 == 0).count();
        System.out.println(count);
    }
}

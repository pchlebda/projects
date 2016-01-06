package stream;

import java.util.stream.Stream;

/**
 * Created by Piotr on 2015-09-27.
 */
public class Main {

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(6, 7, 8, 22, 41, 1, 4, 3);
        Stream<Integer> stream2 = Stream.of(6, 3);
        Stream<Stream<Integer>> of = Stream.of(stream, stream2);

        of.flatMap(Main::duplicate).forEach(System.out::println);

    }


    public static Stream<Integer> duplicate(Stream<Integer> stream){
        return stream.distinct();
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 堆污染
 */
public class HeapPollutionTest {

    private static class ArrayListBuilder {

        public static <T> void addToList(List<T> list, T... ele) {
            for (T x : ele) {
                list.add(x);
            }
        }

        public static void faultyMethod(List<String>... l) {
            Object[] objectArray = l;
            objectArray[0] = Arrays.asList(42);
            String s = l[0].get(0);
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        List<String> stringListA = new ArrayList<>();
        List<String> stringListB = new ArrayList<>();

        ArrayListBuilder.addToList(stringListA,  "7", "8", "9");
        ArrayListBuilder.addToList(stringListB,  "10", "11", "12");
        List<List<String>> listOfStringLists = new ArrayList<>();
        ArrayListBuilder.addToList(listOfStringLists, stringListA,  stringListB);
        ArrayListBuilder.faultyMethod(Arrays.asList("hello"),  Arrays.asList("world"));
    }
}

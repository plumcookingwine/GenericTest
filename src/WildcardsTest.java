import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 通配符
 */
public class WildcardsTest {


    static class Test {

        public static void main(String[] args) {
            B b = new B();
            A a = b;

            List<B> lb = new ArrayList<>();
            // List<A> la = lb; // error

            List<? extends A> la = lb;
        }


        static class A {}

        static class B extends A {}

    }


    public static void main(String[] args) {
        /**
         * 1.
         */
        //  List<? extends Number> l1 = Arrays.asList(1, 2, 3.4, 5f);
        //  System.out.println(sum(l1)); // 11.4

        //  List<Integer> l2 = Arrays.asList(1, 2, 3, 4);
        //  System.out.println(sum(l2)); // 10.0

        //  List<Double> l3 = Arrays.asList(1.1, 2.5, 3.0, 4.6);
        //  System.out.println(sum(l3)); // 11.2
        //
        /**
         * 2.
         */
        // List<Object> list = Arrays.asList(1, 2, 3);
        // printList(list);
//
        // List<Integer> l2 = Arrays.asList(1, 2, 3);
        // printList(l2);

        /**
         * 3.
         */
        // List<Double> li1 = new ArrayList<>();
        // addNumber(li1); // error

        List<Number> li2 = new ArrayList<>();
        addNumber(li2); // ok

        List<Integer> li3 = new ArrayList<>();
        addNumber(li3); // ok

        List<Object> li4 = new ArrayList<>();
        addNumber(li4); // ok

    }

    /**
     * 下界通配符
     * @param li
     */
    private static void addNumber(List<? super Integer> li) {
        for (int i = 0; i < 10; i++) {
            li.add(i);
        }

        // 这样不行 int a = li.get(2);
    }

    /**
     * 无界通配符
     *
     * @param list
     */

    private static void printList(List<?> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    /*todo 错误的做法
    public static void printList(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }*/


    /**
     * 上界通配符
     *
     * @param list
     * @return
     */
    private static double sum(List<? extends Number> list) {

        // 这样不行 list.add(123);
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }
}

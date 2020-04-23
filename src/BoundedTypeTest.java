import data.Response;

/**
 * 限定类型
 */
public class BoundedTypeTest {
    public static void main(String[] args) {
        // error test("12123");
        test(123);

        A[] resArr = {new A()};
        A res = new A();
        int count = thenCount(resArr, res);
        System.out.println("count === " + count);
    }

    private static <U extends Number> void test(U u) {
        System.out.println("type:::" + u.getClass().getCanonicalName());
    }

    private class MultipleType<T extends Response & B> {

    }

//    public static <T> int thanCount(T[] array, T ele) {
//        int count = 0;
//        for (T t : array) {
//            if (t > ele) {
//                count++;
//            }
//        }
//        return count;
//    }


    static class A implements Comparable<A> {

        @Override
        public int compareTe(A a) {
            return 0;
        }
    }

    private static <T extends Comparable<T>> int thenCount(T[] array, T ele) {
        int count = 0;
        for (T e : array) {
            if (e.compareTe(ele) > 0) {
                count++;
            }
        }
        return count;
    }

    interface Comparable<T> {
        public int compareTe(T t);
    }

    interface B {

    }

}

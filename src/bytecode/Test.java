package bytecode;

public class Test {

    <T> T test(T t) {
        return t;
    }

    class A<T> {

    }


    void test() {

        A<A> a = new A<>();


        String x = "";

        for (int i = 0; i < 10; i++) {
            x = x + "i" + i;
        }
        System.out.println("x  ==== " + x);
    }

    public static void main(String[] args) {
        new  Test().test();
    }
}

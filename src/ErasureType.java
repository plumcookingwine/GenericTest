/**
 * 类型擦除
 */
public class ErasureType {

    /*static class Response1<T> {

        T data;

        public Response1(T data) {
            this.data = data;
        }
    }

    static class Response2<T extends Number> {

        T data;

        public Response2(T data) {
            this.data = data;
        }
    }*/

    static class Test1<T> {

        T data;

        public Test1(T data) {
            this.data = data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

    static class MyTest extends Test1<Integer> {
        public MyTest(Integer data) {
            super(data);
        }

        public void setData(Integer data) {
            System.out.println("MyTest.setData");
            super.setData(data);
        }
    }

    public static void main(String[] args) {
        MyTest myTest = new MyTest(2);
        Test1 t1 = myTest;
        t1.setData("hello  world");
        Integer x = myTest.data;
        System.out.println("x ======= " + x);

    }
}

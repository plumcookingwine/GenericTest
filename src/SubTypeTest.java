import data.Response;

import java.util.List;

/**
 * 泛型、继承和子类型
 */
public class SubTypeTest {


    /**
     * 通用类和子类型
     */
    public static void main(String[] args) {

        PayloadList<String,String> p1;
        PayloadList<String,Integer> p2;
        PayloadList<String,Exception> p3;
    }

    interface PayloadList<E, P> extends List<E> {
        void setPayload(int index, P val);
    }

//    public static void main(String[] args) {
//
//        // ok
//        Integer i = new Integer(1);
//        Object obj = i;
//
//        // ok
//        Response<Number> res = new Response<>();
//        res.setData(new Integer(1));
//        res.setData(new Double(1.2));
//        Response<Integer> res1 = new Response<>();
//        // todo 重点
//        //res1 = res; // 不可强制转换
//        //res = res1; // 不可强制转换
//    }
}

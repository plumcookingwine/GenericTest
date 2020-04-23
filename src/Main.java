import data.Response;

public class Main {

    public static void main(String[] args) {
        Response<String> res = new Response<>();
        res.setData("234");
        Response rawRes = res;
        System.out.println("data === " + rawRes.getData());
        rawRes.setData(123);
        System.out.println("data === " + rawRes.getData());

        Response<String> resas= create();
        System.out.println("data === " + resas.getData());
    }

    public static Response create() {
        Response res = new Response();
        res.setData(123);
        return res;
    }

//    public static void main(String[] args) {
//
//        List list = new ArrayList();
//        list.add("123");
//        list.add(1);
//        String s = (String) list.get(0);
//        int i = (int) list.get(1);
//
//
//        data.Response response = new data.Response();
//        response.setCode(0);
//        response.setData(list);
//        response.setMsg("success");
//
//        List list1 = (List) response.getData();
//
//        System.out.println("list1[0] === " + list1.get(0));
//        System.out.println("list1[1] === " + list1.get(1));
//
//        List<String> list2 = new ArrayList<>();
//        list2.add("234");
//        String ss = list2.get(0);
//        System.out.println("list2[0] == " + ss);
//    }
}

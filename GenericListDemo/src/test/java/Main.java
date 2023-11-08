public class Main {

    public static <T> void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("List status : " + (list.isEmpty() ? "Empty" : "Filled"));
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(20);
        list.insert(50);
        list.insert(60);
        list.insert(70);

        System.out.println("List Status : " + (list.isEmpty() ? "Empty" : "Filled"));

        System.out.println("Index : " + list.indexOf(20));

        System.out.println("Index :" + list.indexOf(100));

        System.out.println("Index : " + list.lastIndexOf(20));

        Object[] arr = list.toArray();
        System.out.println("First element of arr :" + arr[0]);

        MyList<Integer> subList = list.subList(0, 3);
        System.out.println(subList.toString());


       System.out.println("20 in my list : " + list.contains(20));
        System.out.println("120 in my list : " + list.contains(120));

        //list.clear();
        //System.out.println(list.toString());

    }

}
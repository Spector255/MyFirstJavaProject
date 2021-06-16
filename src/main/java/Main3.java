import java.util.*;

public class Main3 {
    public static void main(String[] args){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        System.out.println(arrayList.get(1));

        Map<String, String > map = new HashMap<>();
        map.put("A","0");
        map.put("B","1");
        map.put("C","2");
        //System.out.println(map.get("A"));
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }
        Set<String> set = new HashSet<>();
        set.add("String");
        set.add("String2");
        System.out.println(set);

        LinkedList<String> linkedList = new LinkedList<>();
        //LinkedList.addFirst("String1");
        linkedList.offerFirst("String2");
        System.out.println(linkedList.get(1));


    }
}

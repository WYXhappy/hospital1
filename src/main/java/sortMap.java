import java.util.*;

public class sortMap {
    public static void main(String[] args) {
        Map ksdsldksl = ret("qqrerefddfvssftiuooiujdvdaaaccvff");
        ksdsldksl.forEach((key,value) -> {
            System.out.println("排序后的key为:" + key + "....对应的user对象的name为:" + value);
    });
    }

    public static Map ret(String s){
        Map<Character, Integer> objectObjectMap = new HashMap<>(10);
        for(int i=0;i<s.length();i++){
            char dex=s.charAt(i);
            if(objectObjectMap.keySet().contains(dex)){
                Integer integer = objectObjectMap.get(dex);
                objectObjectMap.put(dex,integer+1);
            }else{
                objectObjectMap.put(dex,1);
            }
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<>(objectObjectMap.entrySet());
        Collections.sort(list, Comparator.comparing(Map.Entry::getKey));
        //降序
//        Collections.sort(list,(o1,o2) -> o2.getKey() - o1.getKey());

        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
            System.out.println(characterIntegerEntry.getKey());
        }
        objectObjectMap.clear();

        //put操作  通过hash值找   不管怎么样还是在原来的位置
//        for (Map.Entry<Character, Integer> characterIntegerEntry : list) {
//            objectObjectMap.put(characterIntegerEntry.getKey(),characterIntegerEntry.getValue());
//        }

        Map map =  new LinkedHashMap<Character, Integer>(){{
            list.forEach(we -> {
                put(we.getKey(),we.getValue());
            });
        }};
        
        return map;
    }
}

import com.mypackage.Map;
public class Main {


    public static void main(String[] args) {
        Map map = new Map();
        map.put(0, "zero");
        map.put(1, "one");
        map.put("2", "It's okay");
        map.put("The key", "redirecting");
        System.out.println("\nMap elements:");
        for (int i = 0; i < map.size(); i++) {
            System.out.println("\""+map.getKeys().get(i)+"\":\""+ map.get(map.getKeys().get(i))+"\"");
        }
        System.out.println("\nList of keys");
        System.out.println(map.getKeys().toString());

        System.out.println("\nRemoving of element number 2");
        map.remove("2");
        System.out.println("\nMap elements: ");
        for(int i=0;i<map.size();i++){
            System.out.println("\""+map.getKeys().get(i)+"\":\""+ map.get(map.getKeys().get(i))+"\"");
        }
    }

}

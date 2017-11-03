import com.mypackage.LinkedList;
public class Main {
    private static LinkedList list = new LinkedList();

    public static void main(String[] args) {
        list.put(123);
        list.put("the string");
        list.put(new Integer(456));
        System.out.println("\nList elements");

        for(int i=0;i<list.size();i++){
            System.out.println("element "+i+" : "+list.get(i));
        }
        System.out.println("===============================");
        System.out.println("List size : "+list.size());
        System.out.println("Removing of element number 1");
        list.remove(1);
        System.out.println("\nList elements");
        for(int i=0;i<list.size();i++){
            System.out.println("element "+i+" : "+list.get(i));
        }
        System.out.println("================================");
        System.out.println("List size : "+list.size());
        System.out.println("\nPutting of element in the position number 1");
        list.put("put element", 1);
        System.out.println("\nList elements");
        for(int i=0;i<list.size();i++){
            System.out.println("element "+i+" : "+list.get(i));
        }
        System.out.println("================================");
        System.out.println("List size : "+list.size());

    }
}

package hash;

public class Sistema {
    public static void main(String[] args) {
        HashTable table = new HashTable(4);
        table.add(10, "HTML");
        table.add(1, "div");
        table.add(3, "head");
        table.add(8, "body");
        table.add(7, "p");
        table.add(5, "a");

        System.out.println(table.get(10));
        System.out.println(table.get(1));
        System.out.println(table.get(3));
        System.out.println(table.get(5));
        
        table.remove(3);
        System.out.println(table.get(3));

        
       
    }
}

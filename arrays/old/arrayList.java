import java.util.*;

public class arrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(8);
        list.add(44);
        list.add(78);
        list.add(47);
        list.add(91);
        list.add(111);
        list.add(78);
        list.add(47);
        list.add(111);
        list.add(78);

        System.out.println(list);
        list.set(0, 37);
        list.remove(3);
        System.out.println(list);
        System.out.println("Does it contain 111: " + list.contains(111));

        ArrayList<Integer> fist = new ArrayList<Integer>();

        for (int i = 0; i < 8; i++) {
            fist.add(input.nextInt());
            System.out.println(fist);
        }
        input.close();
        System.out.println("\n" + fist);
        //
        // get item at any index
        for (int i = 0; i < 8; i++) {
            System.out.println(fist.get(i));
        }
    }
}

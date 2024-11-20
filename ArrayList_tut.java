import java.util.ArrayList;

public class ArrayList_tut {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<String> food = new ArrayList<>();

        // Add
        food.add("Pizza");
        food.add("Ice cream");
        food.add("Banana");

        /* for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        } */

        // System.out.println();

        food.set(0, "Ramen");
        food.set(2, "Steak");

        food.remove(1);
        // food.clear();

        if(food.size() == 0) { System.out.println("no food");}

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }
        




    }
}

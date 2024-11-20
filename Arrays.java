public class Arrays {
    public static void main(String[] args){
        
        // Ways to make array !1!
        String[] cars = {"Honda", "Tesla", "Toyota"};

        // !2!

        String[] fruits = new String[3];

        
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "coconut";
        
        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        };

        for(int i = 0; i < cars.length; i++){
            System.out.println(cars[i]);
        };




    }
}

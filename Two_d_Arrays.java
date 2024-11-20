public class Two_d_Arrays {
    public static void main(String[] args){

        // 2d Array == an array of arrays 

        // ! 1 !
        String[][] fridge = new String[3][3];

        fridge[0][0] = "Meat";
        fridge[0][1] = "Chicken";
        fridge[0][2] = "Fish";
        
        fridge[1][0] = "Lettuce";
        fridge[1][1] = "Eggs";
        fridge[1][2] = "Brocoli";
        
        fridge[2][0] = "Apple Juice";
        fridge[2][1] = "Milk";
        fridge[2][2] = "Soda";

        for(int i = 0; i < fridge.length; i++){
            System.out.println();

            for(int j = 0; j < fridge[i].length; j++){
                System.out.print(fridge[i][j] + " ");
            }
        }

        System.out.println();

        // ! 2 !

        String[][] people = 
                        {
                            {"John", "Abu", "Emmanuel"},
                            {"James", "Jose", "Gideon"},
                            {"Prez", "Quintin", "Lars"}
                        };

        for(int i = 0; i < people.length; i++){
            System.out.println();

            for(int j = 0; j < people[i].length; j++){
                System.out.print(people[i][j] + " ");
            }
        }

    }
}

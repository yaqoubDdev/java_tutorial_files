import java.util.Scanner;

public class Nested_loops {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        int cols;
        int rows;
        String symbol = "(^ ^)";

        System.out.println("Enter number of rows: ");
        rows = input.nextInt();
        
        System.out.println("Enter number of Colums: ");
        cols = input.nextInt();
        
        // System.out.println("Enter symbol to use: ");
        // symbol = input.next();

        for(int i = 1; i <= rows; i ++){
            System.out.println();

            for(int j = 1; j <= cols; j++){
                System.out.print(symbol);
            }
        }



        
        input.close();
    }
}

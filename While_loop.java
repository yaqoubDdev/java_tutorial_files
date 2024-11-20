import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // System.out.println("You are playing a game! Press x or X to quit");
        // String response = input.next();

        // int num = 0;

        // while (num < 10) {

        //     System.out.println(num);
        //     num++;
        // }
    
        String name = "";

        while(name.isBlank()){
            System.out.print("What is your name? > ");
            name = input.nextLine();
        }

        System.out.println("Hello "+name);

        input.close();
    }
}

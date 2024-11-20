public class working_w_Strings {
    public static void main( String[] args){

        String name = "Yakub";

        boolean result = name.equals("yakub");
        boolean result2 = name.equalsIgnoreCase("yakub");

        int name_length = name.length();

        // String as array
        char letter_in_name = name.charAt(3);
        // 

        // Serach indexof(char): returns int
        int index_of_char = name.indexOf("Y");

        // check if string is empty: returns boolean
        boolean is_empty = name.isEmpty();

        String name_uppercase = name.toUpperCase();
        
        String name_lowercase = name.toLowerCase();

        String changed_name = name.replace('k', 'c');


        // System.out.println(result);
        // System.out.println(result2);
        // System.out.println(name_length);
        // System.out.println(letter_in_name);
        // System.out.println(index_of_char);
        // System.out.println(is_empty);
        // System.out.println(name_uppercase);
        // System.out.println(name_lowercase);
        // System.out.println(changed_name);

    }
}

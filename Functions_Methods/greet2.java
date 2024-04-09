// Define a public class named greet2
public class greet2 {
    // The main method
    public static void main(String[] args) {
        // Call the str_ method and store the result in variable strr
        String strr = str_();
        // Print the result to the console
        System.out.println(strr);
    }

    // Define a static method named str_ that returns a string
    static String str_() {
        // Create a string variable named str and assign it the value "Hello World!"
        String str = "Hello World!";
        // Return the value of str
        return str;
    }
}

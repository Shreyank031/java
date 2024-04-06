package Functions_Methods;

import java.util.*;

public class varArgs {
    public static void main(String[] args) {
        varArgs("Hello, World", "java", 12, 44, 39, 97, 101);
        // varArgs() -> Ambiguity: you are not providing any arguments
        // so in varArgs it cannot be empty.
    }

    static void varArgs(String a, String b, int... var) {
        System.out.println(a);

    }
}

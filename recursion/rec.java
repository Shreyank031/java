import java.util.*;

public class rec {
	public static void main(String[] args) {

		fun();
	}

	static void fun() {
		System.out.println(1);
		fun();

	}
}
// recursion = When a function calls itself until a specific condition is met.
// stack overflow = when there is numerous function calls waiting due to rec.
// infinite rec -> Stack overflow.
// base case/condition = cond used to stop the rec. 'There is no rec being
// called go back'
// Recursion Tree = visual rep/Diagramatic representation of the process of
// recursive fun calls.
// Stack space = Stores the yet to be completed one.

Print the input!
Problem Statement
Take an integer as input and print it.
Input
The first line contains integer as input.

Constraints
1 <= N <= 10
Output
Print the input integer in a single line
Example
Sample Input:-
2

Sample Output:-
2

Sample Input:-
4

Sample Output:-
4


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
           Scanner  sc = new Scanner(System.in);
		   int a = sc.nextInt();
		   System.out.println(+a);         
	}
}
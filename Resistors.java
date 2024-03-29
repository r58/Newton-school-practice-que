Resistors
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given resistance value of N resistors. Find the net resistance of the system when all of these N resistors are connected in parallel.

If there are three resistors A1, A2, A3, when they are connected in parallel, the net resistance will be 1/((1/A1) + (1/A2) + (1/A3))

Since this number can also have a fraction part, you only have to print the floor of the result obtained.
For example, if value of 1/((1/A1) + (1/A2) + (1/A3)) if 7.54567, you only have to print 7.
Input
First line contains a single integer N denoting the number of resistors.
Next line contains N space separated integers containing the value of different resistors.

Constraints
1 ≤ N ≤ 10^5
1 ≤ Ai ≤ 10^9
Output
Print the integral part or floor of the value obtained from the formula 1/((1/A1) + (1/A2) + ..... + (1/AN)).
Example
Input
2
10 30

Output
7

1/((1/10) + (1/30)) = 30/4 = 7.5 and floor of 7.5 is 7


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		float ans = 0;
		int i = 0;
		float val = 0;

		for (i = 0;i < n; i++)
		{
			val = s.nextInt();
			ans = ans+(1/val);
	}
		ans = 1/ans;
		int res  = (int) Math.floor(ans);
		System.out.println(res);
		 

	}
}
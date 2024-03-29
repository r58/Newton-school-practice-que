The Dice Problem
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
You are given a cubic dice with 6 faces. All the individual faces have a numbers printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to find the number on the opposite face of the cube.
Input
The first line of the input contains a single integer T, denoting the number of test cases. Then T test case follows. Each test case contains a single line of the input containing a positive integer N.

Constraints:
1 <= T <= 100
1 <= N <= 6
Output
For each testcase, print the number that is on the opposite side of the given face.
Example
Input:
2
6
2

Output:
1
5

Explanation:
Testcase 1: For dice facing number 6 opposite face will have the number 1.


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner s = new Scanner (System.in);
		int t=0,num = 0,i=0;
		t = s.nextInt();

		for (i=0; i<t; i++)
		{
			num = s.nextInt();
			System.out.println(7-num);
		}
	}
}
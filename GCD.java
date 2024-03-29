GCD
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given 2 non-negative integers m and n, find gcd(m, n)
GCD of 2 integers m and n is defined as the greatest integer g such that g is a divisor of both m and n. Both m and n fit in a 32 bit signed integer.

NOTE: DO NOT USE LIBRARY FUNCTIONS
Input
Input contains two space separated integers, m and n

Constraints:-
1 < = m, n < = 10^18
Output
Output the single integer denoting the gcd of the above integers.
Example
Sample Input:
6 9

Sample Output:
3

Sample Input:-
5 6

Sample Output:-
1


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
            Scanner in = new Scanner (System.in);
            long m = in.nextLong();
            long n = in.nextLong();
            while(m%n!=0){
                long rem = m%n;
                m=n;
                n=rem;
            }
            System.out.println(n);
            
	}
}
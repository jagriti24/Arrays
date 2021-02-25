// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class BinaryArraySorting{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t > 0){
        	int n = sc.nextInt();
        	int array[] = new int [n];
        	for(int i=0; i<n; i++)
        		array[i] = sc.nextInt();

            Solution ob = new Solution();
            int result[] = new int[n];
            result =  ob.SortBinaryArray(array,n);

            for(int i=0; i<n; i++)
            	System.out.print(result[i]+" "); 
            System.out.println();
            t--;
        }
    } 
}


// } Driver Code Ends


//User function Template for Java


// Given a binary array A[] of size N. The task is to arrange the array in increasing order.

// Note: The binary array contains only 0  and 1.

// Example 1:

// Input:
// N = 5
// A[] = {1,0,1,1,0}
// Output: 0 0 1 1 1
// Example 2:

// Input:
// N = 10
// A[] = {1,0,1,1,1,1,1,0,0,0}
// Output: 0 0 0 0 1 1 1 1 1 1
// Your Task:
// Complete the function SortBinaryArray() which takes given array as input and returns the sorted array. 

// Expected Time Complexity: O(N).
// Expected Auxiliary Space: O(1).

// Challenge: Try doing it in one pass.

// Constraints:
// 1 <= N <= 106
// 0 <= A[i] <= 1
class Solution 
{ 
	static int[] SortBinaryArray(int arr[], int n) 
	{ 
	    // code here
	    int counter = 0;
	    int i=0;
	    while(i<arr.length && arr[i]==0){
	        counter++;
	        i++;
	    }
	    i=i+1;
	    for(; i<arr.length; i++){
	        if(arr[i]==0){
	           arr[counter]=0;
	           arr[i]=1;
	           counter++;
	        }
	    }
	    return arr;
	} 
} 

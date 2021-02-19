// { Driver Code Starts
//Initial Template for Java

//Initial Template for Java
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            String inputLine[] = br.readLine().trim().split(" "); 
            int n = Integer.parseInt(inputLine[0]); 
            int x = Integer.parseInt(inputLine[1]);
            
            int arr[] = new int[(int)(n)];
            
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine1[i]);
            }
            
            Solution obj = new Solution();
            ArrayList<Integer> ans = obj.firstAndLast(arr, n, x); 
            
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
    } 
} 
            


// } Driver Code Ends

// Given a sorted array having N elements, find the indices of the first and last occurrences of an element X in the given array.

// Note: If the number X is not found in the array, return '-1' as an array.

// Example 1:

// Input:
// N = 2 , X = 3
// arr[] = { 1, 3, 3, 4 }
// Output:
// 1 2
// Explanation:
// For the above array, first occurence
// of X = 3 is at index = 1 and last
// occurence is at index = 2.
// Example 2:

// Input:
// N = 4, X = 5
// arr[] = { 1, 2, 3, 4 }
// Output:
// -1
// Explanation: 
// As 5 is not present in the array,
// so the answer is -1.
// Your Task:
// You dont need to read input or print anything. Complete the function firstAndLast() that takes the array arr, its size N and the value X as input parameters and returns a list of integers containing the indices of first and last occurence of X.

// Expected Time Complexity: O(log(N))
// Expected Auxiliary Space: O(1)

// Constraints: 
// 1 <= N <= 10^5 

// 0 <= arr[i], X <= 109
//User function Template for Java
class FirstAndLastOccurance{
    public ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
        int start = -1, end =-1;
        
        for(int a=0; a< arr.length ; a++){
            if(arr[a]==x){
                if(start ==-1 ){
                    start = a;
                }
                end = a;
            }
        }
        if(start==-1){
            return new ArrayList<Integer>(List.of(-1));
        }
        return new ArrayList<Integer>(List.of(start,end));
    }
}

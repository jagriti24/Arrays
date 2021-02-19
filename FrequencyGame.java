//https://practice.geeksforgeeks.org/problems/frequency-game/1/?company[]=Google&amp;company[]=Google&amp;page=1&amp;query=company[]Googlepage1company[]Google#
Given an array A of size N. The elements of the array consists of positive integers. You have to find the largest element with minimum frequency.

Input Format: First line of input contains number of testcases T. For each testcase there will be two lines. First line contains N, next line contains N elements separated by spaces.

Output Format: For each testcase, print the largest element with minimum frequency.

User Task:
Your task is to complete the provided function LargButMinFreq(A, n) which accepts array A and n. Hence you have to return the largest element with minimum frequency.

Constraints:
1 <= T <= 100
1 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
1
5
2 2 5 50 1

Output:
50

Explanation :
Testcase 1: All elements are having frequency 1 except 2. 50 is the maximum element with minimum frequency.

Note: use HashMap to compute the element and its frequency.

class FrequencyGame
{
    // Function to find largest number with minimum frequency
    public static int LargButMinFreq(int arr[], int n)
    {   int min = Integer.MAX_VALUE;
        int tmp;
        Map<Integer,Integer> hashMap = new HashMap<Integer,Integer>();
        for(int a : arr){
            tmp= (!hashMap.containsKey(a))? 1 : hashMap.get(a)+1; 
            hashMap.put(a,tmp);
            if(min>tmp){
                min = tmp;
            }
        }
        tmp = Integer.MIN_VALUE;;
        for(Integer b : hashMap.keySet()){
            if(min == hashMap.get(b)){
                if(tmp<b){
                    tmp = b;
                }
            }
        }
        return tmp;
    }
}

// { Driver Code Starts.

// Driver class with main function
class GFG 
{
    // Main function
	public static void main (String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		// Iterating over testcases
		while(t-- > 0)
		{
		    int n = sc.nextInt();
		    int arr[] = new int[n];
		    
		    for(int i = 0; i < n; i++)
		     arr[i] = sc.nextInt();
		     
		    Geeks obj = new Geeks();
		    System.out.println(obj.LargButMinFreq(arr, n));
		}
	}

Link-https://practice.geeksforgeeks.org/problems/prime-number2314/1

//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.isPrime(N));
        }
    }
}
// } Driver Code Ends


class Solution{
    static int isPrime(int N){
        boolean isPrime=false;
        if(N==1)
        {
            return 0;
        }
        for(int div=2;div*div<=N;div=div+1)
        {
            if(N%div==0)
            {
                isPrime=true;
                break;
            }
        }
        if(isPrime==false)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}

class Solution {
    int missingNum(int arr[]) {
        // code here
        //approach 1 
        
        //sum of all numbers from 1 to n 
        int sum1 = 0;
        int n = arr.length + 1;
        sum1 += n*(n+1)/2;
        
        //sum of all the numbers that are present in the array
        int sum2 = 0;
        for(int i=0;i<arr.length;i++){
            sum2 += arr[i];
        }
        
        return sum1 - sum2;
    }
}
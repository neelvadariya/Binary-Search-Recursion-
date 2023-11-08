public class Binary_Search_Recursion {
    
    //Function defination
    public static int binarySearch(int[] arr,int low,int high, int x)
    {
        int result = -1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid] < x)
            {
                //traverse towards right side of an array
                //recursion
                binarySearch(arr, mid+1, high, x);
            }
            else
            {
                //traverse towards left side of an array
                //recursion
                binarySearch(arr, low, mid-1, x);
            }
        }
        return result;
    }
    
    public static void main(String[] arg)
    {
        int[] arr = {2,4,6,8,9,12,34,56,89,90};
        int low = 0;
        int high = arr.length - 1;
        int x = 29;
        //function call
        int result = binarySearch(arr,low,high,x);
        System.out.println("The array element is at position" + result);
    }
}


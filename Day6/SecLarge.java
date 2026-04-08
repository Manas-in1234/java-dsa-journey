public class SecLarge {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int largest = arr[0];
        int secondLargest = arr[0];
        for(int i : arr){
            if(i > largest){
                secondLargest = largest;
                largest = i;
            }else if(i > secondLargest && i != largest){
                secondLargest = i;
            }
        }
        System.out.println("Second largest element in the array is: " + secondLargest);
    }
}

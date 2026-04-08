
public class LinearSearch {
    public static void main(String []args){
        int arr[] = {1,2,3,4,5};
        int target = 7;
        boolean found = false;
        for(int i : arr){
            if(i == target){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("Element found in the array.");
        }else{
            System.out.println("Element not found in the array.");
        }
    }
}

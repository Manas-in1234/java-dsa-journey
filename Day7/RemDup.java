
public class RemDup {
    public static void main(String []args){
        int arr[] = {1,2,2,3,5,3,4,5,8,7,4};
        for(int i=0; i < arr.length; i++){
            boolean isDuplicate = true;
            for(int j =0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDuplicate = false;
                    break;
                }
            }
            if(isDuplicate){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

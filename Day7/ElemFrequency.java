public class ElemFrequency {
    public static void main(String []args){
        int arr[] = {1,2,4,2,5,1};
        for(int i = 0; i< arr.length; i++){
            int count = 1;
            for (int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            System.out.println("Element: " + arr[i] + ", Frequency: " + count);
        }
    }
}

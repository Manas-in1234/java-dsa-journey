public class ZeroEnd {
    public static void main(String []args){
        int arr[] = {0,5,8,23,9,0,4,5,1,5};
        int index = 0;
        for (int num : arr){
            if(num!=0){
                arr[index++] = num;
            }
        }
        while(index < arr.length){
            arr[index++] = 0;
        }
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}

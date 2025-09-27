public class Subarrays {
    
    public static void sub_arrays(int numbers[]){

        int count = 0;
        for(int i = 0;i<numbers.length;i++){
            int start = i;
            for(int j=i;j<numbers.length;j++){
                int end = j;
                for(int k = start ;k<=end;k++){
                    System.out.print(numbers[k] + " ");
                }
                count++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total count: " + count);
    }

    public static void main(String[] args) {
        int numbers[] = {2 , 4 , 6 , 8 , 10};
        sub_arrays(numbers);
    }
}

public class FizzBuzz {
    public static void main(String[] args) {
        int numbers = 30;
        for(int i = 1;i<=numbers;i++){

            if(i % 3 == 0 && i % 5 ==0){
                System.out.println("FizzBuzz");
            }
            else if(i % 3 == 0){
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }else{
                System.out.println(i);
            }
        }
        System.out.println();
            
    }
}

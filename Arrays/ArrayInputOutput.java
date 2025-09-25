import java.util.*;
public class ArrayInputOutput {
    public static void main(String[] args) {
        int marks[] = new int[100];
        
        Scanner sc = new Scanner(System.in); 
        System.out.println("Length of array is: " + marks.length);
        
        /*
        //! old metthod 
        int physics;
        physics = sc.nextInt();
        
        int chemistry;
        chemistry = sc.nextInt();
        
        int maths;
        maths = sc.nextInt();
        */

        /*New Array method */
        System.out.print("Enter Physics marks: ");
        marks[0] = sc.nextInt();//chemistry
        
        System.out.print("Enter Chemistry marks: ");
        marks[1] = sc.nextInt();//chemistry

        System.out.print("Enter Maths marks: ");
        marks[2] = sc.nextInt();//maths

        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Maths: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.print("Average marks: " + percentage);


    }
}

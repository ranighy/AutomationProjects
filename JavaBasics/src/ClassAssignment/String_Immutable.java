package ClassAssignment;
//Write a program to show String is immutable
//Strings are immutable, which means their values cannot be changed after they are created.
public class String_Immutable {
    public static void main(String[] args) {
        String str = "Rose flower ";
       String str1= str + "Pink";
       System.out.println(str);
       //int is mutable (we can change the value)
         int a = 10;
         int b = 20;
             a = a +b;
        System.out.println(a);


    }
}

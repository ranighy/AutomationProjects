package ClassAssignment;
/* Assign values of variables 'a' and 'b' as 55 and 70 respectively
and then check if both the conditions 'a < 50' and 'a < b' are true.
Now solve the above question to check if at least one of the conditions
'a < 50' or 'a < b' is true.
*/
public class Assignment_6_7 {
    public static void main(String[] args) {
        int a=55;
        int b=70;
        System.out.println(a < b && a < b);
        System.out.println(a < b || a < b);

        //if ((a < b) && (a < b)){
        //System.out.println("Both condition are true");
        // }
//        if ((a < b) || (a < b)) {
//
//            System.out.println("Print if one condition is true");
//        }
//else{
//            System.out.println("not true");
    }
}

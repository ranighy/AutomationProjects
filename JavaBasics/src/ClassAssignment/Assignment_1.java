package ClassAssignment;
/*Length and breadth of a rectangle are 5 and 7 respectively.
Write a program to calculate the area and perimeter of the rectangle
(area= 5*7) ---------- (perimeter = 2(5+7))*/

public class Assignment_1 {


    public static void main(String[] args) {
        int length= 5;
        int rectangle=7;
        int area=length*rectangle;
        int perimeter=2*(length+rectangle);
        System.out.println("Area:" + area);
        System.out.println("Perimeter:" + perimeter);

}

}

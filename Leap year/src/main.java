import java.util.*;
public class main
{
    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        if(y%100==0 && y%400==0 || y%100 != 0 && y%4 == 0 )
        {
            System.out.println("It is a leap year!");
        }
        else{
            System.out.println("Not a leap year!");
        }
    }
}
import java.util.Scanner;
public class area{
    public static void main(String[] args){
        int b,h;
        int ar;
        Scanner rd=new Scanner(System.in);
        b=rd.nextInt();
        h=rd.nextInt();
        ar=(b*h)/2;
        System.out.println(ar);
    }
}
package hyc.com.text;
import java.util.*;
/**
 * Created by Administrator on 13-7-24.
 */
public class Anlitextyear {
    public static void main(String[] args){
      //  System.out.println("床前明月光");
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年");
        int year = scanner.nextInt();
        System.out.println("输入月");
        int month = scanner.nextInt();
        int days;
        if (month==2){
            if (year%4==0 &&(year%400==0||year%100!=0)){
                days = 29;
            }else
            {
                days=28;
            }
        }else {
            if (month== 4 || month == 6 || month == 9 || month==11){
                days = 30;
            }else{
                days = 31;
            }
        }
        System.out.print(year+"年"+month+"月有"+days+"天");

    }
}

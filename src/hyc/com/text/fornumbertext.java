package hyc.com.text;
/**
 * Created by Administrator on 13-7-24.
 */
public class fornumbertext {
    public static void main(String[] args){
        char[] arraylist = new char[26];
        char temp = 'A';
        for (int i=0;i<26;i++){
            if (i!=0){
                temp++;
            }
            arraylist[i] = temp;
        }
        for (int i=0;i<26;i++){
            System.out.println("第"+(i+1)+"个英文字母是："+arraylist[i]);
        }
    }
}

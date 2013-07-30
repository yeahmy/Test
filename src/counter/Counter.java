package counter;


import java.util.Scanner;

/**
 * Created by Administrator on 13-7-30.
 */
public class Counter {
    public static void main(String[] args) {
        String s;
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一行字符:");
        s=scanner.next();
        char[] chars=s.toCharArray();
        int chinese=0;
        int english=0;
        int number=0;
        int others=0;
        for (int i = 0; i <chars.length ; i++) {
            if(chars[i]>='A'&&chars[i]<='z'){
                english++;
            } else if( chars[i]>=19968&&chars[i]<=39968){
                chinese++;

            }else if(chars[i]>=48&&chars[i]<=57){
                number++ ;
            }else{
                others++ ;
            }

        }
        System.out.println("英文个数:"+english);
        System.out.println("中文个数："+chinese);
        System.out.println("数字个数："+number);
        System.out.println("其他个数："+others);
    }


}

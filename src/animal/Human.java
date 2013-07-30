package animal;

import javafx.scene.DepthTest;

/**
 * Created by Administrator on 13-7-30.
 */
public class Human implements Animal {
    private double height;
    private String skin;

    public  void breath(){
        System.out.println("breathing...");
    }
    public  void eat(){
        System.out.println("eating");
    }
    public  String respond(String s){
        if (s=="happy"){
            return "smile";
        }else{
            return"cry";
        }
    }
    public String test(double n){
        if(n>=80){
            return "A";
        }else if(n>=60){
            return "B";
        }else {
            return"C";
        }
    }
    public Boolean shopping(String s,double doller){
        if (s=="like"&&doller<10000){
            return true;//true 表示买下
        } else if(s=="dislike"||doller>10000){
            return false;
        } else {
            return false;
        }
    }

}

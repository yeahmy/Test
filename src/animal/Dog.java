package animal;

/**
 * Created by Administrator on 13-7-30.
 */
public class Dog implements Animal {
    private String kind;
    private double weight;

    public  void breath(){
        System.out.println("Dog can breath...");

    }
    public  void eat(){
        System.out.println("Dog also can eat...");

    }
    public  String respond(String s ){
        if (s=="happy"){
         return "smile";
        }else{
           return"cry";
        }

    }
}

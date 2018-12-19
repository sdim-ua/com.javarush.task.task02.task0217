

public class Solution {
     public static int min(int a, int b, int c, int d){
        //напишите тут ваш код
      
        if(b > c && c > d && d > a ){
           return a;
        }
        else if (a > c && c > d && d > b ){
            return b;
        }
        else if (a > b && b > d && d > c ){
            return c;
        }
         else {
            return d;
         }
       
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}

import java.util.*;
public class ReverseString {

    public static String revStr(String str){
        Stack<Character> s= new Stack<>();
        int idx=0;
        while(idx<str.length()){
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder res = new StringBuilder(" ");
        while(!s.isEmpty()){
            char curr=s.pop();
            res.append(curr);
        }
      str= res.toString();
      return str; 
    }
    public static void main(String[] args) {
        String str="abc";
        String res = revStr(str);
        System.out.println(res);

    }   
}

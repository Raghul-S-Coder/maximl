import java.util.*;
public class element{
     public static void main(String []args){
        Scanner s=new Scanner (System.in);
        String ss=s.nextLine();
        TreeSet<Character> ch=new TreeSet<>();
        char [] c=ss.toCharArray();
        for(int i=0;i<c.length;i++)
          ch.add(c[i]);
         System.out.println(ch.size());
     }
}

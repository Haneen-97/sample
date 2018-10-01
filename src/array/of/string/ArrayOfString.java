
package array.of.string;

import java.util.Scanner;
public class ArrayOfString {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String[] n=new String[3];
       for(int i=0;i<n.length;++i)
       {
           n[i]=in.nextLine();
       }
       System.out.print("Right (r) or left (l)?: ");
      char position=in.next().charAt(0);
       String[] na=cc(n,position);
          for(int i=0;i<n.length;++i)
       {
           System.out.print(na[i]+" ");
       }
       
    
    }
    public static String[] cc(String[] x,char r)
    {
        if(Character.toUpperCase(r)=='l'){
        for(int i=0;i<x.length-1;++i)
        {
            String temp=x[i];
            x[i]=x[i+1];
            x[i+1]=temp;
        }
        return x;
    }
        else if(Character.toUpperCase(r)=='r'){
            for(int i=x.length-1;i>0;++i)
        {
            String temp=x[i];
            x[i]=x[i-1];
            x[i-1]=temp;
        }
           return x; 
        }
        return x;
}
}

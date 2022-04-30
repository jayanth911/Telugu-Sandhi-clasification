import java.util.*;

import javax.swing.SortingFocusTraversalPolicy;
/**
 * 
 * -> I represented Every letter in telugu alphabets as a four-digit number 
 * -> In that 4 digits the first 2 digits represents the hallu and the next 2 digits represents acchu
 * -> eg: అ: 11 ; ఆ: 12;  ఇ: 13;...... అం: 28 అః: 29;     క: 30; ఖ:31; గ:32;......హ: 62; ళ:63 ; క్ష: 64; ఱ: 65
 * -> for vathulu in telugu split the vathu and convert every letter as 4 digt number
 * -> (just being a prototype i used this number system, later i will update another easy way to input data)
 * -> each word will be a arraylist as each letter will be the element in it
 */
public class telugusandulu {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //i used the exmple word as మహి(5411,6213) , ఈశుడు(14,5915,4215) and the answer should be మహీశుడు
        ArrayList<Integer> ar1 = new ArrayList<>();
        ar1.add(5411);
        ar1.add(6213);
        ArrayList<Integer> ar2 = new ArrayList<>();
        ar2.add(20);
        ar2.add(5916);
        ar2.add(4215);
      ArrayList<Integer> res =  savarnadeerg(ar1, ar2);
      if(res.size()==0) System.out.println("its Not savarnadheerga snadhi");
      else{
          System.out.println("yes its savarnadheerga sandhi");
      for(int i : res)
      {
          System.out.print(i+" ");
      }
    }
    static ArrayList<Integer> savarnadeerg(ArrayList<Integer> ar1,ArrayList<Integer> ar2)
    {
        int a = ar1.get(ar1.size()-1);
        int b = ar2.get(0);
        System.out.println(b);
        int a1 = a%100;
        int  b1=b;
        if(a1>18||b1>18||a1<11||b1<11) return new ArrayList<>();
        a1+=(a1&1);
        b1+=(b1&1);
        
        if(a1==b1)
        {
            ar1.set(ar1.size()-1,ar1.get(ar1.size()-1)+(ar1.get(ar1.size()-1)&1)); 
            ar2.remove(0);
            ar1.addAll(ar2);
            return ar1;
        }
        System.out.print(a1+" "+b1);

        return new ArrayList<>();
    }
}
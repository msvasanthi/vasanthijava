package pavan;

import java.io.File;

public class countvowel {
    public static void main(String[] args) {
        String str = "welcome to java program ";
//      str=  str.toLowerCase();
//     int  vcount=0,ccount=0;
//      for (int i=0;i<str.length();i++) {
//          char ch = str.charAt(i);
//          if (ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' || ch == 'a')
//              vcount++;
//          else
//              ccount++;


//      }
//        System.out.println(vcount);
//        System.out.println(ccount);
        //remove space
        // System.out.println( str.replace(" ",""));
        //System.out.println(str.replace('w', 'h'));

        //reverce string
//        char[] ch=str.toCharArray();
//        for (int i=ch.length-1;i>=0;i--){
//            System.out.print(ch[i]);
//        }
        //count no of words
//int count=0;
//String []str1=str.split(" ");
//        for (String words:str1
//             ) {
//            count++;
//            System.out.println(words);
//
//        }
//        System.out.println(count);



        //count letters
//      char ch;int count=0;
//      str=str.replace(" ","");
//        for (int i=str.length()-1;i>0;i--) {
//            System.out.println( str.charAt(i));
//            count++;
//
//        }




        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // if(ch == 'a'||  ch =='i'|| ch=='e' || ch=='o'|| ch='u')
            if (ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u' || ch == 'a')
                System.out.println("vowel is present");
        }
    }
}

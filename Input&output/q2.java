// 2. Enter the string from user using BufferedStreamReader

import java.io.InputStreamReader;
import java.io.BufferedReader;

class main
 {
    public static void main(String st[])
    {
      try{
          InputStreamReader input = new InputStreamReader(System.in);
           BufferedReader br = new BufferedReader(input);

            System.out.print("Enter the String:");
            String str = br.readLine();
            System.out.println("String:"+str);
        }

            catch(java.io.IOException e)
               {
                   System.out.println(e.getMessage());
                }
         }
 }          
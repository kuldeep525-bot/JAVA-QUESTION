
// 3. Write a Java method to display the middle character of a string. Note: a) If the length of the string is odd there will be two middle characters. b) If the length of the string is even there will be one middle character.

class middleChareacter{
  void character(String word){

      int length=word.length();

      if(length%2==0)
      {
        int middleword=length/2;
        System.out.println("Middle character: " + word.charAt(middleword));
      }

      else{
          int middleword1=length/2;
        int middleword2=(length/2)-1;
        System.out.println("Middle character 1: " + word.charAt(middleword1));
        System.out.println("Middle character 2: " + word.charAt(middleword2));
      }
  }
}


class main{
  public static void main(String st[])
  {
    middleChareacter obj1=new middleChareacter();
    obj1.character("kuldeepkumarr");
  }
}
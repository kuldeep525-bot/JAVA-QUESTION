// 4. Write a Java method to count all the words in a string.

class count{

  void words(String sentence){
     int count =1;

    for(int i=0;i<sentence.length();i++)
    {
      if(sentence.charAt(i) == ' ')
      {
        count ++;
      }
    }
  
  System.out.println("In this total words:"+count);

  }

}

class main{
  public static void main(String st[])
  {
    count obj1=new count();
    obj1.words("count the word");
  }
}
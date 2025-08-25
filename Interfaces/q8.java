// 8. Write a Java program to create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports

interface Playable{
  void play();
}

class Football implements Playable{
  //override
  public void play()
  {
    System.out.println("play footbal");
  }
}


class Volleyball implements Playable{
    public void play()
  {
    System.out.println("play volleyball");
  }
}


class Basketball implements Playable{
    public void play()
  {
    System.out.println("play basketball");
  }
}

class main{
  public static void main(String st[])
  {
    Volleyball volleyball=new Volleyball();
    volleyball.play();

    Basketball basketball=new Basketball();
    basketball.play();

    Football footbal=new Football();
    footbal.play();
  }
}
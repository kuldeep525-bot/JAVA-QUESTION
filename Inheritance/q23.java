// 23. Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods to play and tune each instrument.


abstract class Instrument {
    public abstract void play();

    public abstract void tune();
}

class Glockenspiel extends Instrument {
  
    public void play() {
        System.out.println("Glockenspiel is playing a melodious tune.");
    }
  
    public void tune() {
        System.out.println("Glockenspiel is being tuned.");
    }
}


class Violin extends Instrument {

    public void play() {
        System.out.println("Violin is playing a beautiful melody.");
    }

    public void tune() {
        System.out.println("Violin is being tuned.");
    }
}


 class main {
    public static void main(String st[]) {
        Instrument glockenspiel = new Glockenspiel();
        Instrument violin = new Violin();

        System.out.println("Playing and tuning the Glockenspiel:");
        glockenspiel.play();
        glockenspiel.tune();

        System.out.println("\nPlaying and tuning the Violin:");
        violin.play();
        violin.tune();
    }
}
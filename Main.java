public class Main{

    public static void main(String[] args){

        monitor Monitor = new monitor();
        monitor Monitor2 = new monitor();

        Monitor.start();

        System.out.println(Monitor.color);
        System.out.println(Monitor.hz);
        System.out.println("\n" + Monitor.size);



        System.out.println(Monitor2.model);
        System.out.println(Monitor2.prize);


        Monitor.shutdown();


        guitar Myguitar = new guitar();

        System.out.println("\n");

        System.out.println("The guitar you playing was" + Myguitar.model);
        System.out.println("A fine " + Myguitar.guitarmodel );

        Myguitar.play();

    }
}
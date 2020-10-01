package Facade;

public class HomeTheatherFacadeTest {
    public static void main(String[] args){
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Lights lights = new Lights();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();

        HomeTheatherFacade homeTheatherFacade = new HomeTheatherFacade(amplifier, dvdPlayer, cdPlayer, projector, lights, screen, popcornPopper);
        homeTheatherFacade.watchMovie("Home Alone");
        homeTheatherFacade.endMovie();
    }
}
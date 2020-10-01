package Facade;

public class HomeTheatherNonFacadeTest {
    public static void main(String[] args){
        Amplifier amplifier = new Amplifier();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Lights lights = new Lights();
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();

        //instead of just call watchMovie(); we have to write everything by our own, facade solve it by calling one method - watchMovie!
        popcornPopper.turnOn();
        popcornPopper.pop();
        amplifier.turnOn();
        amplifier.setVolume(10);
        lights.turnOn();
        lights.dim(10);
        screen.up();
        dvdPlayer.turnOn();
        dvdPlayer.play();
    }
}
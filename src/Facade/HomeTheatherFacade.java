package Facade;

public class HomeTheatherFacade {
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    Lights lights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheatherFacade(Amplifier amplifier, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, Lights lights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movieTitle) {
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

    public void endMovie() {
        dvdPlayer.turnOff();
        screen.down();
        lights.turnOff();
        amplifier.turnOff();
    }
}

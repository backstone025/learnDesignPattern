package org.example;

import org.example.ExampleOfFacadePattern.FacadeObjects.*;
import org.example.ExampleOfFacadePattern.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner(amp);
        StreamingPlayer player = new StreamingPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp,
                tuner, player, projector, lights, screen, popper);
        homeTheaterFacade.watchMovie("인디아나 존스:레이더스");
        homeTheaterFacade.endMovie();

    }
}
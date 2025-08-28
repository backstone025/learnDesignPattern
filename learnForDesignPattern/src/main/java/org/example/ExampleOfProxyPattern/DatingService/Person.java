package org.example.ExampleOfProxyPattern.DatingService;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Person extends Remote {
    String getName();
    String getGender();
    String getInterests();
    int getGeekRating();

    void setName(String name);
    void setGender(String gender);
    void setInterests(String interests);
    void setGeekRating(int rating);
}

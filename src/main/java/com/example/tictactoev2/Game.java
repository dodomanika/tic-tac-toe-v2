package com.example.tictactoev2;

import java.net.URI;

public class Game {

    private GameStatus status;
    private User gameCreatorUser;
    private URI invitationAddress;

    public Game(User user) {
        this.gameCreatorUser = user;
        this.status = GameStatus.AWAITING_FOR_PLAYERS;
        this.invitationAddress = URI.create("http://localhost:8080/game");
    }

    public GameStatus getStatus() {
        return status;
    }

    public User getGameCreatorUser() {
        return gameCreatorUser;
    }

    public URI getInvitationAddress() {
        return invitationAddress;
    }
}

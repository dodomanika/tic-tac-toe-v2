package com.example.tictactoev2;

public class GameCreator {
    public Game create(User user) {
        return new Game(user);
    }
}

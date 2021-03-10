package com.vabas.patterns.facade;

public class PlayFlow {
    Game game = new Game();
    PlayTracker playTracker = new PlayTracker();
    Player player = new Player();

    public void playInGame() {
        game.playGame();
        playTracker.startSprint();
        player.playInGame(playTracker);
        playTracker.finishSprint();
        player.playInGame(playTracker);
    }
}

package com.example.tictactoev2;

import org.junit.jupiter.api.Test;

import static com.example.tictactoev2.GameStatus.AWAITING_FOR_PLAYERS;
import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @Test
    void shouldCreateGameWithAwaitingForPlayersStatus() {
        User user = new User();
        GameCreator gameCreator = new GameCreator();

        Game game = gameCreator.create(user);

        assertThat(game.getStatus()).isEqualTo(AWAITING_FOR_PLAYERS);
        assertThat(game.getGameCreatorUser()).isEqualTo(user);

        assertThat(game.getInvitationAddress()).hasScheme("http");
        assertThat(game.getInvitationAddress()).hasHost("localhost");
        assertThat(game.getInvitationAddress()).hasPort(8080);
        assertThat(game.getInvitationAddress()).hasPath("/game");
    }
}

package racing;

import racing.domain.RacingGame;
import racing.model.policy.BooleanForward;

public class Main {

	public static void main(String[] args) {
		RacingGame racingGame = new RacingGame(new BooleanForward());
		racingGame.start();
	}
}

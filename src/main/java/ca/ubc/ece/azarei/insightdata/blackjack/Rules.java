/**
 * This class modes the rules and states in a blackjack game. Rules differ in various versions of
 * the game. This class is intended to encapsulates the rules.
 */
package ca.ubc.ece.azarei.insightdata.blackjack;

/**
 * @author Alexander Zarei
 */
public class Rules {

	/**
	 * Determines what is the outcome of the game for a player when the every player and the dealer
	 * has done their playing.
	 * 
	 * @param gambler
	 * @return
	 */
	public static GamblerStatus determineStatus(Gambler gambler) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @param table
	 */
	public static void updateStatuses(Table table) {

		GamblerStatus dealerStatus = table.getDealer().getStatus();
		int dealerPoints = table.getDealer().getHand().getHandPoints();
		for (Player player : table.getPlayers()) {
			GamblerStatus playerStatus = player.getStatus();
			int playerPoints = player.getHand().getHandPoints();

			if (playerStatus == GamblerStatus.BUSTED) {
				// the player busted so she already lost!
				player.setStatus(GamblerStatus.BUSTED);
			} else if (player.getStatus() == GamblerStatus.BLACKJACK) {
				if (dealerStatus == GamblerStatus.BLACKJACK) {
					// if player and dealer are both blackjacks it is a push!
					player.setStatus(GamblerStatus.PUSH);
				} else {
					// if player has blakcjack he wins with a blackjack no matter waht! pleae not
					// that a blackjack returns 3:2
					player.setStatus(GamblerStatus.BLACKJACK);
				}
			} else if (playerStatus == GamblerStatus.STAND) {
				if (dealerStatus == GamblerStatus.BUSTED) {
					// if the player stood and the dealer busted the player wins
					player.setStatus(GamblerStatus.WON);
				} else if (dealerStatus == GamblerStatus.STAND) {
					// if both the player and the dealer stood the points are compared
					if (playerPoints < dealerPoints) {
						player.setStatus(GamblerStatus.LOST);
					} else if (playerPoints > dealerPoints) {
						player.setStatus(GamblerStatus.WON);
					} else if (playerPoints == dealerPoints) {
						player.setStatus(GamblerStatus.PUSH);
					}
				}
			}
		}

	}
}

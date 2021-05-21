package exam2retry;

import java.util.ArrayList;
import java.util.Scanner;

public class SlotMachine {

	private Name slotName;
	private int balance;
	private int jackpotWinnningPull;
	private int jackpotAmount;
	private int regularWinningPull;
	private int regularWinAmount;
	private int regularAmountOfWins;
	private int jackpotAmountOfWins;
	private int counter;
	private final int cost = 1;

	public SlotMachine() {

	}

	public SlotMachine(Name name, int balance, int regularWinningPull, int regularWinAmount, int jackpotWinningPull,
			int jackpotAmount, int regularAmountOfWins, int jackpotAmountOfWins, int counter) {
		this.slotName = name;
		this.balance = balance;
		this.regularWinningPull = regularWinningPull;
		this.jackpotWinnningPull = jackpotWinningPull;
		this.regularWinAmount = regularWinAmount;
		this.jackpotAmount = jackpotAmount;
		this.regularAmountOfWins = regularAmountOfWins;
		this.jackpotAmountOfWins = jackpotAmountOfWins;
		this.counter = counter;
	}

	public Name getSlotName() {
		return slotName;
	}

	public int getBalance() {
		return balance;
	}

	public int getJackpotWinnningPull() {
		return jackpotWinnningPull;
	}

	public int getJackpotAmount() {
		return jackpotAmount;
	}

	public int getRegularWinningPull() {
		return regularWinningPull;
	}

	public int getRegularWinAmount() {
		return regularWinAmount;
	}

	public int getRegularAmountOfWins() {
		return regularAmountOfWins;
	}

	public int getJackpotAmountOfWins() {
		return jackpotAmountOfWins;
	}

	public int getCounter() {
		return counter;
	}

	public int getCost() {
		return cost;
	}

	public void setSlotName(Name slotName) {
		this.slotName = slotName;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void setJackpotWinnningPull(int jackpotWinnningPull) {
		this.jackpotWinnningPull = jackpotWinnningPull;
	}

	public void setJackpotAmount(int jackpotAmount) {
		this.jackpotAmount = jackpotAmount;
	}

	public void setRegularWinningPull(int regularWinningPull) {
		this.regularWinningPull = regularWinningPull;
	}

	public void setRegularWinAmount(int regularWinAmount) {
		this.regularWinAmount = regularWinAmount;
	}

	public void setRegularAmountOfWins(int regularAmountOfWins) {
		this.regularAmountOfWins = regularAmountOfWins;
	}

	public void setJackpotAmountOfWins(int jackpotAmountOfWins) {
		this.jackpotAmountOfWins = jackpotAmountOfWins;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	public void playGame(ArrayList<Player> players, ArrayList<SlotMachine> slotGames, Scanner userInput, int gameChoice,
			int userChoice) {

		char again = 'n';
		System.out.println(slotGames.get(gameChoice).toString());

		this.balance = slotGames.get(gameChoice).getBalance();
		this.jackpotAmount = slotGames.get(gameChoice).getJackpotAmount();
		this.jackpotWinnningPull = slotGames.get(gameChoice).getJackpotWinnningPull();
		this.regularWinAmount = slotGames.get(gameChoice).getRegularWinAmount();
		this.regularWinningPull = slotGames.get(gameChoice).getRegularWinningPull();
		this.regularAmountOfWins = slotGames.get(gameChoice).getRegularAmountOfWins();
		this.jackpotAmountOfWins = slotGames.get(gameChoice).getJackpotAmountOfWins();
		this.counter = slotGames.get(gameChoice).getCounter();
		int playerWins = players.get(userChoice).getWins();
		int playerLoses = players.get(userChoice).getLoses();
		do {
			players.get(userChoice).toString();
			System.out.printf("\nInsert $" + getCost());
			System.out.print("\nPress 1 to continue.");
			int play = Integer.parseInt(userInput.next());
			if (players.get(userChoice).getBalance() > 0) {
				System.out.println("=============================");
				System.out.println("     Inserting a dollar.     ");
				System.out.println("=============================");
			} else {
				System.out.println("Sorry, you do not have enough money to play.");
				return;
			}
			try {
				Thread.sleep(1000);
				System.out.println("=============================");
				System.out.println("       ...Spinning...        ");
				System.out.println("=============================");
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
			counter++; // counter for wins
			int playerBal = players.get(userChoice).getBalance(); // temp hold the balance of player
			playerBal--;
			int gameBal = slotGames.get(gameChoice).getBalance(); // temp hold the balance of game.
			gameBal++;
			if (counter == regularWinningPull || counter == jackpotWinnningPull) {
				System.out.println("=============================");
				System.out.println("           WINNER!           ");
				System.out.println("=============================");
				if (counter == regularWinningPull) {
					playerBal += this.regularWinAmount;
					gameBal -= this.regularWinAmount;
					this.regularAmountOfWins += 1;
					playerWins++;
					players.get(userChoice).setWins(playerWins + 1);

				} else if (counter == jackpotWinnningPull) {
					System.out.println("=============================");
					System.out.println("       JACKPOT WINNER!       ");
					System.out.println("=============================");
					playerBal += this.jackpotAmount;
					gameBal -= this.jackpotAmount;
					this.jackpotAmountOfWins += 1;
					playerWins++;
				} else {

				} // end if-elseif-else
			} else {
				System.out.println("Sorry, you did not win.");
				playerLoses++;
			}
			players.get(userChoice).setBalance(playerBal);
			slotGames.get(gameChoice).setBalance(gameBal);
			System.out.printf("\nYour new balance is: $" + playerBal);
			System.out.print("\nWould you like to play again (y/n): ");
			again = userInput.next().charAt(0);
		} while (again == 'y' || again == 'Y' && (players.get(userChoice).getBalance() > 0));
		players.get(userChoice).setWins(playerWins);
		players.get(userChoice).setLoses(playerLoses);
	}// end playGame method

	public String toString() {
		String result;
		result = "\n\n=============================\n\nWelcome to " + getSlotName() + "!\nOver "
				+ getRegularAmountOfWins() + " winners with " + getJackpotAmountOfWins()
				+ " winners of the jackpot! \nEvery play is $" + getCost() + ". \nJackpot is currently $"
				+ getJackpotAmount() + "! \nRegular wins get $" + getRegularWinAmount()
				+ ". \nHave fun!\n\n=============================";
		return result;
	}// end toString

}// end SlotMachine class
package exam2retry;

import java.util.*;

public class MenuSystem {

	private int choice;
	private int choice2;
	private int playerChoice;
	private boolean player = false;
	Scanner userInput = new Scanner(System.in);

	public MenuSystem(ArrayList<Player> players, ArrayList<SlotMachine> slotGames) {

		welcome();

		int userpick = 0;
		int cntr = 0;
		do {
			showMenu(players, choice2);
			cntr++;
			if (cntr == 1 && choice2 != 3) {
				choice = 1;
			} else {
				this.choice = choice2;
			}
			switch (choice) {
			case 1:
				loginPlayer(players, userInput);
				break;
			case 2:
				playSlots(players, slotGames, playerChoice, userInput);
				break;
			case 3:
				newGame(slotGames, userInput);
				break;
			case 4:
				playerStats(players, userInput);
				break;
			case 5:
				System.out.println("\n\n\n\nThanks for checking out my program.");
				System.exit(1);
			default:
				System.out.println("Please enter a valid option.");
				break;

			}
		} while (choice != 1 || choice != 2 || choice != 3);

	} // end MenuSystem constructor

	public int loginPlayer(ArrayList<Player> players, Scanner userInput) {

		char playerOption;
		int n = 0;
		do {
			System.out.println("==============================");
			System.out.println("||          Login           ||");
			System.out.println("==============================");
			System.out.println();

			for (Player i : players) {
				if (i != null) {
					n++;
					System.out.printf("\n %d. ", n);
					System.out.println(i.getName());
				}
			}

			System.out.printf("\nChoose a player or (c)reate a new player: ");
			playerOption = userInput.next().charAt(0);
			if (playerOption == 'c') {
				System.out.println("Let's create a new login.");
				newPlayer(players, userInput);
				return -1;
			} else {
				this.playerChoice = (Character.getNumericValue(playerOption) - 1);
				System.out.printf("\n\nYou have chosen %s as your player", players.get(playerChoice).getName());
				System.out.println(players.get(playerChoice).toString());
			}
		} while (playerChoice < 0 && playerChoice > (players.size() - 1));
		return this.playerChoice;

	}// end loginPlayer method

	public void newGame(ArrayList<SlotMachine> slotGames, Scanner userInput) {
		String gameFirstName, gameSecondName;
		int balance;
		int jackpotWinnningPull;
		int jackpotAmount;
		int regularWinningPull;
		int regularWinAmount;
		System.out.println("=======Game Creation=======");
		System.out.print("\nWhat is the first word of the name for the new game: ");
		gameFirstName = userInput.next();
		System.out.print("\nWhat is the second word of the name for the new game: ");
		gameSecondName = userInput.next();
		System.out.print("\nHow much money is the game starting with: ");
		balance = Integer.parseInt(userInput.next());
		System.out.print("\nHow much money is a regular win: ");
		regularWinAmount = Integer.parseInt(userInput.next());
		System.out.print("\nHow many pulls needed for a win: ");
		regularWinningPull = Integer.parseInt(userInput.next());
		System.out.print("\nHow much money is a jackpot win: ");
		jackpotAmount = Integer.parseInt(userInput.next());
		System.out.print("\nHow many pulls needed for a jackpot win: ");
		jackpotWinnningPull = Integer.parseInt(userInput.next());

		SlotMachine slotGames1;
		slotGames1 = new SlotMachine(new Name(gameFirstName, gameSecondName), balance, regularWinningPull,
				regularWinAmount, jackpotWinnningPull, jackpotAmount, 0, 0, 0);
		slotGames.add(slotGames1);
		System.out.println("New game," + slotGames1.getSlotName() + ", has been created!");
		System.out.println(slotGames.toString());

	}// end newGame method

	public void newPlayer(ArrayList<Player> players, Scanner userInput) {

		String firstname, middlename = null, lastname;
		int birthday, birthmonth, birthyear;
		int balance;
		System.out.println("=======Player Creation=======");
		System.out.print("\n\nWhat is the first name of the new player: ");
		firstname = userInput.next();
		System.out.println("Do you have a middle name (y/n): ");
		char midanswer = userInput.next().charAt(0);
		if (midanswer == 'n' || midanswer == 'N') {

		} else if (midanswer == 'y' || midanswer == 'Y') {
			System.out.print("\n\nWhat is the middle name of the new player: ");
			middlename = userInput.next();
		}
		System.out.print("\n\nWhat is the last name of the new player: ");
		lastname = userInput.next();
		System.out.print("\n\nWhat is the birth month of the new player: ");
		birthmonth = Integer.parseInt(userInput.next());
		System.out.print("\n\nWhat is the birth day of the new player: ");
		birthday = Integer.parseInt(userInput.next());
		System.out.print("\n\nWhat is the birth year of the new player: ");
		birthyear = Integer.parseInt(userInput.next());
		System.out.print("\n\nWhat is the starting balance of the new player: ");
		balance = Integer.parseInt(userInput.next());

		Player player;
		if (midanswer == 'n' || midanswer == 'N') {
			player = new Player(new Name(firstname, lastname), new Date(birthmonth, birthday, birthyear), balance, 0,
					0);
		} else {
			player = new Player(new Name(firstname, middlename, lastname), new Date(birthmonth, birthday, birthyear),
					balance, 0, 0);
		}
		players.add(player);
		System.out.println("New Player Added!");
		System.out.println(player.toString());

	}// end newPlayer method

	public void playerStats(ArrayList<Player> players, Scanner userInput2) {
		int playerChoice;
		char again = 'n';
		int n = 0;
		do {
			System.out.println("==============================");
			System.out.println("||       Player Stats       ||");
			System.out.println("==============================");
			System.out.println();

			for (Player i : players) {
				if (i != null) {
					n++;
					System.out.printf("\n %d. ", n);
					System.out.println(i.getName());
				}
			}
			System.out.print("Who's stats would you like to see (0 to cancel): ");
			playerChoice = (Integer.parseInt(userInput.next()) - 1);
			if (playerChoice == -1) {
				return;
			} else {

				try {
					Thread.sleep(1000);
					System.out.println("=============================");
					System.out.println("     Accessing records...    ");
					System.out.println("=============================");
					Thread.sleep(2000);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(players.get(playerChoice).toString());
			}
			System.out.println();
			System.out.print("Would you like to see another record (y/n): ");
			again = userInput.next().charAt(0);
		} while (again == 'y' || again == 'Y');

	} // end playerStats method

	public void playSlots(ArrayList<Player> players, ArrayList<SlotMachine> slotGames, int userChoice,
			Scanner userInput) {
		int count = 0;
		int gameChoice = 0;
		for (SlotMachine i : slotGames) {
			count++;
		}

		do {
			int y = 1;
			System.out.println("==============================");
			System.out.println("||      AVAILABLE GAMES     ||");
			System.out.println("==============================");
			System.out.println();
			System.out.println();
			for (SlotMachine x : slotGames) {

				System.out.println(y + ". " + x.getSlotName());
				y++;
			}
			System.out.println("==============================");
			System.out.print("\nPlease pick a game to play (0 to quit): ");
			gameChoice = (Integer.parseInt(userInput.next()) - 1);
			if (gameChoice == -1) {
				return;
			} else {
				slotGames.get(gameChoice).playGame(players, slotGames, userInput, gameChoice, userChoice);
			}
		} while (gameChoice < 0 && gameChoice > (slotGames.size() - 1));

	}// end playSlots method

	public void showMenu(ArrayList<Player> players, int choice2) {

		System.out.println();
		System.out.println("==============================");
		System.out.println("||      1. Login            ||");
		System.out.println("||      2. Play Slots       ||");
		System.out.println("||      3. Create new Game  ||");
		System.out.println("||      4. Player Stats     ||");
		System.out.println("||      5. Quit             ||");
		System.out.println("==============================");
		System.out.println();
		System.out.printf("Choose an option: ");
		this.choice2 = Integer.parseInt(userInput.next());

	}// end showMenu method

	public void welcome() {
		System.out.println("==============================");
		System.out.println("||        Welcome to        ||");
		System.out.println("||        Las Vegas         ||");
		System.out.println("==============================");
	} // end welcome method

}// end MenuSystem class
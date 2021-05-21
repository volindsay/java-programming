//***************************************************************************
//***************************************************************************
//***                                                                     ***
//***                  Uncle Charlie Goes to Vegas                        ***
//***                                                                     ***
//***                                                                     ***
//***          Written by  :  Vincent Lindsay                             ***
//***          Date written:  10/28/2018                                  ***
//***          Purpose     :  To create a program utilizing               ***
//***                         composite classes and objects               ***
//***                         to create multiple users and games          ***
//***                         with checks to make sure the proper         ***
//***                         values are provided by the user.            ***
//***                                                                     ***
//***                                                                     ***
//***                                                                     ***
//***                                                                     ***
//***************************************************************************
//***************************************************************************

package exam2retry;

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {

		Scanner userInput = new Scanner(System.in);
//		Player[] player = new Player[51];
//		player[0] = new Player(new Name("Uncle", "Charlie"), new Date(11,12,1964), 2000, 0, 0); 

		ArrayList<Player> players = new ArrayList<Player>(51);
		ArrayList<SlotMachine> slotGames = new ArrayList<SlotMachine>(50);
		Player player1 = new Player(new Name("Uncle", "Charlie"), new Date(1, 1, 1954), 2000, 0, 0);
		players.add(player1);
		SlotMachine lucky7 = new SlotMachine(new Name("Lucky", "7"), 5000, 10, 5, 10000, 5000, 0, 0, 0);
		SlotMachine luckyLotto = new SlotMachine(new Name("Lucky", "Lotto"), 55000, 50, 25, 100000, 75000, 0, 0, 0);
		SlotMachine purplePeopleEater = new SlotMachine(new Name("Purple", "People", "Eater"), 1000, 5, 2, 50, 40, 0, 0,
				0);
		slotGames.add(lucky7);
		slotGames.add(luckyLotto);
		slotGames.add(purplePeopleEater);
		MenuSystem menu = new MenuSystem(players, slotGames);
	}

}//end Main class
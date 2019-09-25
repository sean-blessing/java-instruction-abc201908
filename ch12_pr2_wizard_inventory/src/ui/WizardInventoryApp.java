package ui;

import java.util.ArrayList;
import java.util.List;

import util.Console;

public class WizardInventoryApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Wizard Inventory App");

		// display the menu and prompt for command
		String command = Console.getString(getDisplayMenu());

		List<String> items = new ArrayList<>();
		items.add("Wizard Hat");
		items.add("Wand");
		items.add("Marauders Map");
		while (!command.equalsIgnoreCase("exit")) {
			// do biz logic!
			if (command.equalsIgnoreCase("show")) {
				// show - list all
				for (int i = 0; i < items.size(); i++) {
					// need to display items starting at 1, not 0
					int itemNbr = i + 1;
					System.out.println(itemNbr+". "+items.get(i));
				}
			} else if (command.equalsIgnoreCase("grab")) {
				// Grab - add an item, but only if list size is less than 4
				if (items.size() > 3) {
					System.out.println("Error.. cannot add more items.  Please drop one.");
				}
				else {
					// we have room for another item!
					String name = Console.getString("Name: ");
					items.add(name);
					System.out.println(name + " was added.");
				}
			} else if (command.equalsIgnoreCase("edit")) {
				// Edit - edit an item
				int nbr = Console.getInt("Number: ");
				// by index, our items start at 0 not 1, so we need to subtract 1
				// to determine the correct index
				int idxNbr = nbr - 1;
				String updatedName = Console.getString("Updated name: ");
				items.set(idxNbr, updatedName);
			} else if (command.equalsIgnoreCase("drop")) {
				// Drop - remove an item
				int nbr = Console.getInt("Number: ");
				int idxNbr = nbr - 1;
				String dropItem = items.remove(idxNbr);
				System.out.println(dropItem+" was removed.");				
			} else if (command.equalsIgnoreCase("exit")) {
				// Exit - exit the app
			}
			else {
				// invalid command
				System.out.println("Error: '"+command+"' is not a valid command.");
			}

			command = Console.getString(getDisplayMenu());
		}

		System.out.println("Bye");
	}

	private static String getDisplayMenu() {
		String menu = "COMMAND MENU\n" + "show - Show all items\n" + "grab - Grab an item\n" + "edit - Edit an item\n"
				+ "drop - Drop an item\n" + "exit - Exit program\n";

		return menu;
	}

}

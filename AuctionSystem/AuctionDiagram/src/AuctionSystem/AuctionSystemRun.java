package AuctionSystem;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class AuctionSystemRun {

	public static void main(String[] args) {
		
		Date etc = new Date(); 
		// TODO Auto-generated method stub
		int response;
		Scanner input = new Scanner(System.in);
		ArrayList<Auction> auctions = new ArrayList<>(); // Making Auctions class Arrays
		// adding random auction
		auctions.add(new Auction("BMW Car", "Blue BMW Car", 5000.00, "Mayank"));

		// Home Screen
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");
		System.out.println("                                   Welcome to the Auction System");
		System.out.println("                                             Build By");
		System.out.println("                                          Concept Squad");
		System.out.println(
				"-------------------------------------------------------------------------------------------------------");

		while (true) {
			System.out.println("\nSelect one of the options (Enter Respective Digit)");
			System.out.print("1 - Show open auctions\t\t");
			System.out.println("2 - Show close auctions");
			System.out.print("3 - Create Auction\t\t");
			System.out.println("4 - Bid on Running Auction");
			System.out.println("5 - Exit");
			System.out.println();

			// Get user input until he selects among 1-4
			while (true) {
				System.out.print("Enter your response here: ");
				try {
					response = input.nextInt();
					break;
				} catch (InputMismatchException ex) {
					System.out.println("\nEnter a valid response");
				}
			}

			// Switch between cases according to user's input
			//int itemID = 1;

			switch (response) {
			case 1: // Show open auctions
				printHeader();
				for (Auction a : auctions) {
					if (a.auction_Open) {
						a.view_details();
					}
				}
				break;

			case 2: // Show close auctions
				printHeader();
				for (Auction a : auctions) {
					if (!a.auction_Open) {
						a.view_details();
					}
				}
				break;

			case 3: // Create Auction
				input.nextLine(); // End of line (EOL) token handling

				System.out.print("Enter Your Name: ");
				String seller = input.nextLine();
				System.out.print("Enter Your Item Name: ");
				String item = input.nextLine();
				System.out.print("Enter Your Item Description (Max 15 Char): ");
				String description = input.nextLine();
				System.out.print("Enter Your Base Price: ");
				double basePrice = input.nextDouble();
				auctions.add(new Auction(item, description, basePrice, seller));
				auctions.get(auctions.size() - 1).itemID = auctions.size();
				printHeader();
				for (Auction a : auctions) {
					a.view_details();
				}
				break;

			case 4: // Bid on auction
				input.nextLine(); // End of line (EOL) token handling

				System.out.print("Enter Your Name: ");
				String bidder = input.nextLine();
				System.out.print("Enter Auction ID on which you want to place a bid: ");
				int auctionID = input.nextInt();

				if (auctions.get(auctionID - 1).auction_Open) {

					// Take input until user enters bid amount greater than base amount
					while (true) {
						System.out.print("Enter Bid amount: ");
						double bidAmount = input.nextDouble();
						if (bidAmount > auctions.get(auctionID - 1).base_amount) {
							auctions.get(auctionID - 1).b.setAmount(bidAmount);
							auctions.get(auctionID - 1).b.setCreated_by(bidder);
							auctions.get(auctionID - 1).auction_Open = false;
							break;
						} else {
							System.out.println("Please Enter Bid amount more than the base price");
						}
					}

				} else {
					System.out.println("Sorry! That auction is closed.");
				}

				printHeader();
				for (Auction a : auctions) {
					a.view_details();
				}

			case 5: // Exit
				System.out.println("Thank You for using auction system");
				break;

			}
			if (response == 5) {
				break;
			}
		}

	}

	public static void printHeader() {
		System.out.println(
				"\nAuction ID\tItem Name\tItem Description\tBase Price\tCreated By\tAuction Open\tWinning Bid\tWinner");
	}
}

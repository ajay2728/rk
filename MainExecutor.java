package com.cg.pl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.cg.Product.Order;
import com.cg.Product.Product;
import com.cg.dao.ProductDao;
import com.cg.dao.ProductDaoImpl;
import com.cg.repo.ItemRepositories;
import com.cg.repo.UserCredentials;
import com.cg.service.CustomerServiceOrder;
import com.cg.service.CustomerServiceOrderImpl;

public class MainExecutor {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String continution;
		String option2;
		do {
			System.out.println("\n1.New User \n2.Login \n3.exit");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1: {

				System.out.println("Enter you name");
				String username = scanner.next();
				if (UserCredentials.evaluate(username)) {
					System.out.println("hey you ur already registered man");
					break;
				}
				System.out.println("Enter password");
				int password = scanner.nextInt();

				UserCredentials.insertValues(username, password);
				break;
			}
			case 2: {
				System.out.println("Enter your name");
				String username = scanner.next();
				if (UserCredentials.evaluate(username)) {
					System.out.println("Enter Password");
					int password = scanner.nextInt();
					if (password == UserCredentials.creds.get(username)) {
						System.out.println("Successfully logged in");
						do {
							CustomerServiceOrder c = new CustomerServiceOrderImpl();
							System.out.println("\n1.place the order/n2.Display the cart\n3.exit");
							int terminator = scanner.nextInt();
							switch (terminator) {
							case 1: {

								List<Product> items = c.getItems();
								for (Product p : items) {
									System.out.println(p);
								}
								System.out.println("Enter productId");
								int itemId = scanner.nextInt();
								System.out
										.println("You are ordering" + ItemRepositories.itemlist.get(itemId).getName());
								System.out.println("Enter quantity");
								int quantity = scanner.nextInt();
								int orderid = (int) (Math.random() * 1000);
								System.out.println("Enter Mobile Number");
								String mobile = scanner.next();
								Order ord = new Order(orderid, mobile, itemId, quantity);
								c.addToCart(ord);
								System.out.println("Ordered Successfully");
								System.out.println(ord);
								double priceofproduct = ItemRepositories.itemlist.get(itemId).getPrice();
								System.out.println("price\t:\t" + priceofproduct);
								System.out.println("Total Bill is :\t" + quantity * priceofproduct);
								break;
							}
							case 2: {
								Product ps;
								for (Order o : c.printOrderedItems()) {
									ps = ItemRepositories.itemlist.get(o.getItemId());
									
									System.out.println(o);
									System.out.println("price\t" + ps.getPrice());
									System.out.println("Total Price\t:\t" + (o.getQuantity()*ps.getPrice()));
								}
								break;
							}
							case 3: {
								System.exit(0);
							}
							default:
								System.out.println("Enter values between 1 - 3");

							}
							System.out.println("press y to continue");
							option2 = scanner.next();

						} while (option2.equalsIgnoreCase("y"));
					} else {
						System.out.println("Password mismatch");
						break;
					}
				} else {
					System.out.println("Unable to login u are not a registered user");
					break;
				}

			}
			case 3: {
				System.exit(0);
			}
			default: {
				System.out.println("hey what are u doing man select 1-3 thats it!");
			}
			}
			System.out.println("Enter y to continue>>>>>>>");
			continution = scanner.next();
		} while (continution.equalsIgnoreCase("y"));

	}

}

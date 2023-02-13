package ac.item.controller;

import java.util.ArrayList;

import ac.item.helper.CUI;
import ac.item.model.Item;
import ac.item.model.ItemStatus;
import ac.item.service.ItemService;
import ac.item.service.ItemServiceImplementation;

public class ItemPresentation {

	private ItemService itemService;

	public ItemPresentation() {
		itemService = new ItemServiceImplementation();
	}

	public void startTheApp() {
		// TODO Auto-generated method stub
		// getItemNo();
		// updateItem();
		// getAllItems();
		// getItemsLessThanPrice();
		// addItem();
		// viewItemDetail();

		int choice = -1;
		String options = "\n 1. check itemno \n 0 exit ";

		do {
			choice = CUI.acceptInt(options);
			if (choice == 1) {
				getItemNo();

			}
		} while (choice != 0);

	}

	private void viewItemDetail(int itemno) {
		// TODO Auto-generated method stub

		// we are designing the hardest thing possible in the project. service fnction
		// design.
		ItemStatus itemStatus = itemService.getIndividualItemDetail(itemno);
		if (itemStatus.getStatusCode() == 0)
			System.out.println("item details not found");
		else
			System.out.println("Item details is " + itemStatus.getItem());

	}

	private void addItem(int itemNo) {
		// TODO Auto-generated method stub

		String itemName = CUI.acceptString("enter item name");
		int price = CUI.acceptInt("enter price");
		String category = CUI.acceptString("enter category");

		Item newItem = new Item(itemNo, itemName, price, category);
		ItemStatus itemStatus = itemService.addItem(newItem);
		if (itemStatus.getStatusCode() == -1)
			CUI.display(" system issue");
		else if (itemStatus.getStatusCode() == 0)
			CUI.display("item not added");
		else if (itemStatus.getStatusCode() == 1)
			CUI.display("item details added");

	}

	private void getItemsLessThanPrice() {
		// TODO Auto-generated method stub
		int price = CUI.acceptInt("enter price ");
		ArrayList<Item> items = itemService.getAllItemsLessThanPrice(price);
		if (items.isEmpty()) {
			CUI.display("no items found");
		} else {
			for (Item item : items) {
				CUI.display(item);
			}

		}

	}

	private void getAllItems() {
		// no input
		ArrayList<Item> items = itemService.getAllItems();
		if (items.isEmpty()) {
			CUI.display("no items found");
		} else {
			for (Item item : items) {
				CUI.display(item);
			}

		}
	}

	private void updateItem(int itemNo) {
		// TODO Auto-generated method stub
		// input you will get is Updated Item
		String itemName = CUI.acceptString("enter updated item name");
		int price = CUI.acceptInt("enter updated price");
		String category = CUI.acceptString("enter updated category");

		Item updatedItem = new Item(itemNo, itemName, price, category);
		ItemStatus itemStatus = itemService.updatedItem(updatedItem);
		if (itemStatus.getStatusCode() == -1)
			CUI.display(" system issue");
		else if (itemStatus.getStatusCode() == 0)
			CUI.display("item not not found");
		else if (itemStatus.getStatusCode() == 1)
			CUI.display("item details updated");

	}

	private void getItemNo() {
		// TODO Auto-generated method stub

		int itemNo = CUI.acceptInt("enter itemno");// assume we got this from the presentation by scanner...

		// what is input for you service function, itemno
		// what is return type f the service function.. this is hard thing
		// in the project.
		ItemStatus itemStatus = itemService.checkItemDetails(itemNo);
		if (itemStatus.getStatusCode() == -1)
			CUI.display(" system issue");
		else if (itemStatus.getStatusCode() == 0)
			addItem(itemNo);
		else if (itemStatus.getStatusCode() == 1) {

			int choice = -1;
			String message = "we show one menu 2";
			String options = "\n 1. update item" + "\n 2. view all items less than price" + "\n 3. view all items"
					+ "\n 4. view particular item" + "\n 5. Sort Items based on price"+ "\n 6. Sort Items based on category" + "\n 0 back";

			do {
				choice = CUI.acceptInt(options);
				if (choice == 1) {
					updateItem(itemNo);

				} else if (choice == 2) {
					getItemsLessThanPrice();

				} else if (choice == 3)
					getAllItems();
				else if (choice == 4) {
					viewItemDetail(itemNo);

				} else if (choice == 5) {
					sortItemBasedOnPrice();
				} else if (choice == 6) {
					sortItemBasedOnCategory();
				}

			} while (choice != 0);

		}

	}

	private void sortItemBasedOnCategory() {
		ItemStatus itemStatus = itemService.sortItemBasedOnCategory();
		System.out.println(itemStatus.getMessage());
	}

	private void sortItemBasedOnPrice() {
		ItemStatus itemStatus = itemService.sortItemBasedOnPrice();
		System.out.println(itemStatus.getMessage());
	}

}

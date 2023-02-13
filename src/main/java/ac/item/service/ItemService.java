package ac.item.service;

import java.util.ArrayList;

import ac.item.model.Item;
import ac.item.model.ItemStatus;

public interface ItemService {

	ItemStatus checkItemDetails(int itemNo);

	ItemStatus updatedItem(Item updatedItem);

	ArrayList<Item> getAllItems();

	ArrayList<Item> getAllItemsLessThanPrice(int price);

	ItemStatus addItem(Item newItem);

	ItemStatus getIndividualItemDetail(int itemno);

	ItemStatus sortItemBasedOnPrice();

	ItemStatus sortItemBasedOnCategory();
}

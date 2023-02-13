package ac.item.dao;

import java.util.ArrayList;

import ac.item.model.Item;
import ac.item.model.ItemStatus;

public interface ItemDao {

	ItemStatus getItemDetailFromDB(int itemNo);

	ItemStatus updateItemsInDB(Item updatedItem);

	ArrayList<Item> getAllItemsFromDb();

	ArrayList<Item> getAllItemsLessThanPriceFromDB(int price);

	ItemStatus addItemInDb(Item newItem);

	ItemStatus getIndividualItemDetailFromDb(int itemno);

	ItemStatus sortItemOnPrice();

	ItemStatus sortItemOnCategory();
}

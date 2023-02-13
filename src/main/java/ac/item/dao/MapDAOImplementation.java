package ac.item.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import ac.item.model.Item;
import ac.item.model.ItemStatus;

public class MapDAOImplementation implements ItemDao {
	
	private Map<Integer, Item> items;
	
	public MapDAOImplementation()
	{
		items =new HashMap<Integer, Item>();
		Item item = new Item(11,"pencil",3,"stn");
		items.put(item.getItemNo(),item);// core java at work.
		item = new Item(12,"book",2,"stn");
		items.put(item.getItemNo(),item);
		item = new Item(13,"bag",3,"stn");
		items.put(item.getItemNo(),item);// core java at work.
		
		
	}
	

	@Override
	public ItemStatus getItemDetailFromDB(int itemNo) {
		// TODO Auto-generated method stub
		ItemStatus itemStatus =new ItemStatus(0, "item not found");
		System.out.println("decidated to kids");
		Item item = items.get(itemNo);
		if(item != null)
		{ 
			//item is found
			itemStatus.setStatusCode(1);
			itemStatus.setMessage("item fouund");
			
		}
		
		
		
		return itemStatus;
	}

	@Override
	public ItemStatus updateItemsInDB(Item updatedItem) {
		// TODO Auto-generated method stub
		ItemStatus itemStatus =new ItemStatus(0, "item not updated");
		Item item  = items.get(updatedItem.getItemNo());
		if(item != null)
				{
			item.setItemName(updatedItem.getItemName());
			item.setPrice(updatedItem.getPrice());
			item.setCategory(updatedItem.getCategory());
			itemStatus.setStatusCode(1);
			itemStatus.setMessage("item updated");
			
			
				}
		return itemStatus;
	}

	@Override
	public ArrayList<Item> getAllItemsFromDb() {
		// TODO Auto-generated method stub
		ArrayList<Item> listitems =new ArrayList<Item>();
		for(Item item: items.values())
						listitems.add(item);
		return listitems;
	}

	@Override
	public ArrayList<Item> getAllItemsLessThanPriceFromDB(int price) {
		// TODO Auto-generated method stub
		
		ArrayList<Item> listitems =new ArrayList<Item>();
		for(Item item: items.values())
		{
			if(item.getPrice() < price)
					listitems.add(item);
			
					
		}
		return listitems;
	}

	@Override
	public ItemStatus addItemInDb(Item newItem) {
		// TODO Auto-generated method stub
		ItemStatus itemStatus =new ItemStatus(0, "item not found");
		if(!items.containsKey(newItem.getItemNo()))
		{
				items.put(newItem.getItemNo(),newItem);
				itemStatus.setStatusCode(1);
				itemStatus.setMessage("item added");
			
		}
		
		
		return itemStatus;
	}


	@Override
	public ItemStatus getIndividualItemDetailFromDb(int itemno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ItemStatus sortItemOnPrice() {
		return null;
	}

	@Override
	public ItemStatus sortItemOnCategory() {
		return null;
	}

}

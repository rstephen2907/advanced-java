package ac.item.dao;

import java.util.ArrayList;
import java.util.Comparator;

import ac.item.model.Item;
import ac.item.model.ItemStatus;

public class ItemDaoImplementation implements ItemDao {
	
	private ArrayList<Item> items;
	
	

	public ItemDaoImplementation() {
		// TODO Auto-generated constructor stub
		
		items =new ArrayList<>();
		items.add(new Item(1,"pencil",3,"stn"));
		items.add(new Item(2,"book",2,"stn"));
		items.add(new Item(3,"photo",1,"gift"));
		
		
	}



	@Override
	public ItemStatus getItemDetailFromDB(int itemNo) {
		// TODO Auto-generated method stub
		
		ItemStatus itemStatus =new ItemStatus(0, "item not found");
		
		for(Item item:items)
		{
				if(item.getItemNo() == itemNo)
				{
					itemStatus.setStatusCode(1);
					itemStatus.setMessage("item fouund");
				}
			
		}
		
		
		return itemStatus;
	}



	@Override
	public ItemStatus updateItemsInDB(Item updatedItem) {
		// TODO Auto-generated method stub
		
ItemStatus itemStatus =new ItemStatus(0, "item not found");
		
		for(Item item:items)
		{
				if(item.getItemNo() == updatedItem.getItemNo())
				{
					
					item.setItemName(updatedItem.getItemName());
					item.setPrice(updatedItem.getPrice());
					item.setCategory(updatedItem.getCategory());
					itemStatus.setStatusCode(1);
					itemStatus.setMessage("item updated");
				}
			
		}
		
		
		return itemStatus;
	}



	@Override
	public ArrayList<Item> getAllItemsFromDb() {
		// TODO Auto-generated method stub
		return items;
		
	}



	@Override
	public ArrayList<Item> getAllItemsLessThanPriceFromDB(int price) {
		// TODO Auto-generated method stub
		ArrayList<Item> itemsLessThanThatPrice =new ArrayList<Item>();
		
		for(Item item:items)
		{
				if(item.getPrice() < price)
						itemsLessThanThatPrice.add(item);
			
		}
		
		
		return itemsLessThanThatPrice;
	}



	@Override
	public ItemStatus addItemInDb(Item newItem) {
		// TODO Auto-generated method stub
ItemStatus itemStatus =new ItemStatus(0, "item not found");
		boolean found = false;
		for(Item item:items)
		{
				if(item.getItemNo() == newItem.getItemNo())
				{
							found =true;
					break;
					
				}
				
		}
		if(!found)
		{
			items.add(newItem);
			itemStatus.setStatusCode(1);
			itemStatus.setMessage("item added");
	
			
		}
		
		
		
		return itemStatus;
		
	}



	@Override
	public ItemStatus getIndividualItemDetailFromDb(int itemno) {
		// TODO Auto-generated method stub
		ItemStatus itemStatus =new ItemStatus(0, "item not found");

		for(Item item:items)
		{
				if(item.getItemNo() == itemno)
				{
							itemStatus.setStatusCode(1);
							itemStatus.setMessage("found successfully");
							itemStatus.setItem(item);
							break;
					
				}
				
		}
		return itemStatus;
	}

	@Override
	public ItemStatus sortItemOnPrice() {
		items.stream().sorted(Comparator.comparingInt(Item::getPrice)).forEach(System.out::println);
		return new ItemStatus(1, "Sorted successfully based on price");
	}

	@Override
	public ItemStatus sortItemOnCategory() {
		items.stream().sorted(Comparator.comparing(Item::getCategory)).forEach(System.out::println);
		return new ItemStatus(1, "Sorted successfully based on category");
	}

}

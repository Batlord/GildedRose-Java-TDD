package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest 
{
	
	@Test
	public void itemTestUpdate()
	{
		ArrayList<Item> items = new ArrayList<Item>();
		items.add(new Item("Dexterity Vest", 10, 20)); 
		items.add(new Item("Elixir of the Mongoose", 10, 20));
		items.add(new Item("Boots of Stamina", 10, 20));
		
		updateItems(ArrayList<Item> items);
		for (int indexInItemList = 0; indexInItemList < items.size(); indexInItemList++)
		{
			Assert.assertEquals(items.get(indexInItemList).getQuality(), 19);
		}
	}
}

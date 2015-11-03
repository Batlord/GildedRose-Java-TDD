package fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;

public class ItemTest
{
	Item item = new Item("+5 Dexterity Vest", 10, 20);
	
	@Test
	public void itemTestGetName()
	{
		Assert.assertEquals(this.item.getName(), "+5 Dexterity Vest");
	}

	@Test
	public void itemTestSetName()
	{
		this.item.setName("Dext Vest");
		Assert.assertEquals(this.item.getName(), "Dext Vest");
	}
	
	@Test
	public void itemTestGetSellIn()
	{
		Assert.assertEquals(this.item.getSellIn(), 10);
	}
	
	@Test
	public void itemTestSetSellIn()
	{
		this.item.setSellIn(9);
		Assert.assertEquals(this.item.getSellIn(), 9);
	}
	
	@Test
	public void itemTestGetQuality()
	{
		Assert.assertEquals(this.item.getQuality(), 20);
	}
	
	@Test
	public void itemTestSetQuality()
	{
		this.item.setQuality(19);
		Assert.assertEquals(this.item.getQuality(), 19);
	}
	
}
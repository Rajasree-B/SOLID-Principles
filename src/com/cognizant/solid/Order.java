package com.cognizant.solid;

public class Order implements POrder {
	@Override
	public void processOrder(String modelName)
	{
		System.out.println(modelName + " order accepted!");
	}
}

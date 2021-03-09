package com.cognizant.solid;

public class Repair implements AccessoryRepair, PhoneRepair{
	
	@Override
	public void processAccessoryRepair(String accessoryType)
	{
		System.out.println(accessoryType + " repair accepted!" );
	}
	
	@Override
	public void processPhoneRepair(String modelName) {
		System.out.println(modelName + " repair accepted!");
		
	}

}

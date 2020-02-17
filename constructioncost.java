package com.EstimationConstructionCost;

public class CalculateCost {
	
	public double getCost( String materialStandard, double areaOfHouse , boolean automated )
        {
	double cost = 0.0;
	if(materialStandard.equals("standard"))
		cost= 1500*areaOfHouse; 
	else if(materialStandard.equals("aboveStandard"))
		cost = 3000*areaOfHouse;
	else if(materialStandard.equals("highStandard") && automated == true)
		cost = 2500*areaOfHouse;
	else 
		cost = 5000*areaOfHouse;
	
	return cost;
}
}

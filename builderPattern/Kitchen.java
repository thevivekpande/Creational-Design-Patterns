package builderPattern;

import java.awt.Color;
import java.awt.Dimension;


public class Kitchen {
	private Dimension dimensions;
	private int ceillingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	private boolean hasDishwasher;
	private boolean hasMicrowave;
	
	public Kitchen(Dimension dimensions, int ceillingHeight, int floorNumber, Color wallColor, int numberOfWindows, int numberOfDoors, boolean hasDishwasher, boolean hasMicrowave) {
		this.dimensions=dimensions;
		this.ceillingHeight=ceillingHeight;
		this.floorNumber=floorNumber;
		this.wallColor=wallColor;
		this.numberOfWindows=numberOfWindows;
		this.numberOfDoors=numberOfDoors;
		this.hasDishwasher=hasDishwasher;
		this.hasMicrowave=hasMicrowave;
	}
}

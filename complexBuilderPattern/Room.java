package complexBuilderPattern;

import java.awt.Color;
import java.awt.Dimension;

public class Room {
	private Dimension dimensions;
	private int ceillingHeight;
	private int floorNumber;
	private Color wallColor;
	private int numberOfWindows;
	private int numberOfDoors;
	
	public Room(Dimension dimensions, int ceillingHeight, int floorNumber , Color wallColor, int numberOfWindows, int numberOfDoors) {
		this.dimensions=dimensions;
		this.ceillingHeight=ceillingHeight;
		this.floorNumber=floorNumber;
		this.wallColor=wallColor;
		this.numberOfWindows=numberOfWindows;
		this.numberOfDoors=numberOfDoors;
	}
}

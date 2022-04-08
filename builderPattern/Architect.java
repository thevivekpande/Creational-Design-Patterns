package builderPattern;

import java.awt.Color;
import java.awt.Dimension;

public class Architect {
	public static void main(String[] args) {
//		Bedroom room=new Bedroom(new Dimension(200, 100), 132, 2, Color.yellow, 2,1,true, true);
		Bedroom room=new BedroomBuilder().setDimensions(new Dimension(200, 100)).setCeillingHeight(132).setFloorNumber(2).setWallColor(Color.yellow).setNumberOfWindows(2).setNumberOfDoors(2).setIsDouble(true).setHasEnsuite(true).createBedroom();
		Bedroom room1Bedroom=new BedroomBuilder().setDimensions(new Dimension(232,434)).createBedroom();
	}
}

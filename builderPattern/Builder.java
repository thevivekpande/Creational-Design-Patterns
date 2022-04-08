package builderPattern;

import java.awt.Dimension;
import java.awt.Color;

public interface Builder {
	Builder setCeillingHeight(int ceillingHeight);
	Builder setDimensions(Dimension dimensions);
	Builder setFloorNumber(int floorNumber);
	Builder setNumberOfDoors(int numberOfDoors);
	Builder setNumberOfWindows(int numberOfWindows);
	Builder setWallColor(Color wallColor);
}

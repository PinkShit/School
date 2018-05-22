package control;

import model.*;
import view.*;

public class GControl {
	
	//Attribute
	private GFunktionen gfun;
	private GPanel gpan;
	private Matrix ma;
	
	public GControl(){
		gfun = new GFunktionen();
		gpan = new GPanel();
		new GFrame("GeoTherm",gpan);
		ma = new Matrix(15,15);
		ma.fuellenZufaellig();
		ma.printMatrix();
	}
	
	public static void main(String[] args) {
		new GControl();
	}
}

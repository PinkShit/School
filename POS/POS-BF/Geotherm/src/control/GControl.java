package control;

import model.GFunktionen;
import view.*;

public class GControl {
	
	//Attribute
	private GFunktionen gfun;
	private GPanel gpan;
	
	public GControl(){
		gfun = new GFunktionen();
		gpan = new GPanel();
		new GFrame("GeoTherm",gpan);
	}
	
	public static void main(String[] args) {
		new GControl();
	}
}

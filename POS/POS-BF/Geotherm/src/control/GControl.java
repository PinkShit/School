package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class GControl implements ActionListener{
	
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

	@Override
	public void actionPerformed(ActionEvent a) {
		
		
	}
}

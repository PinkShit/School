package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.*;
import view.*;

public class GControl implements ActionListener{
	
	//Attribute
	private GFunktionen gfun;
	private static GPanel gpan;
	private Matrix ma;
	
	/*
	 * 
	 */
	public GControl(GPanel gpan){
		gfun = new GFunktionen();
		this.gpan = gpan;
	}
	
	/*
	 * 
	 */
	public static void main(String[] args) {
		new GControl(new GPanel());
		new GFrame("GeoTherm",gpan);
	}

	/*
	 * 
	 */
    @Override
    public void actionPerformed(ActionEvent e) {        	
        if (e.getSource() ==  gpan.getRandom()) {
            ma = new Matrix(15,15);
        	ma.fuellenZufaellig();
        	
        	String a = "";
        	for(int i = 0 ; i<ma.matrix.length;i++) {
    			for(int j = 0 ; j<ma.matrix.length;j++) {
    				
    				a = a + ma.matrix[i][j];
    				
    				gpan.jtf.setText(gpan.jtf.getText()+""+a);
    				a ="";
    			}
    		}
        	
        }
    }
}

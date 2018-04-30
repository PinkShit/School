package model;

import java.util.*;

public class Matrix {
	
	private int[][] matrix;
	private ArrayList<ArrayList<Integer>> matrix2;
	private Random rand;
	
	public Matrix() {
		matrix = new int[5][5];
		matrix2 = new ArrayList<ArrayList<Integer>>();
		int x = 0;
		
		for(int i = 0 ; i<matrix.length;i++) {
			
			for(int j = 0 ; j<matrix.length;j++) {
				
				int zahl = (int)((Math.random()) * 9);
				
				matrix[i][j] = zahl;

				if(x<5) {
					System.out.print(matrix[i][j]+" ");
					x++;
				}else{
					System.out.println();
					x = 0;
				}
				
				
				
			}
		}
	}
	
	/*
	 * 
	 */
	public int getElem(int i, int j) {
        return this.matrix[i][j];
    }
	
	/*
	 * 
	 */
	public void setElem(int i, int j, int wert) {
        this.matrix[i][j]  = wert;
    }
	
	
	
	public void fuellenZufaellig (int n, boolean symm)
    // füllt das Array mit zufälligen Werten
    {
        int i;
        int j;

        if (n > 0) {
        	
            for (i = 0; i < matrix.length; i++) {
            	
                for (j = 0; j < matrix.length; j++) {
                	
                    // bei symmetrischer Matrix werden nur Elemente j <= i gefüllt
                	
                    if ( j <= i || !symm ) {
                    	
                        matrix[i][j] = rand.nextInt(n+1); // zufällige Werte zwischen 0 und n
                        
                        if (rand.nextInt(2) == 0) {
                            matrix[i][j] *= -1;            // die Hälfte davon negativ
                        }
                        
                        if (symm) {
                            matrix[j][i] = matrix[i][j];
                        }
                    }
                }
            }
        }
    }
}

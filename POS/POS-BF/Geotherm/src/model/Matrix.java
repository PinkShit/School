package model;

import java.util.*;

public class Matrix {
	
	private int[][] matrix;
	private ArrayList<ArrayList<Integer>> matrix2;
	private Random rand;
	
	public Matrix(int left, int right) {
		matrix = new int[left][right];
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
	
	
	
	public void fuellenZufaellig () {
        for(int i = 0 ; i<matrix.length;i++) {			
			for(int j = 0 ; j<matrix.length;j++) {
				
				int zahl = (int)((Math.random()) * 9);
				matrix[i][j] = zahl;
			}
		}
    }
	
	//
	public void printMatrix() {
		for(int i = 0 ; i<matrix.length;i++) {
			System.out.println();
			
			for(int j = 0 ; j<matrix.length;j++) {
				
				int zahl = (int)((Math.random()) * 9);
				
				matrix[i][j] = zahl;

				
				System.out.print("| "+matrix[i][j]+" |");
				
				
			}
		}
	}
}

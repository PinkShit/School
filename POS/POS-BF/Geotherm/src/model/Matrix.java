package model;

import java.util.*;

import view.GPanel;

public class Matrix {
	
	public int[][] matrix;
	private ArrayList<ArrayList<Integer>> matrix2;
	private Random rand;
	GPanel gpan;
	
	private int left;
	private int right;
	
	public Matrix(int left, int right) {
		this.left = left;
		this.right = right;
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
				
				//damit wird die matrix symmetrischss
				matrix[i][j] = matrix[j][i];

				
				System.out.print("| "+matrix[i][j]+" |");
				
			}
		}
	}
	
	public String[][] addTextArea() {
		String a = "";
		String[][] arr = new String[left][right];
		
		for(int i = 0 ; i<matrix.length;i++) {
			System.out.println();
			for(int j = 0 ; j<matrix.length;j++) {
				
				arr[i][j] = ""+ matrix[i][j];
				System.out.print(arr[i][j]);
			}
		}
		return arr;
				
	}
	
	public void multiplyMatrix(Matrix n, Matrix m) {
		for(int i = 0 ; i<matrix.length;i++) {
			for(int j = 0 ; j<matrix.length;j++) {
				
				
			}
		}
	}
}

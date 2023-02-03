package atos;

public class Exercice1Matrix {
	
	 private final int rows;
	    private final int columns;
	    private final int[][] elements;

	    public Exercice1Matrix(int rows, int columns) {
	        this.rows = rows;
	        this.columns = columns;
	        this.elements = new int[rows][columns];
	    }

	    public int getRows() {
	        return this.rows;
	    }

	    public int getColumns() {
	        return this.columns;
	    }

	    public void setElement(int i, int j, int value) {
	        this.elements[i][j] = value;
	    }

	    public Exercice1Matrix add(Exercice1Matrix other) {
	        if (this.rows != other.rows || this.columns != other.columns) {
	            System.out.println("Impossible d'ajouter des matrices");
	            return null;
	        }

	        Exercice1Matrix result = new Exercice1Matrix(this.rows, this.columns);
	        for (int i = 0; i < this.rows; i++) {
	            for (int j = 0; j < this.columns; j++) {
	                result.elements[i][j] = this.elements[i][j] + other.elements[i][j];
	            }
	        }
	        return result;
	    }

	    public Exercice1Matrix multiply(Exercice1Matrix other) {
	        if (this.columns != other.rows) {
	            System.out.println("Impossible de multiplier des matrices");
	            return null;
	        }

	        Exercice1Matrix result = new Exercice1Matrix(this.rows, other.columns);
	        for (int i = 0; i < this.rows; i++) {
	            for (int j = 0; j < other.columns; j++) {
	                int sum = 0;
	                for (int k = 0; k < this.columns; k++) {
	                    sum += this.elements[i][k] * other.elements[k][j];
	                }
	                result.elements[i][j] = sum;
	            }
	        }
	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

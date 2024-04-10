package com.mv.StockManagement;

public class Product {

	public static void main(String[] args) {
		System.out.println("Hello world");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
	}
}

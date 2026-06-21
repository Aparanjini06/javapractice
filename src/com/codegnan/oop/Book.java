package com.codegnan.oop;

import java.util.Scanner;

public class Book {
	String title;
	String author;
	boolean isAvailable;
	public Book(String title,String author,boolean isAvailable)
	{
		this.title=title;
		this.author=author;
		this.isAvailable=isAvailable;
	}
	public void borrowBook() {
		
		if(isAvailable)
		{
			isAvailable=false;
			System.out.println("Book available");
		}
		else {
			System.out.println("Book is not available");
		}
	}
	public void returnBook() {
		if(!isAvailable)
		{
			isAvailable=true;
			System.out.println("Book returned");
		}
		else
		{
			System.out.println("book is already available");
		}
		
	}
	public void display() {
		System.out.println("Book: "+title);
		System.out.println("Author:"+author);
		String isAvail=(isAvailable)?"Book Available":"Book not available";
		System.out.println("Book status: "+isAvail);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String title=s.next();
		String author=s.next();
		boolean isAvailable=true;
		Book b=new Book(title,author,isAvailable);
		b.display();
		b.borrowBook();
		b.display();
		b.returnBook();
		b.display();
		
		
		s.close();
	}
}

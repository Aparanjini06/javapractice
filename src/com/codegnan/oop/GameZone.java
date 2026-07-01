package com.codegnan.oop;

import java.util.Scanner;

public class GameZone {
	int allGame;
	int specificGame;
	String type;
	public static int across(int allGame)
	{
		int output=allGame*10;
		if(output>10000)
		{
			output=10000;
		}
		return output;
	}
	public int specific(int specificGame, String type)
	{
		int output=0;
		if(type.equalsIgnoreCase("puzzle"))
		{
			output=specificGame*15;
		}
		if(type.equalsIgnoreCase("action"))
		{
			output=specificGame*20;
		}
		if(output>10000)
		{
			output=10000;
		}
		return output;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int allGame=sc.nextInt();
		int specificGame=sc.nextInt();
		String type=sc.next();
		System.out.println(GameZone.across(allGame));
		GameZone g=new GameZone();
		System.out.println(g.specific(specificGame, type));
		sc.close();
	}
}

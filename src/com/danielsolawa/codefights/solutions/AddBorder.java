package com.danielsolawa.codefights.solutions;

public class AddBorder {

	
	static String[] addBorder(String[] picture) {
		int height = picture.length + 2;
		int width = 0;
		int pictureIndex = 0;
		
		String[] border = new String[height];
		
		for(String s : picture)
			width = Math.max(width, s.length() + 2);
		
		for(int i = 0; i < height; i++) {
			if(i == 0 || i == (height -1)) {
				border[i] = new String(new char[width]).replace("\0", "*");
			}else {
				border[i] = print(picture[pictureIndex], width);
				pictureIndex++;
			}
		}
		
		return border;
	}
	
	
	static String print(String s, int width) {
		int numOfAsterisks = (width -  s.length());
		String left = new String(new char[numOfAsterisks / 2]).replace("\0", "*");
		String right = left;
		
		
		
		return left + s + right;
	}
}

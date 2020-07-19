package MyfirstProject;

import java.util.Random;

public class frenchChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String chars = " ÁÂÃÄÅÆÇÈÉÊËÌÍÎÏĞÑÒÓÔÕÖØÙÚÛÜİ";
		Random rnd = new Random();
		char c = chars.charAt(rnd.nextInt(chars.length()));
		System.out.println(c);
		
	}

	}


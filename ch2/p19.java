package ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class p19 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		System.out.println("請問你是男生嘛?");
		System.out.println("請輸入Y或N");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		
		if(letter == 'Y' || letter == 'y')
		{
			System.out.println("你是男生呀!");
		}
		else if(letter == 'N' || letter == 'n')
			System.out.println("原來妳是女生喔!!!!!!");
		else
			System.out.println("請輸入Y或N");
		}
	}


package ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class p42 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		int[] test = {80,60,22,50,75};
		
		for(int i=0;i<5;i++) {
			System.out.println("第" +(i+1)+ "個人的分數是" + test[i] + "分");
		}
	}

}

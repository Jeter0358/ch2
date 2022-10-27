package ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class p21 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		System.out.println("請問要選哪條路線?");
		System.out.println("請輸入整數");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans =(res == 1)?'A':'B';
		//這個方法相當於if res == 1 為A，else 為B
		
		System.out.println("選擇了" + ans + "路線");
		
	}

}

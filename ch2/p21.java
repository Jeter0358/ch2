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

		System.out.println("�аݭn��������u?");
		System.out.println("�п�J���");
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		int res = Integer.parseInt(str);
		
		char ans =(res == 1)?'A':'B';
		//�o�Ӥ�k�۷���if res == 1 ��A�Aelse ��B
		
		System.out.println("��ܤF" + ans + "���u");
		
	}

}
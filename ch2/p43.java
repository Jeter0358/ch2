package ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class p43 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		int[] test = {80,60,22,50,75};
		
		for(int i=0;i<test.length;i++) {
			System.out.println("��" +(i+1)+ "�ӤH�����ƬO" + test[i] + "��");
		}
		
		System.out.println("�ҸդH�Ƭ�" + test.length + "�H");
	}

}

package ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class p39 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		int[]test;
		test = new int[5];
		
		test[0] = 80;
		test[1] = 60;
		test[2] = 22;
		test[3] = 50;
		test[4] = 75;
		
		for(int i=0;i<5;i++) {
			System.out.println("��" +(i+1)+ "�ӤH�����ƬO" + test[i] + "��");
		}
	}

}

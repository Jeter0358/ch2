package ch2;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;


public class p16 {

	public static void main(String[] args)throws IOException
	{
		// TODO Auto-generated method stub

		System.out.println("�п�Ja��b");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		char letter = str.charAt(0);
		//�ϥ�String���O��charAt���O��k���X���ޭȬ�0���r��
		
		switch(letter)
		{
			case 'a':
			{
				System.out.println("��J���Oa");
				break;
			}
			case 'b':
			{
				System.out.println("��J���Ob");
				break;
			}
			default:
			{
				System.out.println("�п�Ja��b");
				break;
			}
		}
		
	}

}

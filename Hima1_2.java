import java.io.*;
import java.util.*;

public class Hima1_2{

		public static void main(String[] args){

		int[] okane = {10000,5000,2000,1000,500,100,50,10,5,1};
		String[] value = {"10000�~�D","5000�~�D ","2000�~�D ","1000�~�D ","500�~��  ","100�~��  ","50�~��   ","10�~��   ","5�~��    ","1�~��    "};

		int[] saifu = new int[10];
		int[] amari = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.print("���z����͂��Ă�������");
		int price = sc.nextInt();
		
		saifu[0] = price/okane[0];
		amari[0] = price%okane[0];
		
		for(int i=1; i<value.length; i++){
		
		saifu[i] = amari[i-1]/okane[i];
		amari[i]= amari[i-1]%okane[i];
		
		}
		
		
		System.out.println(price+"�~�̋���͈ȉ��̒ʂ�ł��B");
		for(int i =0; i<10; i++){
		System.out.println(value[i]+":"+saifu[i]);
		}
	}
}
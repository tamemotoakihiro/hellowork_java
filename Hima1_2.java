import java.io.*;
import java.util.*;

public class Hima1_2{

		public static void main(String[] args){

		int[] okane = {10000,5000,2000,1000,500,100,50,10,5,1};
		String[] value = {"10000円札","5000円札 ","2000円札 ","1000円札 ","500円玉  ","100円玉  ","50円玉   ","10円玉   ","5円玉    ","1円玉    "};

		int[] saifu = new int[10];
		int[] amari = new int[10];

		Scanner sc = new Scanner(System.in);
		System.out.print("金額を入力してください");
		int price = sc.nextInt();
		
		saifu[0] = price/okane[0];
		amari[0] = price%okane[0];
		
		for(int i=1; i<value.length; i++){
		
		saifu[i] = amari[i-1]/okane[i];
		amari[i]= amari[i-1]%okane[i];
		
		}
		
		
		System.out.println(price+"円の金種は以下の通りです。");
		for(int i =0; i<10; i++){
		System.out.println(value[i]+":"+saifu[i]);
		}
	}
}
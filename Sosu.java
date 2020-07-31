import java.util.*;

public class Sosu{

		public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("適当に値を入力してください");
		int n = sc.nextInt();
		
		int[] num =new int[n-1];//2~100までの99個の値を入れる。
		num[0] = 2;
		System.out.println(num[0]); //初期値２は素数として出力。

			for(int i=1; i<=n-2; i++){
				for(int x=1; x<=n-1; x++){
					num[i]=i+2;//num[1]=3以降、1ずつ100まで代入する。
					int amari=num[i]%num[x-1];//num[0]=2から順番に、割り算をした余りを求める。
          
					if(amari==0){//割り算の余りが0で
						if(num[i]!=num[x-1]){//割った値が元の値と違う場合は
						break;//素数ではないので終了。
						}else{//それ以外の場合＝割った値が元の値と同じ場合
							System.out.println(num[i]);//その値を出力し
							break;//終了
						}
					}//割り算の余りが0の時の条件
					//余りが0でない時は、num[1],num[2]…と繰り返したい。
				}//xの繰り返し
			}//iの繰り返し
			
		}
}

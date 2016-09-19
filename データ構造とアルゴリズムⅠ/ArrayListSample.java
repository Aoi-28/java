import java.util.*;
import java.util.Scanner;
	public class ArrayListSample{
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			//-----List実装-----//
			ArrayList<String> list=new ArrayList<String>();
			//-----要素の追加-----//
			list.add("stdIn.nextString()");
		
			
			//-----List内要素の表示-----//
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));//getメソッド(ゲッタ)
			}
			System.out.println("");

			//-----要素の削除(入力した数字に応じて)-----//
			System.out.println("削除する対象の要素数を入力してください。");
			int k=stdIn.nextInt();
			list.remove(k);

			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
			System.out.println("");
			
			//-----2番目に要素の追加-----//
			list.add(2,"バンコク");
			
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		}	
	}

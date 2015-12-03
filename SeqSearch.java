import java.util.Scanner;
public class SeqSearch{

	static int search(int[] a,int n,int key){
		int i=0;

		a[n]=key;//番兵追加
		while (true){
			if(a[i]==key){
				break;
			}
		i++;
		}

	return i==n?-1:i;
	}


	public static void main(String[] args){
		 Scanner stdIn=new Scanner(System.in);

		System.out.println("要素数");

		int num=stdIn.nextInt();//要素数
		int[] x=new int[num+1];

		for(int i=0;i<num;i++){
			System.out.println("x["+i+"}:");
			x[i]=stdIn.nextInt();
		}//配列の初期化

		System.out.println("探す値");
		int ky=stdIn.nextInt();

		int idx=search(x,num,ky);//探査メソッド

		if(idx==-1)
			System.out.println("その値はありません");

		else
			System.out.println("その値はx["+idx+"]にあります。");

}
}

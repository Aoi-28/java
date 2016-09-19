import java.util.Scanner;

class SeqSearchSen{
	static int seqSearch(int[] a,int n,int key){
		int i=0;
	a[n]=key;

	while(true){
		if(a[i]==key)
			break;
		i++;
	}
	return i==n?-1:i;
}

public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);

		System.out.println("要素数を指定せよ");
			int n=stdIn.nextInt();

		System.out.println("探す値は？");
			int idx=stdIn.nextInt();

		System.out.println("配列にデータを格納する");
			int x[]=new int[n+1];
		for(int i=0;i<n;i++){
			x[i]=stdIn.nextInt();
		}

		System.out.println("格納されたデータは");
		for(int i=0;i<n;i++){
			System.out.println("x["+i+"]="+x[i]);
		}

		int k=seqSearch(x,n,idx);

		System.out.println("探査した結果、"+idx+"は"+k+"にあります。");
}
}


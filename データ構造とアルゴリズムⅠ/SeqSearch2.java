import java.util.Scanner;

class SeqSearch2{
	static int seqSearch(int[] a,int n,int key){
		int i=0;
	
	while(true){
		if(i==n)
			return -1;//�T�����s
		if(a[i]==key)
			return i;//�T������
	i++;
	}
}

public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);

		System.out.println("�v�f�����w�肹��");
			int n=stdIn.nextInt();

		System.out.println("�T���l�́H");
			int idx=stdIn.nextInt();

		System.out.println("�z��Ƀf�[�^���i�[����");
			int x[]=new int[n];
		for(int i=0;i<n;i++){
			x[i]=stdIn.nextInt();
		}

		System.out.println("�i�[���ꂽ�f�[�^��");
		for(int i=0;i<n;i++){
			System.out.println("x["+i+"]="+x[i]);
		}

		int k=seqSearch(x,n,idx);

		System.out.println("�T���������ʁA"+idx+"��"+k+"�ɂ���܂��B");
}
}


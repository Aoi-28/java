import java.util.Scanner;
public class SeqSearch{

	static int search(int[] a,int n,int key){
		int i=0;

		a[n]=key;//�ԕ��ǉ�
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

		System.out.println("�v�f��");

		int num=stdIn.nextInt();//�v�f��
		int[] x=new int[num+1];

		for(int i=0;i<num;i++){
			System.out.println("x["+i+"}:");
			x[i]=stdIn.nextInt();
		}//�z��̏�����

		System.out.println("�T���l");
		int ky=stdIn.nextInt();

		int idx=search(x,num,ky);//�T�����\�b�h

		if(idx==-1)
			System.out.println("���̒l�͂���܂���");

		else
			System.out.println("���̒l��x["+idx+"]�ɂ���܂��B");

}
}

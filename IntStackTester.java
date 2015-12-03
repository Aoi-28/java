import java.util.Scanner;

//--------------int�^�X�^�b�N----------------//
	public class IntStackTester{
		private int max;	//�X�^�b�N�̗e��
		private int ptr;	//�X�^�b�N�|�C���^
		private int[] stk;	//�X�^�b�N�{��

//--------------�X�^�b�N��----------------//
	public class EmptyIntStackException extends RuntimeException{
		public void EmptyIntStackExceotion(){}
	}

//--------------�X�^�b�N���t----------------// 
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException(){}
	}

//--------------�R���X�g���N�^----------------//
	public IntStackTester(int capacity){
		ptr=0;
		max=capacity;
		try{
			stk=new int[max];
		}catch(OutOfMemoryError e){
			max=0;
		}
	}

//--------------�v�b�V�����\�b�h----------------//
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++]=x;
	}

//--------------�|�b�v���\�b�h----------------//
	public int pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

//--------------�s�[�N���\�b�h----------------//
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}

//--------------�_���v�X�^�b�N----------------//
	public void dump(){
		if(ptr<=0)
			System.out.println("�X�^�b�N�͋�ł��B");
		else{
			for(int i=0;i<ptr;i++)
				System.out.println(stk[i]+"");
			System.out.println();
		}
	}

//--------------�T�C�Y���\�b�h----------------//
	public int size(){
		return ptr;
	}

//--------------�e�ʃ��\�b�h----------------//
	public int capacity(){
		return max;
	}

//--------------���C����----------------//
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		IntStack s=new IntStack(100);

		while(true){
			System.out.println("���݂̃f�[�^��:"+s.size()+"/"+s.capacity());
			System.out.println("(1)�v�b�V�� (2)�|�b�v (3)�s�[�N (4)�_���v (0)�I��");

			int menu=stdIn.nextInt();
			if(menu==0)break;

			int x;
			switch(menu){
				case 1://�v�b�V��
					System.out.println("�f�[�^:");
					x=stdIn.nextInt();
					try{
						s.push(x);
					}catch(IntStack.OverflowIntStackException e){
						System.out.println("�X�^�b�N�͖��t�ł��B");
					}
					break;

				case 2://�|�b�v
					try{
						x=s.pop();
						System.out.println("�|�b�v�����f�[�^��"+x+"�ł��B");
					}catch(IntStack.EmptyIntStackException e){
						System.out.println("�X�^�b�N�͋�ł��B");
					}
					break;

				case 3://�s�[�N
					try{
						x=s.peek();
						System.out.println("�s�[�N�����f�[�^��"+x+"�ł��B");
					}catch(IntStack.EmptyIntStackException e){
						System.out.println("�X�^�b�N�͋�ł��B");
					}
					break;

				case 4:
					s.dump();
					break;
			}
		}
	}
}

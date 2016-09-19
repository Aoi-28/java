import java.util.Scanner;

//--------------int型スタック----------------//
	public class IntStackTester{
		private int max;	//スタックの容量
		private int ptr;	//スタックポインタ
		private int[] stk;	//スタック本体

//--------------スタック空----------------//
	public class EmptyIntStackException extends RuntimeException{
		public void EmptyIntStackExceotion(){}
	}

//--------------スタック満杯----------------// 
	public class OverflowIntStackException extends RuntimeException{
		public OverflowIntStackException(){}
	}

//--------------コンストラクタ----------------//
	public IntStackTester(int capacity){
		ptr=0;
		max=capacity;
		try{
			stk=new int[max];
		}catch(OutOfMemoryError e){
			max=0;
		}
	}

//--------------プッシュメソッド----------------//
	public int push(int x) throws OverflowIntStackException{
		if(ptr>=max)
			throw new OverflowIntStackException();
		return stk[ptr++]=x;
	}

//--------------ポップメソッド----------------//
	public int pop() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

//--------------ピークメソッド----------------//
	public int peek() throws EmptyIntStackException{
		if(ptr<=0)
			throw new EmptyIntStackException();
		return stk[ptr-1];
	}

//--------------ダンプスタック----------------//
	public void dump(){
		if(ptr<=0)
			System.out.println("スタックは空です。");
		else{
			for(int i=0;i<ptr;i++)
				System.out.println(stk[i]+"");
			System.out.println();
		}
	}

//--------------サイズメソッド----------------//
	public int size(){
		return ptr;
	}

//--------------容量メソッド----------------//
	public int capacity(){
		return max;
	}

//--------------メイン文----------------//
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		IntStack s=new IntStack(100);

		while(true){
			System.out.println("現在のデータ数:"+s.size()+"/"+s.capacity());
			System.out.println("(1)プッシュ (2)ポップ (3)ピーク (4)ダンプ (0)終了");

			int menu=stdIn.nextInt();
			if(menu==0)break;

			int x;
			switch(menu){
				case 1://プッシュ
					System.out.println("データ:");
					x=stdIn.nextInt();
					try{
						s.push(x);
					}catch(IntStack.OverflowIntStackException e){
						System.out.println("スタックは満杯です。");
					}
					break;

				case 2://ポップ
					try{
						x=s.pop();
						System.out.println("ポップしたデータは"+x+"です。");
					}catch(IntStack.EmptyIntStackException e){
						System.out.println("スタックは空です。");
					}
					break;

				case 3://ピーク
					try{
						x=s.peek();
						System.out.println("ピークしたデータは"+x+"です。");
					}catch(IntStack.EmptyIntStackException e){
						System.out.println("スタックは空です。");
					}
					break;

				case 4:
					s.dump();
					break;
			}
		}
	}
}

import java.util.*;
import java.util.Scanner;
	public class ArrayListSample{
		public static void main(String[] args){
			Scanner stdIn=new Scanner(System.in);
			//-----List����-----//
			ArrayList<String> list=new ArrayList<String>();
			//-----�v�f�̒ǉ�-----//
			list.add("stdIn.nextString()");
		
			
			//-----List���v�f�̕\��-----//
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));//get���\�b�h(�Q�b�^)
			}
			System.out.println("");

			//-----�v�f�̍폜(���͂��������ɉ�����)-----//
			System.out.println("�폜����Ώۂ̗v�f������͂��Ă��������B");
			int k=stdIn.nextInt();
			list.remove(k);

			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
			System.out.println("");
			
			//-----2�Ԗڂɗv�f�̒ǉ�-----//
			list.add(2,"�o���R�N");
			
			for(int i=0;i<list.size();i++){
				System.out.println(list.get(i));
			}
		}	
	}

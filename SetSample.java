import java.util.*;
public class SetSample{
	public static void main (String[] args){
		Set<String> set=new HashSet<String>();
		set.add("����");
		set.add("�����h��");
		set.add("�p��");
		set.add("�p��");

		for(String item:set){
			System.out.println(item);
		}
		System.out.println("");

		Iterator<String> iter=set.iterator();
		while(iter.hasNext()){
			String item=iter.next();
			System.out.println(item);
		}
		System.out.println("");

		set.remove("�p��");

		for(String item:set){
			System.out.println(item);
		}
	}
}
import java.util.*;
public class SetSample{
	public static void main (String[] args){
		Set<String> set=new HashSet<String>();
		set.add("東京");
		set.add("ロンドン");
		set.add("パリ");
		set.add("パリ");

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

		set.remove("パリ");

		for(String item:set){
			System.out.println(item);
		}
	}
}
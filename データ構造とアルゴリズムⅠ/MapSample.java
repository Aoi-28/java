import java.util.*;
	//-----HashMapクラス-----//
	public class MapSample{
		public static void main(String[] args){
			//-----HashMapの実装-----//
			HashMap<String,String>map=new HashMap<String,String>();
			//-----要素の追加-----//
			map.put("red","赤");
			map.put("blue","青");
			map.put("green","緑");
			map.put("green","緑");

			//-----キーを指定して表示-----//
			System.out.println(map.get("blue"));
			System.out.println("");

			for(String key:map.keySet()){
				System.out.println(key+"="+map.get(key));
			}
			System.out.println("");

			map.remove("green");

			for(String key:map.keySet()){
				System.out.println(key+"="+map.get(key));
			}
		}
	}

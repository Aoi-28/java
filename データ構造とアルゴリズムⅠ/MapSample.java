import java.util.*;
	//-----HashMap�N���X-----//
	public class MapSample{
		public static void main(String[] args){
			//-----HashMap�̎���-----//
			HashMap<String,String>map=new HashMap<String,String>();
			//-----�v�f�̒ǉ�-----//
			map.put("red","��");
			map.put("blue","��");
			map.put("green","��");
			map.put("green","��");

			//-----�L�[���w�肵�ĕ\��-----//
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

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		System.out.println(swapFirstLast(list));
	}
	
	public static ArrayList<String> swapFirstLast(ArrayList<String> list) {
		
		ArrayList<String> newlist=new ArrayList<String>(list);
		if(list.size()>=2) {
			newlist.set(0, list.get(list.size()-1));
			newlist.set(list.size()-1,list.get(0) );
			return newlist;
		}
		return list;
	}
}
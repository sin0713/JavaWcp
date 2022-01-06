package List_practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();

		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("リンゴ");
		list1.add("オレンジ");
		list1.add(1, "バナナ");
		System.out.println(list1);
		System.out.println("------------------------");
		
		System.out.println(list1.get(0));
		System.out.println("------------------------");
		
		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.contains("なし"));
		System.out.println("------------------------");
		
		System.out.println(list1.size());
		System.out.println("------------------------");
		
		list1.remove(0);
		System.out.println(list1);
		list1.remove("バナナ");
		System.out.println(list1);
	}

}

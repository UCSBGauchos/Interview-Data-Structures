import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test {
	
	private final static Integer STUDENTNUM = 3;
	private static Integer index = 0;
	
	public static HashMap<Integer, student> buildMap(student [] students){
		HashMap<Integer, student> map = new HashMap<Integer, student>();
		for (student s : students) 
			map.put(s.getID(), s);
		return map;
	}
	
	public static ArrayList<student> merge(student [] students){
		ArrayList <student> array = new ArrayList <student>();
		for(student s:students) array.add(s);
		for(student s:students) array.add(s);
		return array;
	}
	
	public static void main(String args[]){
		student [] students = new student [STUDENTNUM];
		for (int i = 0; i<STUDENTNUM; i++)
			students[i] = new student("byang", index++);
		Iterator iter = buildMap(students).keySet().iterator();
//		while(iter.hasNext()){
//			System.out.println(buildMap(students).get(iter.next()).getName());
//		}
		//System.out.println(buildMap(students).get(0).getName());
		System.out.println(merge(students).size());
		
	}
	
	
}

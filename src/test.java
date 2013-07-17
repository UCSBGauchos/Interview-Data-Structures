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
	
	public static String join(String [] stringList){
		String sentence = "";
		for (String str:stringList)
			sentence+=str;
		return sentence;
	}
	
	public static String join2(String [] stringList){
		StringBuffer sentence = new StringBuffer();
		for (String s:stringList)
			sentence.append(s);
		return sentence.toString();
	}
	
	public static void main(String args[]){
		student [] students = new student [STUDENTNUM];
		String [] stringList = new String[STUDENTNUM];
		for (int i = 0; i<STUDENTNUM; i++)
			students[i] = new student("byang", index++);
		for (int i = 0; i<STUDENTNUM; i++)
			stringList[i] = "abc";
		Iterator iter = buildMap(students).keySet().iterator();
//		while(iter.hasNext()){
//			System.out.println(buildMap(students).get(iter.next()).getName());
//		}
		//System.out.println(buildMap(students).get(0).getName());
		
		
		//System.out.println(merge(students).size());
		System.out.println(join2(stringList));
		
	}
	
	
}

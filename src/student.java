
public class student {
	private String name;
	private Integer ID;
	
	public student(String _name, Integer _ID){
		this.name = _name;
		this.ID = _ID;
	}
	
	public int getID(){
		return this.ID;
	}
	
	public String getName(){
		return this.name;
	}
}

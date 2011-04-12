package route;

import java.util.ArrayList;

public class Station {
	
	private String name;
	private ArrayList<Connection> connections;
	
	public void setName(String name){
		name = this.name;
	}
	
	public String getName(){
		return name;
	}
	
	public ArrayList<Connection> getConncections(){
		return connections;
	}
	
	public void addConnection(Connection connection){
		connections.add(connection);
	}
	

}

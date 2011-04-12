package route;

import java.util.ArrayList;
import java.util.Iterator;

public class Connection {
	
	private Station stationA;
	private Station stationB;
	private int duration;
	private ArrayList<Line> lines;
	private ArrayList<TimeTable> timeTableA;
	private ArrayList<TimeTable> timeTableB;
	
	public Connection(){
		ArrayList<Line> lines = new ArrayList<Line>();
		ArrayList<TimeTable> timeTableA = new ArrayList<TimeTable>();
		ArrayList<TimeTable> timeTableB = new ArrayList<TimeTable>();
	}
	
	public void setStationA(Station station){
		stationA = station;
	}
	
	public void setStationB(Station station){
		stationB = station;
	}
	
	public Station getStationA(){
		return stationA;
	}
	
	public Station getStationB(){
		return stationB;
	}
	
	public void getNeighborStation(){

	}
	
	public void setDuration(int duration){
		duration = this.duration;
	}
	
	public int getDuration(){
		return duration;
	}
	
	public ArrayList<Line> getLines(){
		return lines;
	}
	
	public void addLine(Line line){
		lines.add(line);
	}
	
	public void addTimeTableA(Line line, TimeTable timeTable){
		timeTableA.add(line, timeTable);
	}
	
	public void addTimeTableB(Line line, TimeTable timeTable){
		timeTableB.add(line, timeTable);
	}
	
	
}

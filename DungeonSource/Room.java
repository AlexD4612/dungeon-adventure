
public class Room {
// healingPotion is 1
// pit is 2
// entrance is 3
// exit is 4
// pillar is 5
// monster is 6
// door is 7
// visionPotion is 8
	String key ="";
	
	public Room(String key) {
		this.key = key;
	}
	
	public String toString() {
		String room ="***--***\n"
				   + "*  "+key+"   *\n"
				   + "*      *\n"
				   + "********";
		return room;
		}
}

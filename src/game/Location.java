package game;

import java.util.HashMap;
import java.util.Map;

public class Location {
	
	private final int locationId;
	private final String description;
	private final Map<String, Integer> exits;
	
	public Location(int locationId, String description) {
		this.locationId = locationId;
		this.description = description;
		this.exits = new HashMap<String, Integer>();
		exits.put("Q", 0);
	}
	
	public void addExit(String direction, int locationID) {
		exits.put(direction, locationID);
	}

	public int getLocationId() {
		return locationId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits); //We are passing exits map to this new map so that a copy of exits map is created.
	}
	
}

package src;

/* A simple fan with 2 pull cords (one to adjust speed and one to change direction) */
public class Fan {
	
	private int fan_speed = 0;
	private String fan_direction = "cw";
	
	/*
	 * Returns the speed of the fan.
	 * 
	 * @return int
	 */
	public int get_fan_speed() {
		return fan_speed;
	}
	
	/*
	 * Returns the direction of the fan [clockwise (cw) or counter clockwise (ccw)].
	 * 
	 * @return String
	 */
	public String get_fan_direction() {
		return fan_direction;
	}
	
	/*
	 * Increases the speed of the fan by 1 level. In total, there are 4 speed levels
	 * and after speed level 3, the fan speed resets to speed level 0 (the 'off' position).
	 */
	public void increase_fan_speed() {
		
		if (fan_speed == 3) {
			fan_speed = 0;
		} else {
			fan_speed++;
		}
	}
	
	/*
	 * Reverses the direction of the fan. A fan spinning in a [clockwise (cw)] direction
	 * will now spin in a [counter clockwise (ccw)] direction and vice-versa.
	 */
	public void reverse_fan_direction() {
		
		if (fan_direction.equals("cw")) {
			fan_direction = "ccw";
		} else {
			fan_direction = "cw";
		}
	}

}

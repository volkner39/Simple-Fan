package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import src.Fan;

public class FanTest {
	
	private Fan f;
	
	@Before
	public void setUp() throws Exception {
		f = new Fan();
	}
	
	@Test
	public void testDefaultFanSettings() {
		
		// Test initial conditions of fan
		assertEquals(f.get_fan_speed(), 0);
		assertEquals(f.get_fan_direction(), "cw");
	}
	
	@Test
	public void testIncreaseFanSpeed() {
		
		// Increase fan speed by 1 level only
		f.increase_fan_speed();
		assertEquals(f.get_fan_speed(), 1);
	}
	
	@Test
	public void testReverseFanDirection() {
		
		// At speed=0, switch to counter clockwise direction
		f.reverse_fan_direction();
		assertEquals(f.get_fan_direction(), "ccw");
		
		// At speed=0, switch back to clockwise direction
		f.reverse_fan_direction();
		assertEquals(f.get_fan_direction(), "cw");
	}
	
	@Test
	public void testFanDirectionConsistency() {
		
		// See if the fan direction is maintained after increasing speed many times
		f.reverse_fan_direction();
		
		f.increase_fan_speed();
		f.increase_fan_speed();
		f.increase_fan_speed();
		f.increase_fan_speed();
		f.increase_fan_speed();
		
		assertEquals(f.get_fan_direction(), "ccw");
	}
	
	@Test
	public void testResetFanSpeed() {
		
		// Change speed level 4x and test if speed changes to 0
		f.increase_fan_speed(); // Speed 0 -> 1
		f.increase_fan_speed(); // Speed 1 -> 2
		f.increase_fan_speed(); // Speed 2 -> 3
		f.increase_fan_speed(); // Speed 3 -> 0
		
		assertEquals(f.get_fan_speed(), 0);
	}

}

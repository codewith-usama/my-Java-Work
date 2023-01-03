package org.studyeasy;

public class Car {
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car(){
		doors = "opened";
		engine = "off";
		driver = "absent";
		speed = 0;
	}
		
	public Car(String doors, String engine, String driver, int speed) {
		
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}

	
	public int getSpeed(){
		return speed;
	}
	public String getDoors() {
		return doors;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public String getDriver() {
		return driver;
	}
	
	public String run(){
		if(doors.equals("closed") && engine.equals("on")
				&& driver.equals("seated") && speed >0	){
			return "running";
		}else
			return "not running";
	}
	

}

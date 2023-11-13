
public abstract class MovingSprite implements Movable{
	
	private double direction; //Direction sprite is moving on the screen: 0 to 359 degrees
	
	private double speed; //Current speed measured in pixels per screen update
	
	private double maxSpeed; //Maximum speed of the sprite
	
	private double parentWidth; //Width of the enclosing container
	
	private double parentHeight; //Height of the enclosing container
	
	public MovingSprite() { //No arg constructor
		direction = 180;
		maxSpeed = 5.0;
	}
	
	public void move() {
		//method stub
	}
	
	public double getCenterX() {
		return 0.0; //method stub
	}
	
	public double getCenterY() {
		return 0.0; //method stub
	}
	
	public double getBoundingRadius() {
		return 1.0; //method stub
	}
	
	
	//Setter methods
	
	public void setDirection(double direction) {
		this.direction = direction;
	}
	
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	
	public void setMaxSpeed(double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public void setParentWidth(double parentWidth) {
		this.parentWidth = parentWidth;
	}
	
	public void setParentHeight (double parentHeight) {
		this.parentHeight = parentHeight;
	}
	
	
	
	//Getter methods
	
	public double getDirection() {
		return this.direction;
	}
	
	public double getSpeed() {
		return this.speed;
	}
	
	public double getMaxSpeed() {
		return this.maxSpeed;
	}
	
	public double getParentWidth() {
		return this.parentWidth;
	}
	
	public double getParentHeight() {
		return this.parentHeight;
	}
	
	
	//To String Method
	
	public String toString() {
		return (getDirection() + " " + getSpeed() + " " + getMaxSpeed() + " " + getParentWidth() + " " + getParentHeight());
	}
	
	

}//end MovingSprite

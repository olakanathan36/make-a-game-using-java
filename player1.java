package src;

public class player1 {
	public int health;
	public String weapon;
	public String name;
	
	public player1(int health,String name,String weapon) {
		if(health<0 ||health>100) {
			this.health=100;
		}
		else {
			this.health=health;
		}
		this.name=name;
		this.weapon=weapon;
	}
	public void gun1() {
		this.health-=30;
		if(this.health<=0) {
			this.health=0;
		}
		
		System.out.print("player one health becomes "+this.health);
		
	}
	public void gun2(){
		this.health-=50;
		if(this.health<=0) {
			this.health=0;
		}
		
		System.out.print("player one health becomes "+this.health);
		
	}
	public void heal() {
		this.health=100;
	}
	public void getHealth(){ 
		System.out.print("health"+this.health);
	}
	
}

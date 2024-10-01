package src;


public class player2 extends player1{
	private int health;
	private boolean armour;

	public player2(int health ,String name,String weapon,boolean armour) {
		super(health,name,weapon);
		
		if(health<0||health>100) {
			this.health=100;
		}
		else {
			this.health=health;
		}
		
		this.armour=armour;
	}
	@Override
	public void gun1() {
		if(armour) {
			this.health-=20;
			if(this.health<=0) {
				this.health=0;
			}
			System.out.print("player 2 attack by gun_2  "+this.health);

		}
		if(!armour){
			
			this.health-=40;
			if(this.health<=0) {
				this.health=0;
			}
			System.out.print("player 2 attack by gun2"+this.health);

		}
		if(this.health==0) {
			System.out.print("player is dead");
			
		}
	}
	@Override
	public void gun2() {
		if(armour) {
			this.health-=20;
			if(this.health<=0) {
				this.health=0;
			}
			System.out.print("player 2 attack by gun2"+this.health);

		}
		if(!armour){
			
			this.health-=30;
			if(this.health<=0) {
				this.health=0;
			}
			System.out.print("player 2 attack by gun2"+this.health);

		}
		if(this.health==0) {
			System.out.print("player is dead");
			
		}
	}
	public void heal() {
		this.health=100;
	}
	
}

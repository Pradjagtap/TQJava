package com.demo.overriding;
/*
 Create a class Game having the method rules() and noOfPlayers(). Create a class BasketBall, Soccer, Cricket
which are child class of Game. Override the above methods and use dynamic method dispatch
to show thw rules and noofPlayers according to the object passed
 */
class Game
{
	protected String rules;
	protected int noOfPlayers;
	
	void rules() {
		System.out.println("Must be 2 teams");
		
	}
	void noOfPlayers() {
		System.out.println("No of players should be as per rule of game");
	}
}
class BasketBall extends Game{
	@Override
		void rules() {
		System.out.println("Must be 2 teams");
		System.out.println("Ball and ballhandler must remain inbounds");
		System.out.println("Score withinn the shot clock");
		
	}
	void noOfPlayers() {
		System.out.println("No of players should be as per rule of game");
		System.out.println("No of players on the court should be 5");
	}
	
	
}
class soccer extends Game{
	@Override
	void rules() {
		System.out.println("Must be 2 teams");
		System.out.println("A match is played in two 45 minutes halves");
		System.out.println("The game begins with the toss of coin");
		
	}
	void noOfPlayers() {
		System.out.println("No of players should be as per rule of game");
		System.out.println("No of players are no more than 11 players");
	}
	
}
class cricket extends Game{
	@Override
	void rules() {
		System.out.println("Must be 2 teams");
		System.out.println("The bowler must bowl 6 legal deliveries to constitute an over");
		System.out.println("The game begins with the toss of coin");
		
	}
	void noOfPlayers() {
		System.out.println("No of players should be as per rule of game");
		System.out.println("No of players are no more than 11 players");
	}
}
public class Game_example {

	public static void main(String[] args) {
		Game g;
		g=new cricket();
		g.rules();
		g.noOfPlayers();
		g=new soccer();
		g.rules();
		g.noOfPlayers();
		g=new BasketBall();
		g.rules();
		g.noOfPlayers();

	}

}

package anand.learn.dp.isAhasA.hasA;

public class AttackImpl implements Attack {
	private String move;
	private String attack;

	public AttackImpl(String move, String attack) {
		this.move = move;
		this.attack = attack;
	}

	public void move() {
		System.out.println(move);
	}

	public void attack() {
		move();
		System.out.println(attack);
	}
}

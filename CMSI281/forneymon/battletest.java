package forneymon;

public class BattleTest {
	
	public static void main (String[] args) {
		Burnymon emberliz = new Burnymon("Emby");
		System.out.println(emberliz.getHealth());
		emberliz.takeDamage(5, "dampy");
		System.out.println(emberliz.getHealth());
		System.out.println(emberliz);
	}
}

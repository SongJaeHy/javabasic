package interaction.game;

public class Main {

	public static void main(String[] args) {
		Warrior w1 = new Warrior();
		Ogresse o2 = new Ogresse();

		w1.huntOgresse(o2);
		w1.huntOgresse(o2);
		w1.huntOgresse(o2);
		w1.huntOgresse(o2);
		w1.showStatus();
	}
}

package cn.gedobu.some.scribe;

public class Main {

	public static void main(String[] args) {
		Game some = new Game();

		Body kelly = some.hasABody();
		kelly
			.genderIs("female")
			.ageIs(16);
	}

}

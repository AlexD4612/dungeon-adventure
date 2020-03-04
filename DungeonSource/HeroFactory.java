public class HeroFactory {
	
	public Hero createHero(int heroNum) {
		switch(heroNum) {
			case 1:
				return new Sorceress();
				break;
			case 2:
				return new Thief();
				break;
			case 3:
				return new Warrior();
				break;
			default:
				return new Warrior();
				break;
		}
	}
}

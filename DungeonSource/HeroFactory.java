public class HeroFactory {
	
	public HeroFactory() {}
	
	public Hero createHero(int heroNum) {
		switch(heroNum) {
			case 1:
				return new Warrior();
			case 2:
				return new Sorceress();
			case 3:
				return new Thief();
			case default:
				return new Warrior();
		}
	}
}
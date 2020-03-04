public class HeorFactory {
	
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
			case default:
				return new Warrior();
				break;
		}
	}
}
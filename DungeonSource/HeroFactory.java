public class HeroFactory {
	
	public HeroFactory() {}
	
	public Hero createHero(int heroNum) {
		switch(heroNum) {
			case 1:
				return new Warrior();
<<<<<<< HEAD
			case 2:
				return new Sorceress();
			case 3:
				return new Thief();
			case default:
=======
				break;
			default:
>>>>>>> branch 'Graham' of https://github.com/AlexD4612/dungeon-adventure.git
				return new Warrior();
		}
	}
}

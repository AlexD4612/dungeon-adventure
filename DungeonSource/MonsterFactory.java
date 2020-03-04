public class MonsterFactory {
	
	public MonsterFactory() {}
	
	public Monster createMonster(int monsterNum) {
		switch(monsterNum) {
			case 1:
				return new Gremlin();
			case 2:
				return new Ogre();
			case 3:
				return new Skeleton();
<<<<<<< HEAD
			case default:
=======
				break;
			default:
>>>>>>> branch 'Graham' of https://github.com/AlexD4612/dungeon-adventure.git
				return new Skeleton();
		}
	}
}

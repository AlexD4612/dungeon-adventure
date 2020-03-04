public class MonsterFactory {
	
	public Monster createMonster(int monsterNum) {
		switch(monsterNum) {
			case 1:
				return new Gremlin();
				break;
			case 2:
				return new Ogre();
				break;
			case 3:
				return new Skeleton();
				break;
			default:
				return new Skeleton();
				break;
		}
	}
}

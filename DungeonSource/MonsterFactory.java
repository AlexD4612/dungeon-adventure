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
			default:
				return new Skeleton();
		}
	}
}

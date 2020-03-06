

/**
 * Title:
 * Description:
 * Copyright:    Copyright (c) 2001
 * Company:
 * @author
 * @version 1.0
 */

public class Gremlin extends Monster
{

    public Gremlin()
	{
		super("Gnarltooth the Gremlin", 70, 5, .8, .4, 15, 30, 20, 40);

    }

	public void attack(DungeonCharacter opponent)
	{
		System.out.println(getName() + " jabs his kris at " +
							opponent.getName() + ":");
		super.attack(opponent);

	}

	@Override
	public void specialAttack(DungeonCharacter opponent) {
		// TODO Auto-generated method stub
		
	}
	

}
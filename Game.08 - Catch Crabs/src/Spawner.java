import java.util.Random;

public class Spawner {
	
	public int curTime = 0,targetTime = 60*2;
	public Random random;
	public Spawner() {
		random = new Random();
	}

	public void update() {
		curTime++;
		if(curTime == targetTime) {
			curTime = 0;
			if(random.nextInt(100) < 25) {
				Game.crabs.add(new Crab(random.nextInt(Game.WIDTH - 40),-40));
			}else if(random.nextInt(100)<25){
				Game.crabs.add(new Crab(random.nextInt(Game.WIDTH - 40),Game.HEIGHT-40));
			}else if(random.nextInt(100)<25){
				Game.crabs.add(new Crab(-40,random.nextInt(Game.HEIGHT - 40)));
			}else {
				Game.crabs.add(new Crab(Game.WIDTH-40,random.nextInt(Game.HEIGHT - 40)));
			}
		}
	}
	
}

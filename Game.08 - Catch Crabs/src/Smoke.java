import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Smoke {

	public int x,y;
	public static BufferedImage[] spriteSmoke;
	
	public int curFrames = 0,maxFrames = 10, maxAnim = 2, curAnim = 0;
	
	public Smoke(int x,int y) {
		this.x = x;
		this.y = y;
		spriteSmoke = new BufferedImage[2];
		spriteSmoke[0] = Game.spritesheet.getSprite(32, 0);
		spriteSmoke[1] = Game.spritesheet.getSprite(48,0);
	}
	
	public void update() {
		curFrames++;
		if(curFrames == maxFrames) {
			curAnim++;
			if(curAnim == maxAnim) {
				curAnim = 0;
				Game.smokes.remove(this);
			}
			curFrames = 0;
		}
	}
	
	public void render(Graphics g) {
		g.drawImage(spriteSmoke[curAnim],(int)x,(int)y,40,40,null);
	}
	
}

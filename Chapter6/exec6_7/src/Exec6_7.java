class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	public dougle getDistance(int x, int y)
	{
		
	}
}

public class Exec6_7 {
	public static void main(String args[]) {
		Mypoint p = new MyPoint(1,1);
		
		System.out.println(p.etDistance(2,2));
	}

}

class PlayingCard {
	int kind;
	int num;
	static int width;
	static int height;
		PlayingCard(int k, int n) {
			kind = k;
			num = n;
		}
	public static void main(String args[]) 
	{
		PlayingCard card = new PlayingCard(1,1);
	}
}
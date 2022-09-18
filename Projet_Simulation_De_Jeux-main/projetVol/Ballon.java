public class Ballon{
    private int x; 
    private int y;
    private static int max_x;
    private static int max_y;


    public Ballon(int x, int y, int max_x, int max_y){
        this.x=x;
        this.y=y;
        this.max_x=max_x;
        this.max_y=max_y;   
    }

    public void seDeplacer(){
        this.x= (int) (Math.random() * (max_x));
        this.y= (int) (Math.random() * (max_y));
    }

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

}
import java.util.Date;

public class Fruit extends Food {
	public Date ripeTime; 
	
	public Fruit() {
    	ripeTime = new Date(0,0,0);
    }
    public Fruit(Date r, String n) {
    	name = n;
    	ripeTime = r;
    }
    public void isRipe() {
        System.out.println("You can eat it on ");
        System.out.println(ripeTime);
    }
}

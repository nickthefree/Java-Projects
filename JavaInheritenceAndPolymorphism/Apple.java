import java.util.Date;
public class Apple extends Fruit {
	public Apple() {
    	ripeTime = new Date(0,0,0);
	}
    public Apple(Date r) {
    	ripeTime = r;
    }
    public void prepare() {
        System.out.println("Core the apple");
    }
}

import java.util.Date;

public class Orange extends Fruit {
	public Orange() {
    	ripeTime = new Date(0,0,0);
	}
    public Orange(Date r) {
    	ripeTime = r;
    }
    public void prepare() {
        System.out.println("Peel the orange");
    }
}

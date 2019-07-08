// Main 
import java.util.Date;
public class Main {
  public static void main(String args[]) {
  Date date = new Date(1000000000);
	Food gum = new Food("Gum");
	Food lasanga = new Food("Lasagna");
	Fruit pomegranate = new Fruit(date, "Pomegranate");
	Fruit apple = new Apple(date);
	Orange orange = new Orange(date);
	Shrimp shrimp = new Shrimp();
	Seafood prawn = new Prawn();
	Seafood lobster = new Seafood("Lobster");

	shrimp.prepare();
	apple.prepare();
	pomegranate.prepare();
	orange.prepare();
	gum.prepare();
	prawn.prepare();
	lobster.prepare();
 	lasanga.prepare();
 	lasanga = apple;
 	lasanga.prepare();

 	orange.isRipe();
 	pomegranate.isRipe();
	}
}

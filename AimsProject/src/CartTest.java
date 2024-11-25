
public class CartTest {

	public static void main(String[] args) {
		Cart TestCart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation", "Roger Allers", 87, 19.95f);
        TestCart.addDigitalVideoDisc(dvd1); 
        
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction", "George Lucas", 87, 24.95f);
        TestCart.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        TestCart.addDigitalVideoDisc(dvd3);
        TestCart.printCart();

	}

}

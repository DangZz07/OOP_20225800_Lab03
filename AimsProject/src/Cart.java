public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    public int qtyOrdered=0;
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered > 0){
            for (int i = 0; i < qtyOrdered; i++) {
                if (itemOrdered[i].equals(disc)) {
                    itemOrdered[i] = itemOrdered[qtyOrdered - 1];
                    itemOrdered[qtyOrdered - 1] = null;
                    qtyOrdered--;
                    System.out.println("The disc has been removed.");
                }
            }
            
        }
        else {
        	System.out.println("Your cart dont have any disc.");
        }
       

    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if(qtyOrdered == MAX_NUMBERS_ORDERED){
            System.out.println("The cart is almost full.");
        }
        else {
            itemOrdered[qtyOrdered++] = disc;
            System.out.println("The disc " + disc.getTitle() + " has been added.");
        	
        }
    }


    public float totalCost(){
        float total = 0;
        int i = 0;
        while(i < qtyOrdered) {
        	total += itemOrdered[i].getCost();
        	i++;
        }
        return total;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    	for(DigitalVideoDisc disc : dvdList) {
    		if(qtyOrdered != MAX_NUMBERS_ORDERED) {
    			System.out.println("The disc " + disc.getTitle() + " has been added");
    			itemOrdered[qtyOrdered++] = disc;
    		}
    		else {
    			System.out.println("The cart is almost full. Cannot add more.");
    		}
    	}
    }
//    public void addDigitalVideoDisc(DigitalVideoDisc... disc) {
//    	for(DigitalVideoDisc disc : disc) {
//    		if(qtyOrdered != MAX_NUMBERS_ORDERED) {
//    			System.out.println("The disc " + disc.getTitle() + " has been added");
//    			itemOrdered[qtyOrdered++] = disc;
//    		}
//    		else {
//    			System.out.println("The cart is almost full. Cannot add more.");
//   		}
//    	}
//    } khong the nap chong phuong thuc nhu vay
    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
    	if(qtyOrdered == MAX_NUMBERS_ORDERED) {
    		System.out.println("The cart is almost full. Cannot add more.");
    	}
    	else {
    		itemOrdered[qtyOrdered++] = dvd1;
    		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
    			System.out.println("The disc " + dvd1.getTitle() + " has been added but the cart is almost full. Cannot add the disc " + dvd2.getTitle());
    		}
    		else {
    			itemOrdered[qtyOrdered++] = dvd2;
    			System.out.println("The disc " + dvd1.getTitle() + " and the disc " + dvd2.getTitle() + " has been added." );
    		}
    	}
    }
}
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
            System.out.println("The disc has been added.");
        	
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
    
    
}

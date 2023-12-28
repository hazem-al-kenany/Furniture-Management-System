/**
 * KidsSet represents a specialized category of furniture items within the FurnitureStore system, 
 * explicitly designed for children. This type of furniture emphasizes safety, smaller dimensions, 
 * creative designs, and durability to withstand the lively activities of children.
 * Examples include cribs, toddler beds, toy chests, kid-sized tables, and chairs, among others.
 * 
 * The differentiation of KidsSet is essential because children have unique needs when it comes to furniture. 
 * Their furniture must be safe, free from sharp edges, made with non-toxic materials, and often 
 * incorporates playful designs or themes to cater to their preferences.
 * 
 * Recognizing and classifying KidsSet not only ensures safety and satisfaction for younger users 
 * but also assists parents in making informed decisions when furnishing spaces for their children. 
 * Additionally, by isolating this category, the store can effectively focus its marketing and 
 * sales strategies towards families and institutions catering to children, like schools or daycares.
 */
public class KidsSet extends furnitureBase{
    public String kidsId;  // id of furniture set
    public String furName; //name of specific furniture piece 
    public double price;   //price of furniture set
    
    //extra attributes
    public String setName; // name of furniture set
    public double furPrice; //price of specific furniture piece 
    
    //Default constructor
    public KidsSet(int id, String furnitureCategory, int itemCount, double price) {
        super(id, furnitureCategory, itemCount, price);
    }
    
    public KidsSet(String kidsId, String furName, double price, String setName, double furPrice) {
        this.kidsId = kidsId;
        this.furName = furName;
        this.price = price;
        this.setName = setName;
        this.furPrice = furPrice;
    }
    
    public double getPrice() {
        return price;
    }
    
    // Display price based on the set ID
    public void showPrice() {
        System.out.println("Price for " + setName + " set: $" + price);
    }
    
    // Provide mystery gift based on price
    public String mysteryGift() {
        if (price > 500) { 
            return "Luxury Office Chair";
        } else if (price >= 300 && price <= 500) {
            return "Desk Organizer Set";
        } else if (price >= 200 && price < 300) {
            return "Free Lamp";
        } else if (price < 200 && price > 0) {
            return "No mystery gift for this purchase";
        }
        return "No mystery gift for this purchase";
    }
    
    // For specific furniture set gifts
    public String specialMysteryGift(){
         if (setName.equals("Dinosaur Adventure")) { 
            return "Free Dino Lamp";
        } else if (setName.equals("Space Explorer")) {
            return "Astronaut Pen Holder";
        }
        return "No special mystery gift for this purchase";
    }
    
    public double getFurniturePrice() {
        return furPrice;
    }
}
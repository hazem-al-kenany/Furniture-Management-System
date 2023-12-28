/**
 * OfficeFurniture represents a specialized subset of furniture items within the FurnitureStore system.
 * This type of furniture is tailored for use in office environments, be it home offices, corporate settings,
 * or other professional areas. Each OfficeFurniture item might possess attributes like ergonomic design,
 * adjustability features, durability specifications, and more. Examples include office chairs, desks,
 * conference tables, file cabinets, and partitions.
 * 
 * The distinction of OfficeFurniture is crucial as these items prioritize functionality, comfort, and
 * durability for long working hours. They play a pivotal role in ensuring a conducive and productive work environment.
 * Furthermore, this classification helps in streamlining product recommendations for businesses and professionals 
 * and enables the store to target specific marketing and sales strategies towards corporate clients or remote workers.
 */
public class OfficeFurniture extends furnitureBase{
    public String furnitureCategory;
    public boolean isErgonomic;
    public String material;
    public double price;
    
    //default constructor
    public OfficeFurniture(int id, String furnitureCategory, int itemCount, double price) {
        super(id, furnitureCategory, itemCount, price);
    }
  
    public OfficeFurniture(String furnitureCategory, boolean isErgonomic, String material, double price) {
        this.furnitureCategory = furnitureCategory;
        this.isErgonomic = isErgonomic;
        this.material = material;
        this.price = price;
    }
    
        public String getCategory() {
        return furnitureCategory;
    }
    
        public boolean isErgonomicFurniture() {
        return isErgonomic;
    }
    
        public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }
    
    public void adjustPrice() {
        if (isErgonomic) {
            price += 0.1*price; //10% price increase
        }
        if (material.equals("Wood")) {
            price += 0.15*price; //15% price increase
        }
        else if (material.equals("Metal")) {
            price += 0.05*price; //5% price increase
        }
    }
}
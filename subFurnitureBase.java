import java.util.*;
public class subFurnitureBase extends furnitureBase
{
    public subFurnitureBase()
    {
        super();
    }
    
        public subFurnitureBase(int id, String furnitureCategory, int itemCount, double price) {
        super(id, furnitureCategory, itemCount, price); // Calling the superclass constructor with provided parameters
    }
}
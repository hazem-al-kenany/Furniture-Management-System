# Furniture Store Management System

The **Furniture Store Management System** is a Java-based application designed to manage furniture inventory, purchasers, and categories. This system provides robust features for adding, viewing, and managing furniture items, as well as creating detailed customer and category records.

---

## Features

### General Features
- **Inventory Management**: Add, view, and update furniture items, including specific categories like office furniture and kids' furniture.
- **Purchaser Management**: Keep track of customer details, purchase history, and associated orders.
- **Category Management**: Define furniture categories with attributes like max load, suitability for outdoor use, and materials.
- **Pricing and Discounts**: Automatically adjust prices based on material and ergonomic features, and calculate discounts.
- **Mystery Gifts**: Provide gifts based on purchase criteria.

### Furniture Types
1. **Office Furniture**:
   - Ergonomic options and material-based pricing adjustments.
   - Examples: Desks, office chairs, conference tables.
2. **Kids' Furniture**:
   - Focused on safety, durability, and playful designs.
   - Examples: Cribs, toy chests, themed beds.
3. **General Furniture**:
   - Includes items like tables, chairs, sofas, and beds.

### User Interfaces
- **FurnitureStoreUI**: A console-based UI for managing inventory, categories, and customers.
- **Tester**: A test class for validating system functionality.

---

## Code Structure

### Main Classes

#### **furnitureBase**
- Abstract base class representing furniture items.
- Tracks attributes like category, price, item count, and procurement date.
- Provides methods for discount calculation, inventory management, and linking purchasers.

#### **FurnitureStore**
- Implements the `FURNITUREInterface` for inventory, purchaser, and category management.
- Maintains collections for furniture pieces, categories, and customers.

#### **FURNITUREInterface**
- Defines the basic operations for managing furniture, purchasers, and categories.

#### **FurnitureCategory**
- Represents a category of furniture with attributes like max load, outdoor suitability, and materials.
- Supports bulk operations and promotional activities.

#### **Purchaser**
- Represents customers with attributes like name, contact details, and purchase history.
- Links to specific furniture orders.

#### **KidsSet**
- Specialized furniture for children, emphasizing safety and playful designs.
- Includes features like mystery gifts and special promotions.

#### **OfficeFurniture**
- Specialized furniture for office use with attributes for ergonomic design and material-based pricing.

#### **FurnitureStoreUI**
- Console-based UI for interacting with the system.
- Supports adding and viewing furniture, purchasers, and categories.

#### **Tester**
- Validates the system's functionality with predefined tests.

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher.
- IDE such as IntelliJ, Eclipse, or BlueJ.

### Steps
1. **Clone the Repository**:
   ```bash
   git clone <repository-url>
   cd furniture-store-management

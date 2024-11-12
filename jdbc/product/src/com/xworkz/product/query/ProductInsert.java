package com.xworkz.product.query;

public class ProductInsert {

	String insertQuery="INSERT INTO shop_details VALUES (1, 'SuperMart', 'contact@supermart.com', 1234, '2010-05-10', 9876543210, '123 Main St, City, Country', '9 AM - 9 PM', 'John Doe', 'https://supermart.com', 4.5),"+
			"(2, 'TechZone', 'info@techzone.com', 5678, '2015-08-15', 9876543211, '456 Tech Rd, City, Country', '10 AM - 8 PM', 'Jane Smith', 'https://techzone.com', 4.8),"+
			"(3, 'FashionHub', 'contact@fashionhub.com', 9101, '2018-02-20', 9876543212, '789 Fashion Blvd, City, Country', '11 AM - 7 PM', 'Alice Brown', 'https://fashionhub.com', 4.2),"+
			"(4, 'GroceryMart', 'support@grocerymart.com', 1122, '2012-11-05', 9876543213, '321 Grocery St, City, Country', '8 AM - 10 PM', 'Tom White', 'https://grocerymart.com', 4.6),"+
			"(5, 'BeautyWorld', 'service@beautyworld.com', 3344, '2017-07-01', 9876543214, '654 Beauty Ave, City, Country', '10 AM - 6 PM', 'Sarah Green', 'https://beautyworld.com', 4.3),"+
			"(6, 'HomeEssentials', 'contact@homeessentials.com', 5566, '2019-01-15', 9876543215, '987 Home Rd, City, Country', '9 AM - 8 PM', 'David Black', 'https://homeessentials.com', 4.7),"+
			"(7, 'TechieStore', 'support@techiestore.com', 7788, '2016-04-12', 9876543216, '101 Techie Ave, City, Country', '9 AM - 9 PM', 'Liam Blue', 'https://techiestore.com', 4.9),"+
			"(8, 'ToyWorld', 'info@toyworld.com', 9900, '2013-09-25', 9876543217, '123 Toy St, City, Country', '10 AM - 7 PM', 'Emma Gray', 'https://toyworld.com', 4.4),"+
			"(9, 'BookBazaar', 'contact@bookbazaar.com', 2233, '2010-11-01', 9876543218, '112 Book Rd, City, Country', '9 AM - 6 PM', 'Oliver White', 'https://bookbazaar.com', 4.8),"+
			"(10, 'PetShopPlus', 'service@petshopplus.com', 4455, '2014-05-30', 9876543219, '200 Pet Blvd, City, Country', '10 AM - 5 PM', 'Lucas Black', 'https://petshopplus.com', 4.6),"+
			"(11, 'ClothingShop', 'contact@clothingshop.com', 6677, '2020-06-15', 9876543220, '56 Fashion Street, City, Country', '10 AM - 9 PM', 'Sophia Green', 'https://clothingshop.com', 4.7),"+
			"(12, 'MobileKing', 'sales@mobileking.com', 8899, '2011-03-01', 9876543221, '345 Mobile Rd, City, Country', '9 AM - 9 PM', 'Michael Blue', 'https://mobileking.com', 4.6),"+
			"(13, 'FoodMart', 'info@foodmart.com', 1011, '2015-01-10', 9876543222, '567 Food St, City, Country', '8 AM - 10 PM', 'Amelia Brown', 'https://foodmart.com', 4.3),"+
			"(14, 'FurnitureStore', 'support@furniturestore.com', 1213, '2018-03-20', 9876543223, '678 Furniture Blvd, City, Country', '10 AM - 8 PM', 'Isabella White', 'https://furniturestore.com', 4.7),"+
			"(15, 'GameStore', 'contact@gamestore.com', 1415, '2014-06-05', 9876543224, '890 Game Rd, City, Country', '10 AM - 7 PM', 'Ethan Green', 'https://gamestore.com', 4.5),"+
			"(16, 'HardwareShop', 'support@hardwareshop.com', 1617, '2012-10-18', 9876543225, '234 Hardware Ln, City, Country', '8 AM - 6 PM', 'Mason Black', 'https://hardwareshop.com', 4.6),"+
			"(17, 'FitnessHub', 'info@fitnesshub.com', 1819, '2019-11-25', 9876543226, '432 Fitness Ave, City, Country', '6 AM - 9 PM', 'Ava Blue', 'https://fitnesshub.com', 4.8),"+
			"(18, 'CraftsCorner', 'contact@craftscorner.com', 2021, '2020-05-20', 9876543227, '567 Crafts Blvd, City, Country', '10 AM - 6 PM', 'Ella White', 'https://craftscorner.com', 4.4),"+
			"(19, 'SpicesWorld', 'info@spicesworld.com', 2122, '2017-12-01', 9876543228, '890 Spices Ave, City, Country', '9 AM - 8 PM', 'Jack Green', 'https://spicesworld.com', 4.7),"+
			"(20, 'ElectroWorld', 'service@electroworld.com', 2324, '2016-09-10', 9876543229, '321 Electro Rd, City, Country', '9 AM - 9 PM', 'James Black', 'https://electroworld.com', 4.9)";
	
	public String getInsertQuery() {
		return insertQuery;
	}
}

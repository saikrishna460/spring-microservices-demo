ADMIN
	-- TO ADD / UPDATE / DELETE -  PRODUCTS - USERS
	
	TECH
	-- REDIS or MONGO
	-- SPRING BOOT, JAVA 17

CUSTOMER
	-- End user who interacts and purchases Items from available Inventory.
	
	TECH
	-- REDIS or MONGO (Main Order History and Invoices History) , Cache
	-- SPRING BOOT, JAVA 17
	-- Message Queue**, Multithreading**, Transaction** (ACID properties)


ORDER
	-- MAINTAIN INVENTORY and FLAG to admin if stock completes.
	-- Reduce items count on every transaction from customer only if transaction succeeded (TIMEOUT).
	
	TECH
	-- REDIS or MONGO 
	-- SPRING BOOT, JAVA 17
	-- Message Queue, Multithreading

INVOICE
	-- Solely for generating Invoices in PDF and send to customer service, (MAILING ALSO)
	
	TECH
	-- MONGO
	-- SPRING BOOT, JAVA 17
	-- Message Queue, Multithreading, Files, Mailing**


  ****************************************************   BASIC LLD ********************************************************************************
PRODUCT: 
	Quantity
	Price
	Category
	SubCategory
	Name
	Description
	Image

		ELECTRONICS
			Weight
			Dimension
			Power consumption
			Material
		
		
		CLOTING
			Fabric Type
			Size
			Premium (Y/N)
			Color
			
Service Layer

Product Service -- FACTORY PATTERN
	ADD / UPDATE / DELETE - Product / products.
		-- Electronic service extends/implements PRODUCT
		-- Colthing service extends/implements PRODUCT

			
ADMIN
	ADD / UPDATE / DELETE - Product / products.
	
	ADMIN SERVICE - REDIS/MONGO DB -> async call to update cache in Customer Service
  

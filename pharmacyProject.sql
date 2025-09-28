CREATE TABLE CategoryOfMedicine(
    categoryName VARCHAR(50) PRIMARY KEY
);

CREATE TABLE Medicine(
    code VARCHAR(50) PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    price DECIMAL(7,2) NOT NULL CHECK (price > 0),
    stock INT NOT NULL CHECK (stock >= 0),
    categoryName VARCHAR(50) NOT NULL,
    FOREIGN KEY (categoryName) REFERENCES CategoryOfMedicine(categoryName)
);

CREATE TABLE WarehouseMovement(
    id INT PRIMARY KEY,
    movementType VARCHAR(50) NOT NULL ,
    movementDate DATE NOT NULL CHECK(movementDate <= CURRENT_DATE),
    quantity INT NOT NULL,
    code VARCHAR(50) NOT NULL,
    FOREIGN KEY (code) REFERENCES Medicine(code)
);
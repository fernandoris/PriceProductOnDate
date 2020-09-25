CREATE TABLE PRICES (
  ID INTEGER AUTO_INCREMENT PRIMARY KEY,
  BRAND_ID          INTEGER NOT NULL,
  START_DATE TIMESTAMP NOT NULL,
  END_DATE TIMESTAMP NOT NULL,
  PRICE_LIST INTEGER NOT NULL,
  PRODUCT_ID INTEGER NOT NULL,
  PRIORITY INTEGER NOT NULL,
  PRICE DOUBLE NOT NULL,
  CURR VARCHAR(3) NOT NULL);
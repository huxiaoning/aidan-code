CREATE TABLE `customers` (
  `ID` int(4) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(25) DEFAULT NULL,
  `EMAIL` varchar(25) DEFAULT NULL,
  `BIRTH` date DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO customers (name,email,birth) VALUES('aidan','huxiaoningsworld@sina.com','1987-10-30');
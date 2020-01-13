CREATE TABLE IF NOT EXISTS`epam`.`customers`
(
    `Id`   INT          NOT NULL,
    `Name` VARCHAR(255) NULL,
    PRIMARY KEY (`Id`)
);
CREATE TABLE IF NOT EXISTS`epam`.`orders`
(
    `Id`         INT         NOT NULL,
    `CustomerId` VARCHAR(45) NULL,
    PRIMARY KEY (`Id`)
);

INSERT INTO `epam`.`customers` (`Id`, `Name`)
VALUES ('1', 'Joe');
INSERT INTO `epam`.`customers` (`Id`, `Name`)
VALUES ('2', 'Henry');
INSERT INTO `epam`.`customers` (`Id`, `Name`)
VALUES ('3', 'Sam');
INSERT INTO `epam`.`customers` (`Id`, `Name`)
VALUES ('4', 'Max');

INSERT INTO `epam`.`orders` (`Id`, `CustomerId`)
VALUES ('1', '3');
INSERT INTO `epam`.`orders` (`Id`, `CustomerId`)
VALUES ('2', '1');

SELECT Name
FROM customers c
WHERE Id NOT IN (SELECT CustomerId FROM Orders);
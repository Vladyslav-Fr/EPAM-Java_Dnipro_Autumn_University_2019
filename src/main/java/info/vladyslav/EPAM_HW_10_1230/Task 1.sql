CREATE TABLE `person`
(
    `PersonId`  INT          NOT NULL,
    `FirstName` VARCHAR(255) NULL,
    `LastName`  VARCHAR(255) NULL,
    PRIMARY KEY (`PersonId`)
);

CREATE TABLE `address`
(
    `AddressId` INT          NOT NULL,
    `PersonId`  INT          NULL,
    `City`      VARCHAR(255) NULL,
    `State`     VARCHAR(255) NULL,
    PRIMARY KEY (`AddressId`)
);

INSERT INTO `person` (`PersonId`, `FirstName`, `LastName`)
VALUES ('1', 'Wang', 'Allen');

INSERT INTO `address` (`AddressId`, `PersonId`, `City`, `State`)
VALUES ('1', '2', 'New York City', 'New York');

SELECT FirstName, LastName, City, State
FROM person
         JOIN address a on person.PersonId = a.PersonId;
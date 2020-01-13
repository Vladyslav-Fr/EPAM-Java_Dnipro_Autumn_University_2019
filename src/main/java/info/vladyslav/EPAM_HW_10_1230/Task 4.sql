CREATE TABLE `person`
(
    `Id`    INT          NOT NULL,
    `Email` VARCHAR(255) NULL,
    PRIMARY KEY (`Id`)
);

INSERT INTO `person` (`Id`, `Email`)
VALUES ('1', 'a@b.com');
INSERT INTO `person` (`Id`, `Email`)
VALUES ('2', 'c@d.com');
INSERT INTO `person` (`Id`, `Email`)
VALUES ('3', 'a@b.com');

SELECT email, COUNT(email)
FROM person
GROUP BY email
HAVING COUNT(email) > 1;

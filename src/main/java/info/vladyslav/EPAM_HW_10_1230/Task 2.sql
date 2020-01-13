CREATE TABLE IF NOT EXISTS `employee`
(
    `Id`     INT NOT NULL,
    `Salary` INT NULL,
    PRIMARY KEY (`Id`)
);

INSERT INTO `employee` (`Id`, `Salary`)
VALUES ('1', '100');
INSERT INTO `employee` (`Id`, `Salary`)
VALUES ('2', '200');
INSERT INTO `employee` (`Id`, `Salary`)
VALUES ('3', '300');

SELECT MAX(salary)
FROM employee
WHERE salary <> (SELECT MAX(salary) FROM employee);
  
  
CREATE TABLE IF NOT EXISTS `employee`
(
    `Id`        INT          NOT NULL,
    `Name`      VARCHAR(255) NULL,
    `Salary`    INT          NULL,
    `ManagerId` INT          NULL,
    PRIMARY KEY (`Id`)
);

INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES (1, 'Joe', 70000, 3);

INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES (2, 'Henry', 80000, 4);

INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES (3, 'Sam', 60000, NULL);

INSERT INTO Employee (Id, Name, Salary, ManagerId)
VALUES (4, 'Max', 90000, NULL);

SELECT e.Id, e.Name
FROM employee e
         JOIN employee m ON e.ManagerId = m.id
WHERE e.salary > m.salary;


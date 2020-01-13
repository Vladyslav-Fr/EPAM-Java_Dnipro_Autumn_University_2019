CREATE TABLE IF NOT EXISTS `courses`
(
    `student` VARCHAR(255) NOT NULL,
    `class`   VARCHAR(255) NULL,
    PRIMARY KEY (`student`)
);
INSERT INTO `courses` (`student`, `class`)
VALUES ('A', 'Math');
INSERT INTO `courses` (`student`, `class`)
VALUES ('B', 'English');
INSERT INTO `courses` (`student`, `class`)
VALUES ('C', 'Math');
INSERT INTO `courses` (`student`, `class`)
VALUES ('D', 'Biology');
INSERT INTO `courses` (`student`, `class`)
VALUES ('E', 'Math');
INSERT INTO `courses` (`student`, `class`)
VALUES ('F', 'Computer');
INSERT INTO `courses` (`student`, `class`)
VALUES ('G', 'Math');
INSERT INTO `courses` (`student`, `class`)
VALUES ('H', 'Math');
INSERT INTO `courses` (`student`, `class`)
VALUES ('I', 'Math');

SELECT Class
FROM Courses
GROUP BY Class
HAVING COUNT(Class) >= 5;
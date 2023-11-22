/* tao bang tbCourse */
CREATE TABLE `db2303.m0`.`tbcourse` 
(`id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(40) NOT NULL , `year` INT NOT NULL , `fee` INT NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

/* tao bang tbBatch */
CREATE TABLE `db2303.m0`.`tbbatch` 
(`id` VARCHAR(12) NOT NULL , `startDate` VARCHAR(7) NOT NULL , `fee` INT NOT NULL , `courseID` INT NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;

/*chen du lieu vo bang tbCourse*/
INSERT INTO `tbcourse` (`id`, `name`, `year`, `fee`) VALUES 
(NULL, 'ACCP 2000', '2000', '900'), 
(NULL, 'ACCP 6715', '2008', '980')

INSERT INTO `tbcourse` (`id`, `name`, `year`, `fee`) VALUES 
(NULL, 'ACCP 7023', '2020', '1100');


/*chen du lieu vo bang tbbatch*/
INSERT INTO `tbbatch` (`id`, `startDate`, `fee`, `courseID`) VALUES ('T1.2303.M0', '04-2023', '1300', '3'), 
('T1.2302.E1', '03-2023', '1300', '3'),
('T1.2309.M0', '09-2023', '1310', '3'), 
('T1.2009.M1', '09-2000', '910', '1')
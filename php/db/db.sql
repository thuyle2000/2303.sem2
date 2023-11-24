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



/*tao bang tbUser*/
CREATE TABLE `db2303.m0`.`tbuser` 
(`email` VARCHAR(30) NOT NULL, 
`password` VARCHAR(30) NOT NULL , `role` INT NOT NULL , 
`name` VARCHAR(30) NOT NULL , PRIMARY KEY (`email`)) ENGINE = InnoDB;

INSERT INTO `tbuser` (`email`, `password`, `role`, `name`) VALUES 
('guest@gmail.com', '123', '1', 'mr / ms Guest'), 
('admin@gmail.com', 'admin', '2', 'mr Supervisor'),
('student@gmail.com', 'abc', '1', 'Students'), 
('noname@gmail.com', 'nothing', '1', 'mr. stranger');
drop schema ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;
CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) NULL DEFAULT NULL,
    `surname` VARCHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `ims`.`products`(
	`pid` INT(11) NOT NULL AUTO_INCREMENT,
	`product_name` VARCHAR(40) NULL DEFAULT NULL,
	`price` FLOAT DEFAULT NULL,
	`stock` INT(11) DEFAULT NULL,
	PRIMARY KEY (`pid`)
);

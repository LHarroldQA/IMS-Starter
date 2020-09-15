drop schema ims;
CREATE SCHEMA IF NOT EXISTS `ims`;
USE `ims` ;
CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) NULL DEFAULT NULL,
    `surname` VARCHAR(40) NULL DEFAULT NULL,
    PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `ims`.`items`(
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`item_name` VARCHAR(40) NULL DEFAULT NULL,
	`price` FLOAT DEFAULT NULL,
	`description` VARCHAR(40 )DEFAULT NULL,
	PRIMARY KEY (`id`)
);
CREATE TABLE IF NOT EXISTS `ims`.`orders`(
	`id` INT(11) NOT NULL AUTO_INCREMENT,
	`customer_id` INT(11),
	`address` VARCHAR(40),
	PRIMARY KEY (`id`),
	FOREIGN KEY (`customer_id`) REFERENCES customers(id)
);
CREATE TABLE IF NOT EXISTS `ims`.`orderitems`(
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`order_id` INT(11) NOT NULL,
	`item_id` INT(11) NOT NULL,
	`quantity` INT(11),
	PRIMARY KEY (`id`),
	FOREIGN KEY (`order_id`) REFERENCES orders(id),
	FOREIGN KEY (`item_id`) REFERENCES items(id)
);
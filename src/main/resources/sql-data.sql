INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('liam', 'harrold');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('john', 'smith');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('leo', 'messi');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('darth', 'vader');


INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('TV',249.99,'Tech');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Chair',99.99,'Furniture');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Football',14.99,'Sport');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Laptop',350.00,'Tech');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Camera',199.99,'Tech');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Chocolate',2.99,'Food and drink');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Coke',1.99,'Food and drink');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Cricket Bat',34.99,'Sport');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('PC',749.99,'Tech');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Lamp',19.99,'Furniture');

INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (1,1,'Essex');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (2,2,'London');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (3,4,'Manchester');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (4,5,'Liverpool');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (5,3,'Cornwall');

INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,2,1);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,4,5);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,6,10);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (2,9,5);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (2,7,7);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (3,2,4);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (3,4,5);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (3,8,10);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (4,6,10);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (4,5,1);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (4,2,4);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (4,8,2);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (5,9,1);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (5,10,2);
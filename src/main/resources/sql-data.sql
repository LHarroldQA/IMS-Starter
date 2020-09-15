INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('liam', 'harrold');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('john', 'smith');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('leo', 'messi');
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('darth', 'vader');


INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('TV',249.99,'32 inch');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Chair',99.99,'gaming chair');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Book',14.99,'autobiography');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Laptop',350.00,'MAC book');
INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('Camera',199.99,'4k 16x zoom');

INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (1,1,'Essex');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (2,2,'London');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (3,4,'Manchester');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (4,5,'Liverpool');
INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (5,3,'Cornwall');

INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,2,1);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,4,5);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,4,10);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (5,1,15);
INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (4,5,17);
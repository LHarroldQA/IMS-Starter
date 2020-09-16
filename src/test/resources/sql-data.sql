INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');



INSERT INTO `ims`.`items` (`item_name`,`price`,`description`) VALUES ('TV',249.99,'Tech');


INSERT INTO `ims`.`orders` (`id`,`customer_id`,`address`) VALUES (1,1,'Essex');


INSERT INTO `ims`.`orderitems` (`order_id`,`item_id`,`quantity`) VALUES (1,1,5);

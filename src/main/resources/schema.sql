CREATE SCHEMA `websocket`;
CREATE TABLE IF NOT EXISTS `websocket`.`users` (
	`id` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(255),
    `password` VARCHAR(255),
    `active` Boolean,
    `roles` VARCHAR(255),
    PRIMARY KEY(`id`)
);
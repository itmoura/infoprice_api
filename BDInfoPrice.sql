CREATE SCHEMA IF NOT EXISTS `infoprice` DEFAULT CHARACTER SET utf8 ;
USE `infoprice` ;

CREATE TABLE IF NOT EXISTS `infoprice`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(60) NOT NULL,
  `email` TEXT NOT NULL,
  `cpf` VARCHAR(14) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `infoprice`.`city` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `ibge` VARCHAR(16) NULL,
  `uf` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `infoprice`.`address` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `place_public` VARCHAR(45) NOT NULL,
  `number` INT NOT NULL,
  `complement` VARCHAR(45) NULL,
  `neighborhood` VARCHAR(45) NOT NULL,
  `city_id` INT NOT NULL,
  `cep` VARCHAR(10) NOT NULL,
  `user_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_address_city_idx` (`city_id` ASC) VISIBLE,
  INDEX `fk_address_user1_idx` (`user_id` ASC) VISIBLE,
  CONSTRAINT `fk_address_city`
    FOREIGN KEY (`city_id`)
    REFERENCES `infoprice`.`city` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_address_user1`
    FOREIGN KEY (`user_id`)
    REFERENCES `infoprice`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

use infoprice;

INSERT INTO users(name, email, cpf) values ('Ítalo Moura', 'italo.moura1201@gmail.com','123.123.123-12');

INSERT INTO city(name, ibge, uf) values ('Santa Rita do Sapucaí', '43.260', 'MG');

INSERT INTO address(cep, complement, neighborhood, number, place_public, city_id, user_id) values('37540-000', '', 'Pedro Sancho Vilela', 20, 'Rua Dez', 1, 1);

select * from address;
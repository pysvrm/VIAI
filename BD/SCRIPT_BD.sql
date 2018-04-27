-- MySQL Script generated by MySQL Workbench
-- Thu Apr 12 17:46:42 2018
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema vrm_viai
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema vrm_viai
-- -----------------------------------------------------
-- CREATE SCHEMA IF NOT EXISTS `vrm_viai` DEFAULT CHARACTER SET utf8 ;
USE `vrm_viai` ;

-- -----------------------------------------------------
-- Table `vrm_viai`.`user_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vrm_viai`.`user_roles` (
  `iduser_roles` INT NOT NULL AUTO_INCREMENT,
  `rol` VARCHAR(45) NULL,
  PRIMARY KEY (`iduser_roles`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `vrm_viai`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `vrm_viai`.`users` (
  `idusers` INT NOT NULL AUTO_INCREMENT,
  `username` VARCHAR(45) NOT NULL,
  `nombre` VARCHAR(45) NULL,
  `apellidp` VARCHAR(45) NULL,
  `apellidom` VARCHAR(45) NULL,
  `password` VARCHAR(200) NULL,
  `enabled` VARCHAR(45) NOT NULL DEFAULT '1',
  `fechaA` VARCHAR(45) NULL,
  `correo` VARCHAR(45) NULL,
  `telefono` VARCHAR(45) NULL,
  `user_roles_id` INT NOT NULL,
  PRIMARY KEY (`idusers`, `user_roles_id`),
  INDEX `fk_users_user_roles_idx` (`user_roles_id` ASC),
  CONSTRAINT `fk_users_user_roles`
    FOREIGN KEY (`user_roles_id`)
    REFERENCES `vrm_viai`.`user_roles` (`iduser_roles`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


INSERT INTO `vrm_viai`.`user_roles` (`rol`) VALUES ('ROLE_ADMIN');
INSERT INTO `vrm_viai`.`user_roles` (`rol`) VALUES ('ROLE_USER');
INSERT INTO `vrm_viai`.`user_roles` (`rol`) VALUES ('ROLE_GOD');


INSERT INTO `vrm_viai`.`users` 
(`username`, `nombre`, `apellidp`, `apellidom`, `password`, `fechaA`, `correo`, `telefono`, `user_roles_id` ) 
VALUES ('vrodriguezmtz@hotmail.com', 'Vladimir', 'Rodriguez', 'Martinez',
 '$2a$10$nAKXld8hEJiW.gOIHUaoAu2oabba55n0pfloGfJAXaLgGSUlr2.iy', '12/04/2018', 'vrodriguezmtz@hotmail.com', '5519481450',1);

INSERT INTO `vrm_viai`.`users` 
(`username`, `nombre`, `apellidp`, `apellidom`, `password`, `enabled`, `fechaA`, `correo`, `telefono`, `user_roles_id`) 
VALUES ('jaalvarez@ferromex.mx', 'Jose Armando', 'Alvarez', 'Hernandez', '$2a$10$nAKXld8hEJiW.gOIHUaoAu2oabba55n0pfloGfJAXaLgGSUlr2.iy', '', '2018/04/13', 'jaalvarez@ferromex.mx', '5519481450', '2');

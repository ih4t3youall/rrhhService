drop schema rrhhservice;
create schema rrhhservice;
use rrhhservice;
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema rrhhservice
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema rrhhservice
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rrhhservice` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
-- -----------------------------------------------------
-- Schema rrhhservice
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema rrhhservice
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `rrhhservice` DEFAULT CHARACTER SET utf8 ;
USE `rrhhservice` ;

-- -----------------------------------------------------
-- Table `rrhhservice`.`motivo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rrhhservice`.`motivo` (
  `idmotivo` INT UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '',
  `motivo` VARCHAR(100) NULL COMMENT '',
  PRIMARY KEY (`idmotivo`)  COMMENT '')
ENGINE = InnoDB;

USE `rrhhservice` ;

-- -----------------------------------------------------
-- Table `rrhhservice`.`empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rrhhservice`.`empleado` (
  `id_empleado` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `nombre` VARCHAR(100) NULL DEFAULT NULL COMMENT '',
  `apellido` VARCHAR(100) NULL DEFAULT NULL COMMENT '',
  `documento` VARCHAR(45) NULL DEFAULT NULL COMMENT '',
  `legajo` VARCHAR(100) NULL DEFAULT NULL COMMENT '',
  `cargo` VARCHAR(150) NULL DEFAULT NULL COMMENT '',
  `subCargo` VARCHAR(150) NULL DEFAULT NULL COMMENT '',
  `fechaNacimiento` DATE NULL DEFAULT NULL COMMENT '',
  `direccion` VARCHAR(100) NULL DEFAULT NULL COMMENT '',
  `telefono` VARCHAR(70) NULL DEFAULT NULL COMMENT '',
  `celular` VARCHAR(70) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`id_empleado`)  COMMENT '',
  UNIQUE INDEX `id_empleado` (`id_empleado` ASC)  COMMENT '')
ENGINE = InnoDB
AUTO_INCREMENT = 51
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `rrhhservice`.`horario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rrhhservice`.`horario` (
  `idHorarios` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `entrada` DATE NULL DEFAULT NULL COMMENT '',
  `fecha` DATE NULL DEFAULT NULL COMMENT '',
  `salida` DATE NULL DEFAULT NULL COMMENT '',
  `id_empleado` INT(11) NOT NULL COMMENT '',
  PRIMARY KEY (`idHorarios`)  COMMENT '',
  INDEX `FK416647E2D49CD4BE` (`id_empleado` ASC)  COMMENT '',
  CONSTRAINT `FK416647E2D49CD4BE`
    FOREIGN KEY (`id_empleado`)
    REFERENCES `rrhhservice`.`empleado` (`id_empleado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `rrhhservice`.`solicitud`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rrhhservice`.`solicitud` (
  `id_solicitud` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `fecha_realizado` DATE NULL DEFAULT NULL COMMENT '',
  `licencia_fin` DATE NULL DEFAULT NULL COMMENT '',
  `licencia_inicio` DATE NULL DEFAULT NULL COMMENT '',
  `textoSolicitud` VARCHAR(255) NULL DEFAULT NULL COMMENT '',
  `id_empleado` INT(11) NOT NULL COMMENT '',
  `motivo_idmotivo` INT UNSIGNED NOT NULL COMMENT '',
  PRIMARY KEY (`id_solicitud`)  COMMENT '',
  UNIQUE INDEX `id_solicitud` (`id_solicitud` ASC)  COMMENT '',
  INDEX `FKAF52BEA4D49CD4BE` (`id_empleado` ASC)  COMMENT '',
  INDEX `fk_solicitud_motivo1_idx` (`motivo_idmotivo` ASC)  COMMENT '',
  CONSTRAINT `FKAF52BEA4D49CD4BE`
    FOREIGN KEY (`id_empleado`)
    REFERENCES `rrhhservice`.`empleado` (`id_empleado`),
  CONSTRAINT `fk_solicitud_motivo1`
    FOREIGN KEY (`motivo_idmotivo`)
    REFERENCES `rrhhservice`.`motivo` (`idmotivo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `rrhhservice`.`users`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rrhhservice`.`users` (
  `username` VARCHAR(45) NOT NULL COMMENT '',
  `password` VARCHAR(45) NOT NULL COMMENT '',
  `enabled` TINYINT(4) NOT NULL DEFAULT '1' COMMENT '',
  `id_empleado` INT(11) NULL DEFAULT NULL COMMENT '',
  PRIMARY KEY (`username`)  COMMENT '')
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `rrhhservice`.`user_roles`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `rrhhservice`.`user_roles` (
  `user_role_id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '',
  `username` VARCHAR(45) NOT NULL COMMENT '',
  `role` VARCHAR(45) NOT NULL COMMENT '',
  PRIMARY KEY (`user_role_id`)  COMMENT '',
  UNIQUE INDEX `uni_username_role` (`role` ASC, `username` ASC)  COMMENT '',
  INDEX `fk_username_idx` (`username` ASC)  COMMENT '',
  CONSTRAINT `fk_username`
    FOREIGN KEY (`username`)
    REFERENCES `rrhhservice`.`users` (`username`))
ENGINE = InnoDB
AUTO_INCREMENT = 24
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;



INSERT INTO users(username,password,enabled)
VALUES ('root','root', true);

INSERT INTO user_roles (username, role)
VALUES ('root', 'ROLE_ADMIN');

insert into motivo (motivo) value("tramite");
insert into motivo (motivo) value("maternidad");
insert into motivo (motivo) value("otro");
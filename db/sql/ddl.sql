 CREATE TABLE IF NOT EXISTS `java_db`.`janken` (
  `id` INT auto_increment,
  `yourChoice` VARCHAR(45) NULL,
  `pcChoice` VARCHAR(45) NULL,
  `jankenResult` VARCHAR(45) NULL,
  `sort` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);
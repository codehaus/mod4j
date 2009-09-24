------------------------------------------------------------------
-- JPOX SchemaTool (version 1.2.2) ran at 27/08/2009 13:23:49
------------------------------------------------------------------
-- Complete schema required for the following classes:-
--     nl.ordina.mod4j.wicket.model.Breakfast
--     nl.ordina.mod4j.wicket.model.Comestible
--     nl.ordina.mod4j.wicket.model.Part
--
-- Table `BREAKFAST` for classes [nl.ordina.mod4j.wicket.model.Breakfast]
CREATE TABLE `BREAKFAST`
(
    `ID` INTEGER NOT NULL,
    `NAME` VARCHAR(32) BINARY NOT NULL,
    `PRICE` DOUBLE NOT NULL,
    `SERVING_STYLE` VARCHAR(32) BINARY NOT NULL,
    PRIMARY KEY (`ID`)
) ENGINE=INNODB;

-- Table `COMESTIBLE` for classes [nl.ordina.mod4j.wicket.model.Comestible]
CREATE TABLE `COMESTIBLE`
(
    `ID` INTEGER NOT NULL,
    `MINIMAL_QUANTITY` INTEGER NOT NULL,
    `NAME` VARCHAR(32) BINARY NOT NULL,
    `PRICE` DOUBLE NOT NULL,
    `TRANSPORT_FORM` VARCHAR(32) BINARY NULL,
    PRIMARY KEY (`ID`)
) ENGINE=INNODB;

-- Table `PART` for classes [nl.ordina.mod4j.wicket.model.Part]
CREATE TABLE `PART`
(
    `ID` INTEGER NOT NULL,
    `COMESTIBLE_ID` INTEGER NOT NULL,
    `QUANTITY` INTEGER NOT NULL,
    `BREAKFAST_ID` INTEGER NULL,
    PRIMARY KEY (`ID`)
) ENGINE=INNODB;

-- Constraints for table `BREAKFAST` for class(es) [nl.ordina.mod4j.wicket.model.Breakfast]
ALTER TABLE `BREAKFAST` ADD CONSTRAINT `UNIQUE_BREAKFAST_NAME` UNIQUE (`NAME`);


-- Constraints for table `COMESTIBLE` for class(es) [nl.ordina.mod4j.wicket.model.Comestible]
ALTER TABLE `COMESTIBLE` ADD CONSTRAINT `UNIQUE_COMESTIBLE_NAME` UNIQUE (`NAME`);


-- Constraints for table `PART` for class(es) [nl.ordina.mod4j.wicket.model.Part]
CREATE INDEX `PART_N50` ON `PART` (`COMESTIBLE_ID`);

CREATE INDEX `PART_N49` ON `PART` (`BREAKFAST_ID`);

ALTER TABLE `PART` ADD CONSTRAINT `PART_FK2` FOREIGN KEY (`BREAKFAST_ID`) REFERENCES `BREAKFAST` (`ID`) ;

ALTER TABLE `PART` ADD CONSTRAINT `PART_FK1` FOREIGN KEY (`COMESTIBLE_ID`) REFERENCES `COMESTIBLE` (`ID`) ;



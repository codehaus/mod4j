package org.mod4j.runtime.hibernate;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.hibernate.cfg.DefaultNamingStrategy;
import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.cfg.NamingStrategy;

/**
 * @author Eric Jan Malotaux
 * 
 */
public class Mod4jNamingStrategy extends ImprovedNamingStrategy {
     private static Logger logger = Logger.getLogger("Mod4jNamingStrategy");

    /**
     * A convenient singleton instance
     */
    public static final NamingStrategy INSTANCE = new Mod4jNamingStrategy();

    /**
     * {@inheritDoc}
     */
    @Override
    public String classToTableName(String className) {
        logger.info("className=" + className);
        String result = super.classToTableName(className) + "_table";
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String collectionTableName(String ownerEntity, String ownerEntityTable, String associatedEntity,
            String associatedEntityTable, String propertyName) {
        logger.info("ownerEntity=" + ownerEntity);
        logger.info("ownerEntityTable=" + ownerEntityTable);
        logger.info("associatedEntity=" + associatedEntity);
        logger.info("associatedEntityTable=" + associatedEntityTable);
        logger.info("propertyName=" + propertyName);
        String collectionTableName = super.collectionTableName(ownerEntity, ownerEntityTable, associatedEntity, associatedEntityTable, propertyName);
        logger.info("result=" + collectionTableName);
        return collectionTableName;
    }

    @Override
    public String columnName(String columnName) {
        logger.info("columnName=" + columnName);
        String result = super.columnName(columnName);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String foreignKeyColumnName(String propertyName, String  propertyEntityName, String propertyTableName,
            String referencedColumnName) {
        logger.info("propertyName=" + propertyName);
        logger.info("propertyEntityName=" + propertyEntityName);
        logger.info("propertyTableName=" + propertyTableName);
        logger.info("referencedColumnName=" + referencedColumnName);
        String result = super.foreignKeyColumnName(propertyName, propertyEntityName, propertyTableName, referencedColumnName);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String joinKeyColumnName(String joinedColumn, String joinedTable) {
        logger.info("joinedColumn=" + joinedColumn);
        logger.info("joinedTable=" + joinedTable);
        String result = super.joinKeyColumnName(joinedColumn, joinedTable);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String logicalCollectionColumnName(String columnName, String propertyName, String referencedColumn) {
        logger.info("columnName=" + columnName);
        logger.info("propertyName=" + propertyName);
        logger.info("referencedColumn=" + referencedColumn);
        String result = super.logicalCollectionColumnName(columnName, propertyName, referencedColumn);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String logicalCollectionTableName(String tableName, String ownerEntityTable, String associatedEntityTable,
            String propertyName) {
        logger.info("tableName=" + tableName);
        logger.info("ownerEntityTable=" + ownerEntityTable);
        logger.info("associatedEntityTable=" + associatedEntityTable);
        logger.info("propertyName=" + propertyName);
        String result = super.logicalCollectionTableName(tableName, ownerEntityTable, associatedEntityTable, propertyName);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String logicalColumnName(String columnName, String propertyName) {
        logger.info("columnName=" + columnName);
        logger.info("propertyName=" + propertyName);
        String result = super.logicalColumnName(columnName, propertyName);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String propertyToColumnName(String propertyName) {
        logger.info("propertyName=" + propertyName);
        String result = super.propertyToColumnName(propertyName);
        logger.info("result=" + result);
        return result;
    }

    @Override
    public String tableName(String tableName) {
        logger.info("tableName=" + tableName);
        String result = super.tableName(tableName);
        logger.info("result=" + result);
        return result;
    }
}

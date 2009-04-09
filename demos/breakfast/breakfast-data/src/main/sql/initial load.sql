--
-- initial load script for Mod4J demo app Rosa's Breakfast Service (works for PostgreSQL)
-- script create 3 standard breakfasts
-- 

-- delete datat of 3 tables
-- DELETE FROM part_table;
-- DELETE FROM standardbreakfast_table;
-- DELETE FROM comestible_table;

-- standard breakfasts
INSERT INTO standardbreakfast_table ( id, version, name, price, style ) VALUES ( 100, 0, 'Continental', 4.95, 2 );
INSERT INTO standardbreakfast_table ( id, version, name, price, style ) VALUES ( 101, 0, 'English', 5.50, 3 );
INSERT INTO standardbreakfast_table ( id, version, name, price, style ) VALUES ( 102, 0, 'Ghanaian', 6.95, 1 );

-- comestibles
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 200, 0, 'Coffee', 1, 1.0, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 201, 0, 'Croissant', 1, 0.50, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 202, 0, 'Bread slice', 1, 0.20, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 203, 0, 'Orange juice', 1, 0.50, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 204, 0, 'Sausage', 1, 1.00, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 205, 0, 'Egg', 2, 1.00, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 206, 0, 'Toast', 1, 0.30, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 207, 0, 'Beans', 1, 1.50, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 208, 0, 'Tomato slice', 2, 0.10, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 209, 0, 'Jam', 1, 0.25, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 210, 0, 'Ham slice', 1, 0.15, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 211, 0, 'Cheese slice', 1, 0.25, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 212, 0, 'Butter', 1, 0.05, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 213, 0, 'Tea', 1, 0.25, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 214, 0, 'Goat omelet', 1, 1.75, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 215, 0, 'Sugar bread', 2, 1.25, null );
INSERT INTO comestible_table ( id, version, name, minimalquantity, price, transportform ) VALUES ( 216, 0, 'Tomato juice', 2, 1.00, null );

-- parts
-- Continental breakfast
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 300, 0, 1, 200, 100 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 301, 0, 1, 201, 100 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 302, 0, 2, 202, 100 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 305, 0, 1, 209, 100 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 306, 0, 1, 210, 100 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 307, 0, 1, 211, 100 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 308, 0, 1, 212, 100 );

-- English breakfast
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 310, 0, 1, 203, 101 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 311, 0, 4, 204, 101 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 312, 0, 1, 205, 101 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 313, 0, 1, 206, 101 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 314, 0, 1, 207, 101 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 315, 0, 2, 208, 101 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 316, 0, 1, 213, 101 );

-- Ghanaian breakfast
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 320, 0, 1, 213, 102 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 321, 0, 1, 214, 102 );
INSERT INTO part_table ( id, version, quantity, comestible_id, standard_id ) VALUES ( 322, 0, 1, 215, 102 );

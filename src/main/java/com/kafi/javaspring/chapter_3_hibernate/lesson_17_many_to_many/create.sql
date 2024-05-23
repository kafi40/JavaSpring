-- Create children table
CREATE TABLE my_db.children (
id SERIAL PRIMARY KEY,
name VARCHAR(15),
age INT
);

-- Create section table
CREATE TABLE my_db.section (
id SERIAL PRIMARY KEY,
name VARCHAR(15)
);

-- Create child_section table with foreign key constraints
CREATE TABLE my_db.child_section (
child_id INT NOT NULL,
section_id INT NOT NULL,
PRIMARY KEY (child_id, section_id),
FOREIGN KEY (child_id) REFERENCES my_db.children(id),
FOREIGN KEY (section_id) REFERENCES my_db.section(id)
);
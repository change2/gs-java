CREATE TABLE person (
  id          INTEGER NOT NULL PRIMARY KEY,
  name        VARCHAR(50),
  DESCRIPTION VARCHAR(100)
);

CREATE TABLE employee (
  employee_id   BIGINT(20) NOT NULL AUTO_INCREMENT,
  employee_name VARCHAR(40),
  PRIMARY KEY (employee_id)
)

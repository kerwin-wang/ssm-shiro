CREATE TABLE permissions (
  uid INT(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  name VARCHAR(50) NOT NULL DEFAULT '' COMMENT '用户名',
  url VARCHAR(255) DEFAULT '' COMMENT '密码',
  PRIMARY KEY (uid)
)ENGINE = InnoDB DEFAULT CHARSET = utf8;

EXPLAIN SELECT * FROM user WHERE id = 3;
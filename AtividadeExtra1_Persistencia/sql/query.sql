CREATE DATABASE  IF NOT EXISTS `vendas`;
use `vendas`;

DROP TABLE IF EXISTS `clientes`;

CREATE TABLE `clientes` (
  `IDCLIENTE` int(11) NOT NULL AUTO_INCREMENT,
  `NOME` varchar(45) DEFAULT NULL,
  `EMAIL` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDCLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `clientes` WRITE;
UNLOCK TABLES;

DROP TABLE IF EXISTS `pedidos`;

CREATE TABLE `pedidos` (
  `IDPEDIDO` int(11) NOT NULL AUTO_INCREMENT,
  `IDCLIENTE` int(11) NOT NULL,
  `DATA` datetime DEFAULT NULL,
  `DESCRICAO` varchar(45) DEFAULT NULL,
  `VALOR` double DEFAULT NULL,
  PRIMARY KEY (`IDPEDIDO`),
  KEY `FK_CLIENTES_PRODUTOS` (`IDCLIENTE`),
  CONSTRAINT `FK_CLIENTES_PRODUTOS` FOREIGN KEY (`IDCLIENTE`) REFERENCES `clientes` (`IDCLIENTE`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

LOCK TABLES `pedidos` WRITE;
UNLOCK TABLES;
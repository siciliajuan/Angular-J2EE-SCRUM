-- MySQL dump 10.13  Distrib 5.6.24, for osx10.8 (x86_64)
--
-- Host: 127.0.0.1    Database: cycle-it
-- ------------------------------------------------------
-- Server version	5.6.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Notification_has_comments`
--

DROP TABLE IF EXISTS `Notification_has_comments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Notification_has_comments` (
  `notification_id` int(11) NOT NULL,
  `comment_id` int(11) NOT NULL,
  UNIQUE KEY `comment_id` (`comment_id`),
  KEY `FK225E20ADCAAC91BD` (`notification_id`),
  KEY `FK225E20AD8537397` (`comment_id`),
  CONSTRAINT `FK225E20AD8537397` FOREIGN KEY (`comment_id`) REFERENCES `comment` (`id`),
  CONSTRAINT `FK225E20ADCAAC91BD` FOREIGN KEY (`notification_id`) REFERENCES `notification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Notification_has_comments`
--

LOCK TABLES `Notification_has_comments` WRITE;
/*!40000 ALTER TABLE `Notification_has_comments` DISABLE KEYS */;
INSERT INTO `Notification_has_comments` VALUES (1,1),(1,2),(2,3),(2,4),(2,5),(3,6);
/*!40000 ALTER TABLE `Notification_has_comments` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `author_has_notification`
--

DROP TABLE IF EXISTS `author_has_notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author_has_notification` (
  `author_id` int(11) DEFAULT NULL,
  `notification_id` int(11) NOT NULL,
  PRIMARY KEY (`notification_id`),
  KEY `FKD7F912A4CAAC91BD` (`notification_id`),
  KEY `FKD7F912A4A8C27048` (`author_id`),
  CONSTRAINT `FKD7F912A4A8C27048` FOREIGN KEY (`author_id`) REFERENCES `notification_author` (`id`),
  CONSTRAINT `FKD7F912A4CAAC91BD` FOREIGN KEY (`notification_id`) REFERENCES `notification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author_has_notification`
--

LOCK TABLES `author_has_notification` WRITE;
/*!40000 ALTER TABLE `author_has_notification` DISABLE KEYS */;
INSERT INTO `author_has_notification` VALUES (1,1),(2,3),(3,2),(4,4);
/*!40000 ALTER TABLE `author_has_notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comment`
--

DROP TABLE IF EXISTS `comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `comment` varchar(255) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `writer` int(11) DEFAULT NULL,
  `status_act` int(11) DEFAULT NULL,
  `status_ant` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comment`
--

LOCK TABLES `comment` WRITE;
/*!40000 ALTER TABLE `comment` DISABLE KEYS */;
INSERT INTO `comment` VALUES (1,'Por supuesto señor Ford, nos ponemos manos a la obra, nos pondrémos en contacto tan pronto como sea posible. Pase buen día, gracias.','2010-01-22 10:34:07',1,0,1),(2,'El equipo técnico nos avisa de que todo se ha podido resolver sin mas incidencias, por favor, revisad que todo este a su gusto, si tiene cualquier duda por favor digánosla, estaremos encantados de ayudarle. Un saludo.','2010-01-24 08:45:13',1,1,2),(3,'No se preocupe Francisco, nos ponemos inmediatamente, para cualquier cosa no duda en ponerse en contacto con nostros. Pase buen día, muchas gracias por confiar en nosotros.','2013-07-07 09:45:13',1,0,1),(4,'Creemos que ya esta preparado, por favor, confirmanos que esta como quereis','2013-07-09 19:32:21',1,1,2),(5,'Esta perfecto, gracias','2013-07-10 13:12:56',0,2,3),(6,'Nos ponemos manos a la obra, estará preparado lo mas rápido posible, si necesita cualquier cosa por favor pongase en contacto con nosotros, estaremos encantados de ayudarle. Muchas gracias.','2011-04-11 13:12:56',1,0,1);
/*!40000 ALTER TABLE `comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'TE GUSTA CONDUCIR SL'),(2,'VIAJE A LAS INDIAS SL'),(3,'MIS OSCARS SL'),(4,'STARTUP SL');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_contact`
--

DROP TABLE IF EXISTS `customer_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_contact` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_contact`
--

LOCK TABLES `customer_contact` WRITE;
/*!40000 ALTER TABLE `customer_contact` DISABLE KEYS */;
INSERT INTO `customer_contact` VALUES (1,'carl.benz@email.com','Benz','Carl','1234','+34 91 435 67 82'),(2,'cristobal.colon@email.com','Colon','Cristobal','4321','+34 91 396 27 71'),(3,'clint.eastwood@email.com','Eastwood','Clint','4123','+34 91 267 92 53'),(4,'steve.jobs@email.com','Jobs','Steve','1423','+34 91 723 41 83');
/*!40000 ALTER TABLE `customer_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_has_contact`
--

DROP TABLE IF EXISTS `customer_has_contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_has_contact` (
  `contact_id` int(11) DEFAULT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`customer_id`),
  KEY `FK1828249AA43EA539` (`contact_id`),
  KEY `FK1828249A631EB25D` (`customer_id`),
  CONSTRAINT `FK1828249A631EB25D` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`),
  CONSTRAINT `FK1828249AA43EA539` FOREIGN KEY (`contact_id`) REFERENCES `customer_contact` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_has_contact`
--

LOCK TABLES `customer_has_contact` WRITE;
/*!40000 ALTER TABLE `customer_has_contact` DISABLE KEYS */;
INSERT INTO `customer_has_contact` VALUES (1,1),(2,2),(3,3),(4,4);
/*!40000 ALTER TABLE `customer_has_contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification`
--

DROP TABLE IF EXISTS `notification`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `fecha` datetime DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification`
--

LOCK TABLES `notification` WRITE;
/*!40000 ALTER TABLE `notification` DISABLE KEYS */;
INSERT INTO `notification` VALUES (1,'En la empresa hemos actualizado el catalogo gracias a nuestras nuevas patentes. Queremos mostrar la gama completa de compresores y turbos. Nos gusta mucho el trabajo que estais realizando, nos gustaría que nos pasaseis unos bocetos lo mas pronto posible. ','2010-01-22 10:34:07',1,2,'Nueva gama de productos'),(2,'Desde que los Reyes Católicos nos han quitado la financiación todo esta yendo un poco cuesta arriba, nuestras espectativas de traer oro nos enormes y hay mucha gente interesada, pero no tenemos un sistema de comunicación rápida para todas aquellas persona','2013-07-07 10:34:07',2,3,'Crowdfunding page'),(3,'Benz se ha puesto otra vez creativo y nos ha sorprendido con un nuevo sistema de diferencial 4x4. El nuevo invento ha dado un vuelco a los tradicionales sistemas de tracción y esta ganando concursos en todo el planeta, hemos preparado un articulo que nos ','2011-04-11 10:34:07',0,1,'Nuevo diferencial ¡Este hombre no para!'),(4,'Queremos meter una red social donde los emprendedores se puedan poner de acuerdo para ir juntos a Silicon Valley y así para compartir gastos. Por favor recordar que este es el core de nuestra empresa, es muy importante que este resuelto cuanto antes. Much','2015-03-12 10:34:07',3,0,'Ir a Silicon Valley');
/*!40000 ALTER TABLE `notification` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `notification_author`
--

DROP TABLE IF EXISTS `notification_author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `notification_author` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `notification_author`
--

LOCK TABLES `notification_author` WRITE;
/*!40000 ALTER TABLE `notification_author` DISABLE KEYS */;
INSERT INTO `notification_author` VALUES (1,'henry.ford@email.com','Henry Fornd','+34 91 435 67 82'),(2,'charles.rolls@email.com','Charles Rolls','+34 91 435 67 82'),(3,'pepe@email.com','Francisco Pizarro','+34 91 396 27 71'),(4,'steve.jobs@email.com','Steve','+34 91 723 41 83');
/*!40000 ALTER TABLE `notification_author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project`
--

DROP TABLE IF EXISTS `project`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project`
--

LOCK TABLES `project` WRITE;
/*!40000 ALTER TABLE `project` DISABLE KEYS */;
INSERT INTO `project` VALUES (1,'Ecommerce el automovilismo del futuro'),(2,'APP de navegación GPS'),(3,'Web para estrella de hollywood'),(4,'App para emprendedores');
/*!40000 ALTER TABLE `project` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_has_customer`
--

DROP TABLE IF EXISTS `project_has_customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project_has_customer` (
  `customer_id` int(11) DEFAULT NULL,
  `project_id` int(11) NOT NULL,
  PRIMARY KEY (`project_id`),
  KEY `FK99211B49123A8157` (`project_id`),
  KEY `FK99211B49631EB25D` (`customer_id`),
  CONSTRAINT `FK99211B49123A8157` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`),
  CONSTRAINT `FK99211B49631EB25D` FOREIGN KEY (`customer_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_has_customer`
--

LOCK TABLES `project_has_customer` WRITE;
/*!40000 ALTER TABLE `project_has_customer` DISABLE KEYS */;
INSERT INTO `project_has_customer` VALUES (1,1),(2,2),(3,3),(4,4);
/*!40000 ALTER TABLE `project_has_customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `project_has_notifications`
--

DROP TABLE IF EXISTS `project_has_notifications`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `project_has_notifications` (
  `project_id` int(11) NOT NULL,
  `notification_id` int(11) NOT NULL,
  UNIQUE KEY `notification_id` (`notification_id`),
  KEY `FK53F6645D123A8157` (`project_id`),
  KEY `FK53F6645DCAAC91BD` (`notification_id`),
  CONSTRAINT `FK53F6645D123A8157` FOREIGN KEY (`project_id`) REFERENCES `project` (`id`),
  CONSTRAINT `FK53F6645DCAAC91BD` FOREIGN KEY (`notification_id`) REFERENCES `notification` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `project_has_notifications`
--

LOCK TABLES `project_has_notifications` WRITE;
/*!40000 ALTER TABLE `project_has_notifications` DISABLE KEYS */;
INSERT INTO `project_has_notifications` VALUES (1,1),(1,3),(2,2),(4,4);
/*!40000 ALTER TABLE `project_has_notifications` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-11-22 23:18:09

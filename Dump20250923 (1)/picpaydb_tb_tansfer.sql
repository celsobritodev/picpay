-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: localhost    Database: picpaydb
-- ------------------------------------------------------
-- Server version	8.3.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tb_tansfer`
--

DROP TABLE IF EXISTS `tb_tansfer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tb_tansfer` (
  `id` binary(16) NOT NULL,
  `value` decimal(38,2) DEFAULT NULL,
  `wallet_receiver_id` bigint DEFAULT NULL,
  `wallet_sender_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2v7kkcfes3aomrv8hevqgx6m6` (`wallet_receiver_id`),
  KEY `FKboynvsfepoeq8ymsyykr9syx5` (`wallet_sender_id`),
  CONSTRAINT `FK2v7kkcfes3aomrv8hevqgx6m6` FOREIGN KEY (`wallet_receiver_id`) REFERENCES `tb_wallet` (`id`),
  CONSTRAINT `FKboynvsfepoeq8ymsyykr9syx5` FOREIGN KEY (`wallet_sender_id`) REFERENCES `tb_wallet` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tb_tansfer`
--

LOCK TABLES `tb_tansfer` WRITE;
/*!40000 ALTER TABLE `tb_tansfer` DISABLE KEYS */;
INSERT INTO `tb_tansfer` VALUES (_binary '\r5����Dy��\�\�8�N',0.00,2,1),(_binary '\"�\�\�\n3B\�\�%\�T�j',20.00,3,1),(_binary '/���\�JA�\�0�x\�\��',5.00,2,1),(_binary '7�a\�\�@H�1]���\�',5.00,2,1),(_binary 'N�T1\�G���\�hM)',0.00,2,1),(_binary 'Sm9cXKu��\�f�Y�`',5.00,2,1),(_binary 'W4�:\�H���\n\�',5.00,2,1),(_binary 'Z�C��I��\�\�KU�\0',0.00,2,1),(_binary 'g\�t \�Dd�D}��Y\�I',0.00,2,1),(_binary '�sH�&K��;b\�oI',0.00,2,1),(_binary '�TM-FMˢ\��\\��\�',5.00,2,1),(_binary '�(<�M\�C��y�s��',5.00,2,1),(_binary '�\n�h�I\�\Z�T�\�',20.00,3,1);
/*!40000 ALTER TABLE `tb_tansfer` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-09-24  9:25:25

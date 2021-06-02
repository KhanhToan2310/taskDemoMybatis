-- MySQL dump 10.13  Distrib 8.0.23, for Win64 (x86_64)
--
-- Host: localhost    Database: alarm
-- ------------------------------------------------------
-- Server version	8.0.23

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
-- Table structure for table `alarm`
--

DROP TABLE IF EXISTS `alarm`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alarm` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rencent_alarms_include` int DEFAULT NULL,
  `intital_notification_evacuation` varchar(45) DEFAULT NULL,
  `ending_notification_evacuation` varchar(45) DEFAULT NULL,
  `default_evacuation_length` varchar(45) DEFAULT NULL,
  `man_down_notification` varchar(45) DEFAULT NULL,
  `dissappears_after_mandown` int DEFAULT NULL,
  `man_down_movement_trigger` bit(1) DEFAULT NULL,
  `Trigger_movement_man_down` int DEFAULT NULL,
  `accelerometer_vector_man_down` int DEFAULT NULL,
  `X_axis_exceeds` int DEFAULT NULL,
  `Y_axis_exceeds` int DEFAULT NULL,
  `Z_axis_exceeds` int DEFAULT NULL,
  `panic_notification` varchar(45) DEFAULT NULL,
  `dissappears_after_panic` int DEFAULT NULL,
  `dalily_notification` varchar(45) DEFAULT NULL,
  `alarm_response_panel` bit(1) DEFAULT NULL,
  `zone_breach_time` int DEFAULT NULL,
  `dissappears_after_zone_breach` int DEFAULT NULL,
  `remove_from_alarm` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-06-02 12:24:47

-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 15, 2017 at 02:30 PM
-- Server version: 10.1.26-MariaDB
-- PHP Version: 7.1.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ppl`
--
CREATE DATABASE IF NOT EXISTS `ppl` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ppl`;

-- --------------------------------------------------------

--
-- Table structure for table `analisa`
--

DROP TABLE IF EXISTS `analisa`;
CREATE TABLE `analisa` (
  `strukturTanah` enum('subur','kurang subur','','') NOT NULL,
  `luasTanah` int(6) NOT NULL,
  `jenisTanah` varchar(25) NOT NULL,
  `jumlahPohon` int(5) NOT NULL,
  `kadarAir` varchar(25) NOT NULL,
  `jumlahPH` int(2) NOT NULL,
  `hasil` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `analisa`
--

INSERT INTO `analisa` (`strukturTanah`, `luasTanah`, `jenisTanah`, `jumlahPohon`, `kadarAir`, `jumlahPH`, `hasil`) VALUES
('subur', 500, 'dataran tinggi', 1000, 'tinggi', 6, 'Menggunakan pupuk yang memiliki kadar kapur yang tinggi, Agar pH tanah meningkat dan membuat sistem aliran air agar kadar air menurun.'),
('subur', 500, 'dataran rendah', 500, 'rendah', 5, 'asfgjagsfkjasgfjkasgf'),
('kurang subur', 1000, 'dataran tinggi', 500, 'tinggi', 7, 'jgsjvsgavjcbv');

-- --------------------------------------------------------

--
-- Table structure for table `penjadwalan`
--

DROP TABLE IF EXISTS `penjadwalan`;
CREATE TABLE `penjadwalan` (
  `bibit` varchar(50) NOT NULL,
  `timer1` int(3) NOT NULL,
  `timer2` int(3) NOT NULL,
  `timer3` int(3) NOT NULL,
  `timer4` int(3) NOT NULL,
  `timer5` int(3) NOT NULL,
  `tindakan1` varchar(100) NOT NULL,
  `tindakan2` varchar(100) NOT NULL,
  `tindakan3` varchar(100) NOT NULL,
  `tindakan4` varchar(100) NOT NULL,
  `tindakan5` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjadwalan`
--

INSERT INTO `penjadwalan` (`bibit`, `timer1`, `timer2`, `timer3`, `timer4`, `timer5`, `tindakan1`, `tindakan2`, `tindakan3`, `tindakan4`, `tindakan5`) VALUES
('jeruk', 3, 2, 3, 2, 3, 'pengairan', 'pemupukan', 'perwatan pohon', 'perwatan buah', 'panen'),
('kopi', 1, 1, 1, 1, 1, 'adsad', 'asdasdasd', 'dsadsadad', 'dasdasdsd', 'dadadsdadad');

-- --------------------------------------------------------

--
-- Table structure for table `penyakit`
--

DROP TABLE IF EXISTS `penyakit`;
CREATE TABLE `penyakit` (
  `jenisPohon` varchar(50) NOT NULL,
  `kondisiPohon` varchar(50) NOT NULL,
  `kondisiDaun` varchar(50) NOT NULL,
  `kondisiBuah` varchar(50) NOT NULL,
  `hasil` varchar(1000) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penyakit`
--

INSERT INTO `penyakit` (`jenisPohon`, `kondisiPohon`, `kondisiDaun`, `kondisiBuah`, `hasil`) VALUES
('mangga', 'getas', 'kuning', 'busuk', 'dasavcvzxvzv'),
('jeruk', 'kering', 'kuning', 'busuk', 'pohon anda akan mati wkwk');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

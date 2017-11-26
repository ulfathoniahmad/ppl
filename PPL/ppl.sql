-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 25 Nov 2017 pada 17.26
-- Versi Server: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
-- Struktur dari tabel `npk`
--

DROP TABLE IF EXISTS `npk`;
CREATE TABLE `npk` (
  `no` int(3) NOT NULL,
  `namabuah` varchar(100) NOT NULL,
  `umur` varchar(100) NOT NULL,
  `hasil` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `npk`
--

INSERT INTO `npk` (`no`, `namabuah`, `umur`, `hasil`) VALUES
(1, 'JERUK', '0-1', 'NITROGEN : 10 s/d 20 gram\r\nFOSFOR   : 5 s/d 10 gram\r\nKALIUM   : 5 gram\r\n\r\nINTERVAL APLIKASI : 2 – 3  kali/tahun'),
(2, 'JERUK', '1-2', 'NITROGEN : 25 s/d  40 gram\r\nFOSFOR   : 15 s/d 20 gram\r\nKALIUM   : 10 s/d 15 gram\r\n\r\nINTERVAL APLIKASI : 3 – 4 kali/tahun'),
(3, 'JERUK', '2-3', 'NITROGEN : 40 s/d 75 gram\r\nFOSFOR   : 25 s/d 40 gram\r\nKALIUM   : 20 s/d 30 gram\r\n\r\nINTERVAL APLIKASI : 3 – 4 kali/tahun'),
(4, 'JERUK', '3-4', 'NITROGEN : 80 s/d  120 gram\r\nFOSFOR   : 50 s/d 75 gram\r\nKALIUM   : 40 s/d 50 gram\r\n\r\nINTERVAL APLIKASI : 2 – 3 kali/tahun'),
(5, 'JERUK', '>5', 'NITROGEN : 125 s/d 150 gram\r\nFOSFOR   : 80 s/d 100 gram\r\nKALIUM   : 60 s/d 80 gram\r\n\r\nINTERVAL APLIKASI : 2 kali/tahun'),
(6, 'APEL', '0-1', 'NITROGEN : 7.5 s/d 15 gram\r\nFOSFOR   : 8 s/d 16 gram\r\nKALIUM   : 7.5 s/d 15 gram\r\n\r\nINTERVAL APLIKASI : 6 kali/tahun'),
(7, 'APEL', '1-2', 'NITROGEN : 15 s/d 30 gram\r\nFOSFOR   : 16 s/d 32 gram\r\nKALIUM   : 15 s/d 30 gram\r\n\r\nINTERVAL APLIKASI : 4 kali/tahun'),
(8, 'APEL', '2-3', 'NITROGEN : 30 s/d 45 gram\r\nFOSFOR   : 32 s/d 48 gram\r\nKALIUM   : 30 s/d 45 gram\r\n\r\nINTERVAL APLIKASI : 4 kali/tahun'),
(9, 'APEL', '3-4', 'NITROGEN : 46 s/d 60 gram\r\nFOSFOR   : 48 s/d 64 gram\r\nKALIUM   : 46 s/d 60 gram\r\n\r\nINTERVAL APLIKASI : 4 kali/tahun'),
(10, 'APEL', '>5', 'NITROGEN : 75 gram\r\nFOSFOR   : 80 gram\r\nKALIUM   : 75 gram\r\n\r\nINTERVAL APLIKASI : 4 kali/tahun'),
(11, 'DURIAN', '0-1', 'NITROGEN : 6 s/d 12 gram\r\nFOSFOR   : 6 s/d 12 gram\r\nKALIUM   : 6 s/d 12 gram\r\n\r\nINTERVAL APLIKASI : 2 kali/tahun'),
(12, 'DURIAN', '1-2', 'NITROGEN : 12 s/d 22.5 gram\r\nFOSFOR   : 12 s/d 22.5 gram\r\nKALIUM   : 12 s/d 22.5 gram\r\n\r\nINTERVAL APLIKASI : 2 kali/tahun'),
(13, 'DURIAN', '2-3', 'NITROGEN : 22.5 s/d 45 gram\r\nFOSFOR   : 22.5 s/d 45 gram\r\nKALIUM   : 22.5 s/d 45 gram\r\n\r\nINTERVAL APLIKASI : 2 kali/tahun'),
(14, 'DURIAN', '3-4', 'NITROGEN : 45 s/d 90 gram\r\nFOSFOR   : 45 s/d 90 gram\r\nKALIUM   : 45 s/d 90 gram\r\n\r\nINTERVAL APLIKASI : 2 kali/tahun'),
(15, 'DURIAN', '>5', 'NITROGEN : 90 gram\r\nFOSFOR   : 90 gram\r\nKALIUM   : 90 gram\r\n\r\nINTERVAL APLIKASI : 2 kali/tahun');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penjadwalan`
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
-- Dumping data untuk tabel `penjadwalan`
--

INSERT INTO `penjadwalan` (`bibit`, `timer1`, `timer2`, `timer3`, `timer4`, `timer5`, `tindakan1`, `tindakan2`, `tindakan3`, `tindakan4`, `tindakan5`) VALUES
('jeruk', 3, 2, 3, 2, 3, 'pengairan', 'pemupukan', 'perwatan pohon', 'perwatan buah', 'panen'),
('kopi', 1, 1, 1, 1, 1, 'adsad', 'asdasdasd', 'dsadsadad', 'dasdasdsd', 'dadadsdadad');

-- --------------------------------------------------------

--
-- Struktur dari tabel `penyakit`
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
-- Dumping data untuk tabel `penyakit`
--

INSERT INTO `penyakit` (`jenisPohon`, `kondisiPohon`, `kondisiDaun`, `kondisiBuah`, `hasil`) VALUES
('mangga', 'getas', 'kuning', 'busuk', 'dasavcvzxvzv'),
('jeruk', 'kering', 'kuning', 'busuk', 'pohon anda akan mati wkwk');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `npk`
--
ALTER TABLE `npk`
  ADD PRIMARY KEY (`no`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `npk`
--
ALTER TABLE `npk`
  MODIFY `no` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

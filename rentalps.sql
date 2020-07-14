-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 13, 2020 at 11:35 AM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.2.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rentalps`
--

-- --------------------------------------------------------

--
-- Table structure for table `barang`
--

CREATE TABLE `barang` (
  `id_barang` varchar(30) NOT NULL,
  `nama_barang` varchar(30) NOT NULL,
  `harga_sewa` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `barang`
--

INSERT INTO `barang` (`id_barang`, `nama_barang`, `harga_sewa`) VALUES
('A4321', 'PS3', '6000'),
('A4567', 'PS2', '3000'),
('A7894', 'PS5', '12000'),
('A1234', 'PS4', '8000'),
('B4567', 'PS5', '12000'),
('C1234', 'PS4', '8000');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id_petugas` int(11) NOT NULL,
  `nama_petugas` varchar(50) NOT NULL,
  `password` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id_petugas`, `nama_petugas`, `password`) VALUES
(1, 'admin', 123123);

-- --------------------------------------------------------

--
-- Table structure for table `pembayaran`
--

CREATE TABLE `pembayaran` (
  `id_penyewa` varchar(12) NOT NULL,
  `tgl_pengembalian` date NOT NULL,
  `lama_sewa` varchar(11) NOT NULL,
  `biayaperjam` int(12) NOT NULL,
  `regane` varchar(50) NOT NULL,
  `total_bayar` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pembayaran`
--

INSERT INTO `pembayaran` (`id_penyewa`, `tgl_pengembalian`, `lama_sewa`, `biayaperjam`, `regane`, `total_bayar`) VALUES
('P005', '2020-08-29', '7 JAM', 3000, '10000', 31000),
('P006', '2020-06-28', '2 JAM', 12000, '4000', 28000),
('P007', '2020-05-24', '7 JAM', 12000, '5000', 89000),
('P008', '2020-06-29', '5 JAM', 8000, '10000', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `penyewa`
--

CREATE TABLE `penyewa` (
  `id_penyewa` varchar(12) NOT NULL,
  `nama_penyewa` varchar(30) NOT NULL,
  `alamat` varchar(40) NOT NULL,
  `no_telpon` varchar(12) NOT NULL,
  `tgl_sewa` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `penyewa`
--

INSERT INTO `penyewa` (`id_penyewa`, `nama_penyewa`, `alamat`, `no_telpon`, `tgl_sewa`) VALUES
('P001', 'THOR ', 'ASGARD ', '089012345678', '2020-07-29'),
('P004', 'SUHERP', 'KUVUKILAND', '0897654321', '2020-07-28'),
('P006', 'PARDI', 'WONOGIRI', '089765432112', '2020-06-29'),
('P007', 'PARMIN', 'SUKOHARJO', '08976543210', '2020-05-24'),
('P008', 'RONALDO', 'SOLO', '082212345678', '2020-06-29');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `penyewa`
--
ALTER TABLE `penyewa`
  ADD PRIMARY KEY (`id_penyewa`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

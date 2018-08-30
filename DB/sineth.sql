-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 16, 2018 at 03:47 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sineth`
--

-- --------------------------------------------------------

--
-- Table structure for table `adminlogin`
--

CREATE TABLE `adminlogin` (
  `admin_nic` int(11) NOT NULL,
  `admin_name` varchar(11) NOT NULL,
  `admin_password` varchar(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `adminlogin`
--

INSERT INTO `adminlogin` (`admin_nic`, `admin_name`, `admin_password`) VALUES
(1024, 'sineth', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `client`
--

CREATE TABLE `client` (
  `id` int(4) NOT NULL,
  `email` varchar(50) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `nic` int(10) NOT NULL,
  `password` varchar(8) NOT NULL,
  `cardno` int(14) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `client`
--

INSERT INTO `client` (`id`, `email`, `firstname`, `lastname`, `nic`, `password`, `cardno`) VALUES
(1, 'abc@gmail.com', 'Ishara', 'Warnakulasooriya', 1111111, '12345', 0),
(1, 'vcx', 'Ishara', 'hgfds', 65432, '1234', 654327),
(2, 'jhgfds', 'gggg', 'etth', 6543, '1234', 1111),
(3, 'jhgfde', 'dgb', 'dfd', 66666, '1234', 1234567),
(4, 'shashin@gmail.com', 'sss', 'aaaa', 4444, '0000', 123456),
(5, 'rrrrrrrr', 'dscds', 'fdvdfv', 32332, '11111', 23232323),
(6, 'gfxgf', 'jvjhvkm', 'hgcvjj', 1234567, '77777', 98765),
(1000, 'tharini@gmail.com', 'tharini', 'mallawa', 960350189, '12345678', 0);

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `dress_id` varchar(8) NOT NULL,
  `dress_type` varchar(20) NOT NULL,
  `dress_name` varchar(20) NOT NULL,
  `stock_qty` int(4) NOT NULL,
  `available_qty` int(4) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`dress_id`, `dress_type`, `dress_name`, `stock_qty`, `available_qty`) VALUES
('shirt001', 'shirtblabla', '', 200, 96);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client`
--
ALTER TABLE `client`
  ADD KEY `ID` (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `client`
--
ALTER TABLE `client`
  MODIFY `id` int(4) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1001;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

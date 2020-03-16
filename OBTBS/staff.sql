-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 25, 2019 at 07:31 AM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `obtbs`
--

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `sId` int(5) NOT NULL,
  `sUsername` varchar(10) NOT NULL,
  `sPassword` varchar(10) NOT NULL,
  `sFname` varchar(25) NOT NULL,
  `sLname` varchar(25) NOT NULL,
  `sPhone` varchar(12) NOT NULL,
  `sQualification` varchar(50) NOT NULL,
  `sAge` varchar(10) NOT NULL,
  `sEmail` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`sId`, `sUsername`, `sPassword`, `sFname`, `sLname`, `sPhone`, `sQualification`, `sAge`, `sEmail`) VALUES
(1, 'faiq', 'close1998', 'faiq', 'hakimi', '0199616442', 'degree', '21', 'fh.faiq@gmail.com'),
(2, 'kamarulah', '1234', 'kamarulah', 'aimanah', '0139138342', 'spmah', '19', 'kamarul@gmail.com');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`sId`),
  ADD UNIQUE KEY `sUsername` (`sUsername`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `sId` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

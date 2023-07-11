-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 21, 2022 at 03:15 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hgor`
--

-- --------------------------------------------------------

--
-- Table structure for table `basketballfield`
--

CREATE TABLE `basketballfield` (
  `FieldID` char(5) NOT NULL,
  `Grade` char(1) NOT NULL,
  `Status` varchar(255) NOT NULL,
  `RingHeight` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `basketballfield`
--

INSERT INTO `basketballfield` (`FieldID`, `Grade`, `Status`, `RingHeight`) VALUES
('BB001', 'A', 'Indoor', 3),
('BB002', 'B', 'Outdoor', 2.5),
('BB003', 'B', 'Outdoor', 3),
('BB004', 'C', 'Outdoor', 3),
('BB005', 'A', 'Indoor', 2.5),
('BB006', 'C', 'Indoor', 2);

-- --------------------------------------------------------

--
-- Table structure for table `futsalfield`
--

CREATE TABLE `futsalfield` (
  `FieldID` char(5) NOT NULL,
  `Grade` char(1) NOT NULL,
  `Status` varchar(255) NOT NULL,
  `Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `futsalfield`
--

INSERT INTO `futsalfield` (`FieldID`, `Grade`, `Status`, `Type`) VALUES
('FT001', 'A', 'Outdoor', 'Grass'),
('FT002', 'A', 'Indoor', 'Floor'),
('FT003', 'C', 'Outdoor', 'Grass'),
('FT004', 'B', 'Outdoor', 'Floor'),
('FT005', 'B', 'Indoor', 'Floor'),
('FT006', 'C', 'Outdoor', 'Floor');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

CREATE TABLE `transaction` (
  `TransactionID` char(5) NOT NULL,
  `PlayTime` int(11) NOT NULL,
  `FieldID` char(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `basketballfield`
--
ALTER TABLE `basketballfield`
  ADD PRIMARY KEY (`FieldID`);

--
-- Indexes for table `futsalfield`
--
ALTER TABLE `futsalfield`
  ADD PRIMARY KEY (`FieldID`);

--
-- Indexes for table `transaction`
--
ALTER TABLE `transaction`
  ADD PRIMARY KEY (`TransactionID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

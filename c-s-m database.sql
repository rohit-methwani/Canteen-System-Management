-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 23, 2018 at 10:50 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `canteen`
--

-- --------------------------------------------------------

--
-- Table structure for table `canteendb`
--

CREATE TABLE `canteendb` (
  `foodname` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `foodcategory` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `canteendb`
--

INSERT INTO `canteendb` (`foodname`, `price`, `foodcategory`) VALUES
('Cheese Sandwich ', 30, 'Fast Food'),
('Chinese Samosa', 12, 'Fast Food'),
('Chocobar', 10, 'Dessert'),
('Chocolate Icecream', 25, 'Dessert'),
('Chole Bhature', 50, 'Meal'),
('Chole Pulav', 45, 'Meals'),
('Coffee', 12, 'Beverages'),
('Cold Coffee', 15, 'Beverages'),
('Cold Drink', 18, 'Beverages'),
('Dal Rice', 40, 'Meal'),
('Donut', 25, 'Dessert'),
('Dosa', 40, 'Fast Food'),
('Fries', 40, 'Fastfood'),
('Gulab Jamun', 30, 'Dessert'),
('Haka Noodles', 45, 'Meal'),
('Idli', 25, 'Fast Food'),
('Juice', 20, 'Beverages'),
('Kiwi Fruit', 30, 'Desert'),
('Malai Kofta', 40, 'Meal'),
('Manchurian Soup', 45, 'Meal'),
('Masala Dosa', 25, 'Fast Food'),
('Mendu Wada', 25, 'Fast Food'),
('New Food', 90, 'New Category'),
('Orange Icecream', 10, 'Dessert'),
('Panner Bhaji', 50, 'Meal'),
('Panner Tikka', 55, 'Meal'),
('Papad', 5, 'Meal'),
('Pav Bhaji', 35, 'Meal'),
('Rabdi', 20, 'Dessert'),
('Roti', 3, 'Meal'),
('Samosa', 10, 'Fast Food'),
('Sandwich', 25, 'Fast Food'),
('Schezwan Noodles', 50, 'Meal'),
('Tea', 12, 'Beverages'),
('Tetrapack', 10, 'Beverages'),
('Vada Pav', 12, 'Fast Food'),
('Vanilla', 30, 'Desert'),
('Vanilla Icecream', 10, 'Dessert');

-- --------------------------------------------------------

--
-- Table structure for table `ordereditems`
--

CREATE TABLE `ordereditems` (
  `email` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL,
  `date` date NOT NULL,
  `totalprice` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `userid` int(11) NOT NULL,
  `email` text NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `canteendb`
--
ALTER TABLE `canteendb`
  ADD PRIMARY KEY (`foodname`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`userid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=62;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

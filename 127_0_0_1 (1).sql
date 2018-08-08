-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 08-Ago-2018 às 22:59
-- Versão do servidor: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `stdatabase`
--
CREATE DATABASE IF NOT EXISTS `stdatabase` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `stdatabase`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `administrador`
--

CREATE TABLE `administrador` (
  `id` int(11) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL,
  `bancoId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `cliente`
--

CREATE TABLE `cliente` (
  `bancoId` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `cliente`
--

INSERT INTO `cliente` (`bancoId`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `pacote`
--

CREATE TABLE `pacote` (
  `cpfTitular` varchar(255) DEFAULT NULL,
  `destinoPassar` varchar(255) DEFAULT NULL,
  `idPassar` varchar(255) DEFAULT NULL,
  `parcelas` int(11) NOT NULL,
  `qtdClientes` int(11) NOT NULL,
  `taxaDesconto` double NOT NULL,
  `valorParcelado` double NOT NULL,
  `valorTotal` double DEFAULT NULL,
  `bancoID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `bancoId` int(11) NOT NULL,
  `cpfDoPagante` varchar(255) DEFAULT NULL,
  `dataDoRecebimento` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `valorRecebido` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `bancoId` int(11) NOT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `data` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `idade` int(11) NOT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `telefone` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`bancoId`, `cpf`, `data`, `email`, `idade`, `nome`, `telefone`) VALUES
(1, '11487004478', '20/01/1997', '@bilio', 21, 'Abílio ', '(81)9965-29257');

-- --------------------------------------------------------

--
-- Estrutura da tabela `viagem`
--

CREATE TABLE `viagem` (
  `bancoId` int(11) NOT NULL,
  `ativo` int(11) NOT NULL,
  `chegada` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `despesa` double DEFAULT NULL,
  `destino` varchar(255) DEFAULT NULL,
  `id` varchar(255) DEFAULT NULL,
  `origem` varchar(255) DEFAULT NULL,
  `partida` varchar(255) DEFAULT NULL,
  `pessoas` int(11) NOT NULL,
  `qtVagas` int(11) NOT NULL,
  `vagas` varchar(255) DEFAULT NULL,
  `valor` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `viagem`
--

INSERT INTO `viagem` (`bancoId`, `ativo`, `chegada`, `descricao`, `despesa`, `destino`, `id`, `origem`, `partida`, `pessoas`, `qtVagas`, `vagas`, `valor`) VALUES
(1, 1, '15/08/2018', 'Gostaria', NULL, 'Disney', '5021', 'Moreno', '08/08/2018', 0, 25, NULL, 2550);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `administrador`
--
ALTER TABLE `administrador`
  ADD PRIMARY KEY (`bancoId`);

--
-- Indexes for table `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`bancoId`);

--
-- Indexes for table `pacote`
--
ALTER TABLE `pacote`
  ADD PRIMARY KEY (`bancoID`);

--
-- Indexes for table `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`bancoId`);

--
-- Indexes for table `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`bancoId`);

--
-- Indexes for table `viagem`
--
ALTER TABLE `viagem`
  ADD PRIMARY KEY (`bancoId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pagamento`
--
ALTER TABLE `pagamento`
  MODIFY `bancoId` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `bancoId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `viagem`
--
ALTER TABLE `viagem`
  MODIFY `bancoId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `administrador`
--
ALTER TABLE `administrador`
  ADD CONSTRAINT `FK_n3gfva7npcic32tvgr43m4vvm` FOREIGN KEY (`bancoId`) REFERENCES `pessoa` (`bancoId`);

--
-- Limitadores para a tabela `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `FK_46i50blf9mgmoi37yt8opd3kx` FOREIGN KEY (`bancoId`) REFERENCES `pessoa` (`bancoId`);

--
-- Limitadores para a tabela `pacote`
--
ALTER TABLE `pacote`
  ADD CONSTRAINT `FK_1ojgnnskk2c5rd6igddpckuvm` FOREIGN KEY (`bancoID`) REFERENCES `viagem` (`bancoId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

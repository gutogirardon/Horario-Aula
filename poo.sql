-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 06-Dez-2017 às 21:25
-- Versão do servidor: 10.1.28-MariaDB
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
-- Database: `poo`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE `curso` (
  `CursoID` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Periodo` varchar(50) NOT NULL,
  `Duracao` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `curso`
--

INSERT INTO `curso` (`CursoID`, `Nome`, `Periodo`, `Duracao`) VALUES
(1, 'Engenharia Civil', 'Integral', '9 Semestres'),
(2, 'Engenharia de Software', 'Noite', '8 Semestres'),
(3, 'Engenharia Eletrica', 'Integral', '9 Semestres');

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `DisciplinaID` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `NomeCurso` varchar(50) NOT NULL,
  `Semestre` varchar(50) NOT NULL,
  `Turma` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `disciplina`
--

INSERT INTO `disciplina` (`DisciplinaID`, `Nome`, `NomeCurso`, `Semestre`, `Turma`) VALUES
(0, '', '', '', ''),
(10, 'Probabilidade e Estatística', 'Engenharia Civil', '2', '10'),
(11, 'Probabilidade e Estatística', 'Engenharia de Software', '2', '15'),
(12, 'Programação Orientada a Objetos', 'Engenharia de Software', '2', '30'),
(13, 'Rp 4', 'Engenharia de Software', '4', '10');

-- --------------------------------------------------------

--
-- Estrutura da tabela `horario`
--

CREATE TABLE `horario` (
  `HorarioID` int(11) NOT NULL,
  `NomeProfessor` varchar(50) NOT NULL,
  `NomeDisciplina` varchar(50) NOT NULL,
  `DiaSemana` varchar(50) NOT NULL,
  `Aula` varchar(50) NOT NULL,
  `Periodo` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `horario`
--

INSERT INTO `horario` (`HorarioID`, `NomeProfessor`, `NomeDisciplina`, `DiaSemana`, `Aula`, `Periodo`) VALUES
(1, 'Aline', 'Programação Orientada a Objetos', 'Segunda ', '2º Aula', 'Tarde'),
(2, 'João Pablo', 'Rebocar Parede', 'Quarta ', '1º Aula', 'Tarde'),
(3, 'Aline', 'Programação Orientada a Objetos', 'Segunda ', '4º Aula', 'Tarde'),
(4, 'Alice', 'Probabilidade e Estatística', 'Quinta', '2º Aula', 'Manhã');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `ProfessorID` int(11) NOT NULL,
  `Nome` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Telefone` varchar(50) NOT NULL,
  `DataNascimento` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `professor`
--

INSERT INTO `professor` (`ProfessorID`, `Nome`, `Email`, `Telefone`, `DataNascimento`) VALUES
(1, 'Aline', 'aline@unipampa.edu.br', '(55)5555-5555', '1980-10-10'),
(2, 'João Pablo', 'jp@unipampa.edu.br', '(55)5555-5554', '1980-10-10'),
(3, 'Alice', 'alice@unipampa.edu.br', '(11)1111-1111', '1980-11-11');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`CursoID`);

--
-- Indexes for table `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`DisciplinaID`);

--
-- Indexes for table `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`HorarioID`);

--
-- Indexes for table `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`ProfessorID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `curso`
--
ALTER TABLE `curso`
  MODIFY `CursoID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `disciplina`
--
ALTER TABLE `disciplina`
  MODIFY `DisciplinaID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `horario`
--
ALTER TABLE `horario`
  MODIFY `HorarioID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `professor`
--
ALTER TABLE `professor`
  MODIFY `ProfessorID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

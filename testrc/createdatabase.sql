create database kid;

grant all on kid.* to lucy@localhost identified by '142857';

ALTER DATABASE `kid` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
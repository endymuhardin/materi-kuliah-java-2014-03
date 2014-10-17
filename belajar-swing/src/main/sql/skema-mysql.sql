create table kontak (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nama VARCHAR(255) NOT NULL,
    tanggal_lahir DATE,
    aktif BOOLEAN
) Engine=InnoDB ;

insert into kontak (nama, tanggal_lahir, aktif) VALUES 
('Endy Muhardin', '1945-08-17', true),
('Jimmy Rengga', '1928-09-28', true);
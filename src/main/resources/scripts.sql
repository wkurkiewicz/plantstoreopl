create table plant (
                       id BIGINT PRIMARY KEY AUTO_INCREMENT,
                       name varchar(100),
                       price decimal(9, 2) not null,
                       image_name varchar(45),
                       description varchar(600) not null,
                       create_date datetime not null
);

insert into plant (price, name, description, image_name, create_date) values (20.99, 'Pieniążek mały', 'Pilea peperomioides, znana również jako "roślina pieniążka" lub "Chińska moneta", to popularna roślina doniczkowa o charakterystycznym wyglądzie. Pochodzi z południowych części Chin, gdzie jest ceniona zarówno ze względu na swoje ozdobne liście, jak i na symboliczne znaczenie pieniądza i szczęścia.','pilea_peperomioides.jpg',NOW());
insert into plant (price, name, description, image_name, create_date) values (49.99, 'Pieniążek średni','Pilea peperomioides, znana również jako "roślina pieniążka" lub "Chińska moneta", to popularna roślina doniczkowa o charakterystycznym wyglądzie. Pochodzi z południowych części Chin, gdzie jest ceniona zarówno ze względu na swoje ozdobne liście, jak i na symboliczne znaczenie pieniądza i szczęścia.','pilea_peperomioides.jpg',NOW());
insert into plant (price, name, description, image_name, create_date) values (120.99, 'Pieniążek duży','Pilea peperomioides, znana również jako "roślina pieniążka" lub "Chińska moneta", to popularna roślina doniczkowa o charakterystycznym wyglądzie. Pochodzi z południowych części Chin, gdzie jest ceniona zarówno ze względu na swoje ozdobne liście, jak i na symboliczne znaczenie pieniądza i szczęścia.','pilea_peperomioides_big.png',NOW());
insert into plant (price, name, description, image_name, create_date) values (59.0, 'Monstera','Monstera, znana również jako "roślina okazała" lub "Monstera deliciosa", to popularna roślina doniczkowa, która zyskała dużą popularność ze względu na swoje charakterystyczne, ozdobne liście. Monstera jest rodzajem rośliny pnącej, pochodzącej z lasów tropikalnych Ameryki Środkowej i Południowej.', 'monstera.png',NOW());

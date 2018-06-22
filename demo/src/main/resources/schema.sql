	create table Father(
      id int not null primary key,
      family int not null,
      name varchar_ignorecase(50) not null,
      surname varchar_ignorecase(50) not null,
      pesel varchar_ignorecase(50) not null,
      data varchar_ignorecase(50) not null,
      );
      
    create table Child(
      id int not null primary key,
      family int ,
      name varchar_ignorecase(50) not null,
      surname varchar_ignorecase(50) not null,
      pesel varchar_ignorecase(50) not null,
      data varchar_ignorecase(50) not null,
      sex varchar_ignorecase(50) not null,
      );

	create table Family(
	id int not null primary key,
	
	);   
      
      
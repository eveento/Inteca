	create table Father(
      id INTEGER PRIMARY KEY AUTO INCREMENT,
      family int not null,
      name varchar_ignorecase(50) not null,
      surname varchar_ignorecase(50) not null,
      pesel varchar_ignorecase(50) not null,
      data varchar_ignorecase(50) not null,
      );
      
    create table Child(
      id INTEGER PRIMARY KEY AUTO INCREMENT,
      family int ,
      name varchar_ignorecase(50) not null,
      surname varchar_ignorecase(50) not null,
      pesel varchar_ignorecase(50) not null,
      data varchar_ignorecase(50) not null,
      sex varchar_ignorecase(50) not null,
      );

	create table Family(
	id INTEGER PRIMARY KEY AUTO INCREMENT,
	
	);   
      
      
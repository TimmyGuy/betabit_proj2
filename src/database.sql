CREATE TABLE Badge (
                       id int(11) primary key,
                       title varchar(50) NOT NULL,
                       color varchar(25) NOT NULL
);

CREATE TABLE ProfileContainer (
                                  id int(11) primary key,
                                  name varchar(50) NOT NULL,
                                  color varchar(25) NOT NULL,
                                  borderWidth int(5) NOT NULL,
                                  pricePoints int(10),
                                  priceBadges int(10)
);

CREATE TABLE PictureContainer (
                                  id int(11) primary key,
                                  name varchar(50) NOT NULL,
                                  color varchar(25) NOT NULL,
                                  borderWidth int(5) NOT NULL,
                                  pricePoints int(10),
                                  priceBadges int(10)
);

CREATE TABLE Transport (
                           id int(11) primary key,
                           name varchar(50) NOT NULL,
                           emission int(20) NOT NULL
);

CREATE TABLE User (
                      id int(11) primary key,
                      fullName varchar(150) NOT NULL,
                      email varchar(85) NOT NULL,
                      password varchar(255) NOT NULL,
                      role varchar(20) NOT NULL,
                      totalPoints int(11),
                      currentPoints int(11),
                      totalBadges int(11),
                      currentBadges int(11),
                      pictureContainer int(11),
                      profileContainer int(11),

                      FOREIGN KEY (pictureContainer) references PictureContainer (id),
                      FOREIGN KEY (profileContainer) references ProfileContainer (id)
);

CREATE TABLE TravelPreference (
                                  userId int(11) primary key,
                                  distance int(11) NOT NULL,
                                  transport int(11),
                                  foreign key (userId) references User(id),
                                  foreign key (transport) references Transport(id)
);

CREATE TABLE Log (
                     id int(11) primary key,
                     user int(11),
                     distance int(11),
                     transport int(11),
                     foreign key (user) references User(id),
                     foreign key (transport) references Transport(id)
)
## How to run it

### Install mysql with docker
1. ```docker run --name mysql -e MYSQL_ROOT_PASSWORD=<password> -d -p 3306:3306 mysql:8.3.0```
2. ```docker exec -it mysql bash```
3. ```mysql mysql -u root -p```

### DML for samle code
```
CREATE DATABASE school;
```

```mysql
use school;
```

```mysql
create table student (
id bigint not null,
name varchar(20) not null,
school_id bigint not null,
primary key (id)
);
```

```mysql
create table school (
id bigint not null,
name varchar(20) not null,
primary key (id)
);
```
```mysql
insert into student values (1, 'Son', 1);
insert into school values (1, 'Seoul High School');
```

### vm option
```
-Dspring.datasource.username=root -Dspring.datasource.password=admin
```

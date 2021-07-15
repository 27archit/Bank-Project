# Bank-Project

This is a Bank project which I created when I was a beginner in java.

In this project, I had used Java as a framework and MySQL as database.

To use my project firstly clone the repository.

Than just install MySQL database or any GUI Specified MySQL database.

Than run the following queries in MySQL database or any GUI Specified MySQL database which you are using which are written below respectively :-
  * create database bank;
  * use bank;
  * create table bank (account_no INT NOT NULL AUTO_INCREMENT PRIMARY KEY, name varchar(30),age int, email varchar(40), account_type varchar(10), amount int(20));
  * create table transaction (Date_Time CURRENT_TIMESTAMP, Last_transaction int(20), account_no int);
  
After executing these queries in your database just check some things which will be described below :-
  * At line no. = 305 you will found " co=DriverManager.getConnection("jdbc:mysql://localhost:3206/bank","root","abc"); " this line of code.
  * In this line of code you have to give some informations which may be different in our devices.
  * If you have Installed anyother database or using anyother version of connector or database than just change the code according.
  * The prot number for every database is different. so, you have to change it to "3206" while installing your database or just check the port number and change it in this code.
  * If you have setted any password to your database than just write it on the place of "abc" or if you have setted no password than just put it as NULL.
  
The Version of My Software's I am using are :-
  * JVM :- " jdk1.8.0_171 " & " jre1.8.0_171 "
  * 1st Connector :- " mysql-connector-java-5.1.15-bin "
  * 2nd Connector :- " mysql-connector-java-8.0.12 "

If you see any changes in this than just send your suggestions to archit27nov@gmail.com 

Thanks for using my code.

Hope, you like using it.

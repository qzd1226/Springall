use ssm;
CREATE table users(
    userid int primary key,
    uname varchar (20),
    upass varchar (20)
);

CREATE TABLE accounts(
    aid int primary key,
    aname varchar(20),
    acontent varchar (50)
);

SELECT userid,uname,upass from users;
SELECT aid, aname, acontent from accounts;

DELETE FROM users;
DELETE FROM accounts;
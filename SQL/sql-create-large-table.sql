SELECT id,street
	FROM public.table_test;

SELECT posting_date FROM table_test ORDER BY posting_date ASC;

SELECT posting_date FROM table_test AS dat;

UPDATE table_test SET posting_date=randomDate();

select date((current_date - '15 years'::interval) +
trunc(random() * 365) * '1 day'::interval +
trunc(random() * 14) * '1 year'::interval );


CREATE OR REPLACE FUNCTION random_between(low INT ,high INT)
   RETURNS INT AS
$$
BEGIN
   RETURN floor(random()* (high-low + 1) + low);
END;
$$ language 'plpgsql' STRICT;

SELECT random_between(1900,2019);


DROP TABLE IF EXISTS table_test;
CREATE TABLE table_test
(
    id           SERIAL NOT NULL,
    first_name   VARCHAR(255),
    last_name    VARCHAR(255),
    email        VARCHAR(255),
    PESEL        VARCHAR(255),
    phone_number VARCHAR(255),
    age          smallint,
    street       VARCHAR(255),
	posting_date DATE,
    PRIMARY KEY (ID)
);

CREATE OR REPLACE FUNCTION randomDate()
    RETURNS date AS
$$
BEGIN
RETURN(select date((current_date - '15 years'::interval) +
trunc(random() * 365) * '1 day'::interval +
trunc(random() * 14) * '1 year'::interval ));

END;
$$
    LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION randomText(len int)
    RETURNS text AS
$$
BEGIN
    RETURN (SELECT array_to_string(ARRAY(SELECT chr((97 + round(random() * 25)) :: integer)
                                         FROM generate_series(1, len)), ''));
END;
$$
    LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION randomTextNumber(len int)
    RETURNS text AS
$$
BEGIN
    RETURN (SELECT array_to_string(ARRAY(SELECT chr((48 + round(random() * 9)) :: integer)
                                         FROM generate_series(1, len)), ''));
END;
$$
    LANGUAGE PLPGSQL;

CREATE OR REPLACE FUNCTION randomAge()
    RETURNS smallint AS
$$
BEGIN
    RETURN (SELECT RANDOM() * 100);
END;
$$
    LANGUAGE PLPGSQL;

begin;
INSERT INTO table_test (first_name, last_name, email, PESEL, phone_number, age, street, posting_date)
SELECT randomText(5),
       randomText(5),
       LEFT(md5(i::text), 4),
       randomTextNumber(11),
       randomTextNumber(9),
       randomAge(),
       randomText(5),
	   randomDate()
FROM generate_series(1, 100) s(i);
commit;


dsdsdewqewqew
-- Doctors
insert into doctor(id, firstname, lastname, address, zipcode, arrival) values (1, 'Yolande', 'Moreau', '3 rue Deschiens', '59000',TO_DATE('03/02/2002', 'DD/MM/YYYY'));
insert into doctor(id, firstname, lastname, address, zipcode, arrival) values (2, 'Heloise', 'Letissier', '5 rue Bowie', '95360',TO_DATE('16/10/2010', 'DD/MM/YYYY'));
insert into doctor(id, firstname, lastname, address, zipcode, arrival) values (3, 'Jenny', 'Letellier', '105 rue a l envers', '93000',TO_DATE('11/12/2008', 'DD/MM/YYYY'));
insert into doctor(id, firstname, lastname, address, zipcode, arrival) values (4, 'Chiara', 'Brichot', '10 rue de maubeuge', '59600',TO_DATE('20/04/2019', 'DD/MM/YYYY'));
insert into doctor(id, firstname, lastname, address, zipcode, arrival) values (5, 'Pablo', 'Picasso', '3 avenue d Antibes', '02000',TO_DATE('23/01/2012', 'DD/MM/YYYY'));
insert into doctor(id, firstname, lastname, address, zipcode, arrival) values (6, 'Frank', 'Fontaine', '363 bis bvd rapture', '75000',TO_DATE('03/11/2007', 'DD/MM/YYYY'));

                                                                                                                                              -- Medicine
insert into medicine(id, name, date) values (1, 'acepromazine', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (2, 'neomycin', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (3, 'metacam', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (4, 'pentobarbital', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (5, 'sucralfate ', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (6, 'telazol ', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (7, 'xylazine ', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (8, 'ivermectin ', TO_DATE('01/02/2020', 'DD/MM/YYYY'));
insert into medicine(id, name, date) values (9, 'ketamine ', TO_DATE('01/02/2020', 'DD/MM/YYYY'));

-- Animal
insert into Animal(name, birth) values ('Boby',  TO_DATE('01/02/2020', 'DD/MM/YYYY'));

-- RDV
insert into rdv(id, date) values (1, '2020-05-03T14:00');
insert into rdv(id, date) values (2, '2020-07-05T07:00');
insert into rdv(id, date) values (3, '2020-05-09T21:00');
insert into rdv(id, date) values (4, '2020-06-06T18:00');
insert into rdv(id, date) values (5, '2020-06-03T17:00');
insert into rdv(id, date) values (6, '2020-07-07T15:00');
insert into rdv(id, date) values (7, '2020-08-22T12:00');
insert into rdv(id, date) values (8, '2020-05-14T09:00');
insert into rdv(id, date) values (9, '2020-04-09T13:00');
insert into rdv(id, date) values (10, '2020-04-07T14:00');

-- Orders
insert into prescription(name) values ('ordo1');
insert into prescription(name) values ('ordo2');
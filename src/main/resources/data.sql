INSERT INTO Person(id, nome, telefone, idade, cidade, estado, score, regiao, data_inclusao)
VALUES('976b4eca-eadd-4e95-8a33-a4c44a099346', 'Jhony', '5511999999999', 31, 'Barueri', 'SP', 1000, 'sudeste', '2022-06-07 18:00:00');

INSERT INTO Affinity(regiao) VALUES('sudeste');
INSERT INTO Affinity_Estado(affinity_regiao, estado)
VALUES('sudeste', 'SP'),('sudeste', 'RJ'),('sudeste', 'MG'),('sudeste', 'ES');
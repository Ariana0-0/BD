


INSERT INTO CatalogoTipo
( Nombre,          Descripcion) VALUES
( 'Tipo Persona',  'tipos sold, meca, ...'),
( 'Sexo',          'mas, feme,...'),
( 'EstadoCivil',   'sol, viu, cas,...'),
( 'Raza',          'Negro, blanco,...');

INSERT INTO Catalogo
 (IdCatalogoTipo, Nombre,        Descripcion) VALUES
 (1,             'Soldado',      'tipos de perso del ejercito'),
 (1,             'Mecanico',     'tipos de perso del ejercito'),
 (1,             'Experto Ing.', 'tipos de perso del ejercito'),
 (1,             'Experto Esp.', 'tipos de perso del ejercito'),

 (2,             'Masculino',     'tipos de sexualida'),
 (2,             'Femenino',      'tipos de sexualida'),
 (2,             'Hibrido',       'tipos de sexualida'),
 (2,             'Asexual',       'tipos de sexualida'),

 (3,             'Soltero',       'tipos de estado civil Ecu.'),
 (3,             'Casado',        'tipos de estado civil Ecu.'),
 (3,             'Divorsiado',    'tipos de estado civil Ecu.'),
 (3,             'Viudo',         'tipos de estado civil Ecu.'),

 (4,             'Negro',         'tipos de raza'),
 (4,             'Blaco',         'tipos de raza'),
 (4,             'Mestizo',       'tipos de raza'),
 (4,             'Indígena',      'tipos de raza');

insert INTO IABot (Nombre, Observacion)
            VALUES("IA-RUSO", "Inteligencia artificial");

INSERT INTO ExaBot
    (IdIABot,   Nombre,     Serie) VALUES
    (1,         "exabot1",  "Serie A1"),
    (1,         "exabot2",  "Serie A2");

INSERT INTO Persona
(   IdCatalogoTipoPersona, IdCatalogoSexo, IdCatalogoEstadoCivil, Cedula,  Nombre,  Apellido) VALUES
(   1,                      5,              9,                    "11111", "Pepe",  "Rorres"),
(   2,                      5,              10,                   "22222", "Alberto",  "Orosco"),
(   3,                      5,              11,                   "33333", "Alejandro", "Catro"),
(   4,                      5,              12,                   "44444", "Juan", "Cuvi"),
(   1,                      6,              9,                    "01010", "Alan",   "Rodriguez"),
(   2,                      6,              10,                   "02020", "Antonella",  "Almeida"),
(   3,                      6,              11,                   "03030", "Alison", "Perez"),
(   4,                      6,              12,                   "04040", "Camila",  "Ramirez");


SELECT IdCatalogo
,IdCatalogoTipo
,Nombre
,Descripcion
,Estado
,FechaCreacion
,FechaModifica
FROM Catalogo
WHERE Estado = 'A'
AND IdCatalogoTipo = 2;
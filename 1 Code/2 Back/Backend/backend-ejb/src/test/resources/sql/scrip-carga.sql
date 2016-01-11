INSERT INTO comment VALUES (1,'Por supuesto señor Ford, nos ponemos manos a la obra, nos pondrémos en contacto tan pronto como sea posible. Pase buen día, gracias.','2010-01-22 10:34:07',1,0,1);
INSERT INTO comment VALUES (2,'El equipo técnico nos avisa de que todo se ha podido resolver sin mas incidencias, por favor, revisad que todo este a su gusto, si tiene cualquier duda por favor digánosla, estaremos encantados de ayudarle. Un saludo.','2010-01-24 08:45:13',1,1,2);
INSERT INTO comment VALUES (3,'No se preocupe Francisco, nos ponemos inmediatamente, para cualquier cosa no duda en ponerse en contacto con nostros. Pase buen día, muchas gracias por confiar en nosotros.','2013-07-07 09:45:13',1,0,1);
INSERT INTO comment VALUES (4,'Creemos que ya esta preparado, por favor, confirmanos que esta como quereis','2013-07-09 19:32:21',1,1,2);
INSERT INTO comment VALUES (5,'Esta perfecto, gracias','2013-07-10 13:12:56',0,2,3);
INSERT INTO comment VALUES (6,'Nos ponemos manos a la obra, estará preparado lo mas rápido posible, si necesita cualquier cosa por favor pongase en contacto con nosotros, estaremos encantados de ayudarle. Muchas gracias.','2011-04-11 13:12:56',1,0,1);

INSERT INTO customer_contact VALUES (1,'carl.benz@email.com','Benz','Carl','1234','+34 91 435 67 82');
INSERT INTO customer_contact VALUES (2,'cristobal.colon@email.com','Colon','Cristobal','4321','+34 91 396 27 71');
INSERT INTO customer_contact VALUES (3,'clint.eastwood@email.com','Eastwood','Clint','4123','+34 91 267 92 53');
INSERT INTO customer_contact VALUES (4,'steve.jobs@email.com','Jobs','Steve','1423','+34 91 723 41 83');

INSERT INTO customer VALUES (1,'TE GUSTA CONDUCIR SL');
INSERT INTO customer VALUES (2,'VIAJE A LAS INDIAS SL');
INSERT INTO customer VALUES (3,'MIS OSCARS SL');
INSERT INTO customer VALUES (4,'STARTUP SL');

INSERT INTO customer_has_contact VALUES (1,1);
INSERT INTO customer_has_contact VALUES (2,2);
INSERT INTO customer_has_contact VALUES (3,3);
INSERT INTO customer_has_contact VALUES (4,4);

INSERT INTO notification_author VALUES (1,'henry.ford@email.com','Henry Fornd','+34 91 435 67 82');
INSERT INTO notification_author VALUES (2,'charles.rolls@email.com','Charles Rolls','+34 91 435 67 82');
INSERT INTO notification_author VALUES (3,'pepe@email.com','Francisco Pizarro','+34 91 396 27 71');
INSERT INTO notification_author VALUES (4,'steve.jobs@email.com','Steve','+34 91 723 41 83');

INSERT INTO notification VALUES (1,'En la empresa hemos actualizado el catalogo gracias a nuestras nuevas patentes. Queremos mostrar la gama completa de compresores y turbos. Nos gusta mucho el trabajo que estais realizando, nos gustaría que nos pasaseis unos bocetos lo mas pronto posible. ','2010-01-22 10:34:07',1,2,'Nueva gama de productos');
INSERT INTO notification VALUES (2,'Desde que los Reyes Católicos nos han quitado la financiación todo esta yendo un poco cuesta arriba, nuestras espectativas de traer oro nos enormes y hay mucha gente interesada, pero no tenemos un sistema de comunicación rápida para todas aquellas persona','2013-07-07 10:34:07',2,3,'Crowdfunding page');
INSERT INTO notification VALUES (3,'Benz se ha puesto otra vez creativo y nos ha sorprendido con un nuevo sistema de diferencial 4x4. El nuevo invento ha dado un vuelco a los tradicionales sistemas de tracción y esta ganando concursos en todo el planeta, hemos preparado un articulo que nos ','2011-04-11 10:34:07',0,1,'Nuevo diferencial ¡Este hombre no para!');
INSERT INTO notification VALUES (4,'Queremos meter una red social donde los emprendedores se puedan poner de acuerdo para ir juntos a Silicon Valley y así para compartir gastos. Por favor recordar que este es el core de nuestra empresa, es muy importante que este resuelto cuanto antes. Much','2015-03-12 10:34:07',3,0,'Ir a Silicon Valley');

INSERT INTO author_has_notification VALUES(1,1);
INSERT INTO author_has_notification VALUES(2,3);
INSERT INTO author_has_notification VALUES(3,2);
INSERT INTO author_has_notification VALUES(4,4);

INSERT INTO Notification_has_comments VALUES(1,1);
INSERT INTO Notification_has_comments VALUES(1,2);
INSERT INTO Notification_has_comments VALUES(2,3);
INSERT INTO Notification_has_comments VALUES(2,4);
INSERT INTO Notification_has_comments VALUES(2,5);
INSERT INTO Notification_has_comments VALUES(3,6);

INSERT INTO project VALUES (1,'Ecommerce el automovilismo del futuro');
INSERT INTO project VALUES (2,'APP de navegación GPS');
INSERT INTO project VALUES (3,'Web para estrella de hollywood');
INSERT INTO project VALUES (4,'App para emprendedores');

INSERT INTO project_has_customer VALUES (1,1);
INSERT INTO project_has_customer VALUES (2,2);
INSERT INTO project_has_customer VALUES (3,3);
INSERT INTO project_has_customer VALUES (4,4);

INSERT INTO project_has_notifications VALUES (1,1);
INSERT INTO project_has_notifications VALUES (1,3);
INSERT INTO project_has_notifications VALUES (2,2);
INSERT INTO project_has_notifications VALUES (4,4);
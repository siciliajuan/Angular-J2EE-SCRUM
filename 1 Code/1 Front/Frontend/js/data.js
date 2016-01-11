var projects = [{
		id: 1,
		name: 'Ecommerce el automovilismo del futuro',
		customer:{
			id: 1,
			name: 'TE GUSTA CONDUCIR SL',
			contact: {
				name: 'Carl',
				lastName: 'Benz',
				email: 'carl.benz@email.com',
				phone: '+34 91 435 67 82',
				password: '1234'
			}
		},
		notifications: [
			{
				id: 1,
				author:{ 
					name: 'Henry Ford',
					email: 'henry.ford@email.com',
					phone: '+34 91 435 67 82'
				},
				title: 'Nueva gama de productos',
				description: 'En la empresa hemos actualizado el catalogo gracias a nuestras nuevas patentes. Queremos mostrar la gama completa de compresores y turbos. Nos gusta mucho el trabajo que estais realizando, nos gustaría que nos pasaseis unos bocetos lo mas pronto posible. Muchas gracias.',
				comments: [{
					fecha: new Date(2010, 1, 22),
					statusAnt: 0,
					statusAct: 1,
					comment: 'Por supuesto señor Ford, nos ponemos manos a la obra, nos pondrémos en contacto tan pronto como sea posible. Pase buen día, gracias.',
					from: 1 // 0 = customer, 1 = Cycle-IT
				},
				{
					fecha: new Date(2010, 1, 24),
					statusAnt: 1,
					statusAct: 2,
					comment: 'El equipo técnico nos avisa de que todo se ha podido resolver sin mas incidencias, por favor, revisad que todo este a su gusto, si tiene cualquier duda por favor digánosla, estaremos encantados de ayudarle. Un saludo.',
					from: 1 // 0 = customer, 1 = Cycle-IT
				}
				],
				status: 2, //open = 0, inProgress = 1, solved = 2, cerrada 3, duplicada 4, no se resuelve 5, necesita feedback 6
				level: 1, // 0 = bajo, 1 = medio, 2 = alto, 3 = critico
				fecha: new Date(2010, 1, 22)
			},
			{
				id: 3,
				author:{
					name: 'Charles Rolls',
					email: 'charles.rolls@email.com',
					phone: '+34 91 435 67 82'
				},
				title: 'Nuevo diferencial ¡Este hombre no para!',
				description: 'Benz se ha puesto otra vez creativo y nos ha sorprendido con un nuevo sistema de diferencial 4x4. El nuevo invento ha dado un vuelco a los tradicionales sistemas de tracción y esta ganando concursos en todo el planeta, hemos preparado un articulo que nos gustaría mostrar en la web, por favor poneros con ello cuanto antes. Muchas gracias.',
				comments: [{
					fecha: new Date(2011, 4, 11),
					statusAnt: 0,
					statusAct: 1,
					comment: 'Nos ponemos manos a la obra, estará preparado lo mas rápido posible, si necesita cualquier cosa por favor pongase en contacto con nosotros, estaremos encantados de ayudarle. Muchas gracias.',
					from: 1 // 0 = customer, 1 = Cycle-IT
				}
				],
				status: 1, //open = 0, inProgress = 1, solved = 2, cerrada 3, duplicada 4, no se resuelve 5, necesita feedback 6
				level: 0, // 0 = bajo, 1 = medio, 2 = alto, 3 = critico
				fecha: new Date(2011, 4, 11)
			}
		]
	},
	{
		id: 2,
		name: 'APP de navegación GPS',
		customer:{
			id: 2,
			name: 'VIAJE A LAS INDIAS SL',
			contact: {
				name: 'Cristobal',
				lastName: 'Colón',
				email: 'cristobal.colon@email.com',
				phone: '+34 91 396 27 71',
				password: '4321'
			}
		},
		notifications: [
			{
				id: 2,
				author:{
					name: 'Francisco Pizarro',
					email: 'pepe@email.com',
					phone: '+34 91 396 27 71',
				},
				title: 'Crowdfunding page',
				description: 'Desde que los Reyes Católicos nos han quitado la financiación todo esta yendo un poco cuesta arriba, nuestras espectativas de traer oro nos enormes y hay mucha gente interesada, pero no tenemos un sistema de comunicación rápida para todas aquellas personas que desean participar en la empresa. Para solucionar esto hemos pensado en crear un apartado en la app donde la gente pueda invertir en la medida que deseen. Por favor introducirla cuanto antes. Muchas gracias.',
				comments: [{
						fecha: new Date(2013, 7, 07),
						statusAnt: 0,
						statusAct: 1,
						comment: 'No se preocupe Francisco, nos ponemos inmediatamente, para cualquier cosa no duda en ponerse en contacto con nostros. Pase buen día, muchas gracias por confiar en nosotros.',
						from: 1 // 0 = customer, 1 = Cycle-IT
					},
					{
						fecha: new Date(2013, 7, 09),
						statusAnt: 1,
						statusAct: 2,
						comment: 'Creemos que ya esta preparado, por favor, confirmanos que esta como quereis',
						from: 1 // 0 = customer, 1 = Cycle-IT
					},
					{
						fecha: new Date(2013, 7, 10),
						statusAnt: 2,
						statusAct: 3,
						comment: 'Esta perfecto, gracias',
						from: 0 // 0 = customer, 1 = Cycle-IT
					}
				],
				status: 3, //open = 0, inProgress = 1, solved = 2, cerrada 3, duplicada 4, no se resuelve 5, necesita feedback 6
				level: 2, // 0 = bajo, 1 = medio, 2 = alto,3 = critico
				fecha: new Date(2013, 7, 07)
			}
		]
	},
	{
		id: 3,
		name: 'Web para estrella de hollywood',
		customer:{
			id: 2,
			name: 'MIS OSCARS SL',
			contact: {
				name: 'Clint',
				lastName: 'Eastwood',
				email: 'clint.eastwood@email.com',
				phone: '+34 91 267 92 53',
				password: '4132'
			}
		},
		notifications: []
	},
	{
		id: 4,
		name: 'App para emprendedores',
		customer:{
			id: 2,
			name: 'STARTUP SL',
			contact: {
				name: 'Steve',
				lastName: 'Jobs',
				email: 'steve.jobs@email.com',
				phone: '+34 91 723 41 83',
				password: '1423'
			}
		},
		notifications: [
			{
				id: 5,
				author:{
					name: 'Steve',
					email: 'steve.jobs@email.com',
					phone: '+34 91 723 41 83',
				},
				title: 'Ir a Silicon Valley',
				description: 'Queremos meter una red social donde los emprendedores se puedan poner de acuerdo para ir juntos a Silicon Valley y así para compartir gastos. Por favor recordar que este es el core de nuestra empresa, es muy importante que este resuelto cuanto antes. Muchas gracias.',
				comments: [],
				status: 0, //open = 0, inProgress = 1, solved = 2, cerrada 3, duplicada 4, no se resuelve 5, necesita feedback 6
				level: 3, // 0 = bajo, 1 = medio, 2 = alto,3 = critico
				fecha: new Date(2015, 3, 12)
			}
		]
	}
];
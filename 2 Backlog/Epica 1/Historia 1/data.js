var projects = [{
		id: 1,
		name: 'Ecommerce baratito',
		customer:{
			id: 1,
			name: 'e-commerce SL',
			contact: {
				name: 'Enrique',
				lastName: 'Fernandez',
				email: 'enrirque@email.com',
				phone: '+34 91 435 67 82',
				password: '1234'
			}
		},
		notifications: [
			{
				id: 1,
				author:{
					name: 'Enrique',
					email: 'enrirque@email.com',
					phone: '+34 91 435 67 82'
				},
				title: '¿Podríamos actualizar el logo?',
				description: 'En la empresa hemos actualizado el logo',
				comments: [{
					fecha: new Date(2010, 1, 22),
					statusAnt: 0,
					statusAct: 1,
					comment: 'Nos ponemos manos a la obra :-)',
					from: 1 // 0 = customer, 1 = Cycle-IT
				}
				],
				status: 1, //open = 0, inProgress = 1, solved = 2, cerrada 3, duplicada 4, no se resuelve 5, necesita feedback 6
				level: 1, // 0 = bajo, 1 = medio, 2 = alto, 3 = critico
				fecha: new Date(2010, 1, 22)
			},
			{
				id: 3,
				author:{
					name: 'Enrique',
					email: 'enrirque@email.com',
					phone: '+34 91 435 67 82'
				},
				title: '¿Y el fondo?',
				description: 'Nuestro diseñador ha hecho un nuevo fondo',
				comments: [{
					fecha: new Date(2011, 4, 11),
					statusAnt: 0,
					statusAct: 1,
					comment: 'Claro, para eso estamos',
					from: 1 // 0 = customer, 1 = Cycle-IT
				}
				],
				status: 6, //open = 0, inProgress = 1, solved = 2, cerrada 3, duplicada 4, no se resuelve 5, necesita feedback 6
				level: 0, // 0 = bajo, 1 = medio, 2 = alto, 3 = critico
				fecha: new Date(2011, 4, 11)
			}
		]
	},
	{
		id: 2,
		name: 'Red social',
		customer:{
			id: 2,
			name: 'Red Social SL',
			contact: {
				name: 'Pepe',
				lastName: 'Álvarez',
				email: 'pepe@email.com',
				phone: '+34 91 396 27 71',
				password: '4321'
			}
		},
		notifications: [
			{
				id: 2,
				author:{
					name: 'Pepe',
					email: 'pepe@email.com',
					phone: '+34 91 396 27 71',
				},
				title: 'Nuevo apartado para eventos',
				description: 'Hemos pensado en incorporar un nuevo apartado, por favor echarle un ojo y nos decís',
				comments: [{
						fecha: new Date(2013, 7, 07),
						statusAnt: 0,
						statusAct: 1,
						comment: 'Perfecto, tenemos lo que necesitamos, empezamos ya',
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
	}
];
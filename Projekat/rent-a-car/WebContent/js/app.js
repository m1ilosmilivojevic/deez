const Register = { template: '<register></register>' }
const ProfileOverview = { template: '<profileOverview></profileOverview>'}

const router = new VueRouter({
	mode: 'hash',
	  routes: [
		{ path: '/', name: 'register', component: Register},
		{ path: '/profileOverview', component: ProfileOverview},
	  ]
});

var app = new Vue({
	router,
	el: '#registrationForm'
});
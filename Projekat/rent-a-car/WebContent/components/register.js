Vue.component("register", { 
	data: function () {
	    return { customer:{id:0, username: null, password: null, firstName: null, lastName: null,
	    					gender: null, role: null, dateOfBirth: null} }
	},
	    template: 
	    `
	    <h1>Register</h1>
	    <div>
	    <form method="post" v-on:submit="validate()">
	        <table>
	            <tr>
	                <td>
	                    <label>Username:</label>
	                </td>
	                <td>
	                    <input name="username" type="text" v-model="customer.username">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <label>Password:</label>
	                </td>
	                <td>
	                    <input name="password" type="password" v-model="customer.password">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <label>Confirm password:</label>
	                </td>
	                <td>
	                    <input name="confirmPassword" type="password">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <label>First name:</label>
	                </td>
	                <td>
	                    <input name="firstName" type="text" v-model="customer.firstName">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <label>Last name:</label>
	                </td>
	                <td>
	                    <input name="lastName" type="text" v-model="customer.lastName">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <label>Gender:</label>
	                </td>
	                <td>
	                    <select name="gender" v-model="customer.gender">
	                        <option value="Male">Male</option>
	                        <option value="Female">Female</option>
	                    </select>
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <label>Date of birth:</label>
	                </td>
	                <td>
	                    <input name="dateOfBirth" type="date" v-model="customer.dateOfBirth">
	                </td>
	            </tr>
	            <tr>
	                <td>
	                    <input type="submit" value="Register">
	                </td>
	            </tr>
	        </table>
	    </form>
	    </div>
	    `,
    mounted () {
        
    },
    methods: {
    	validate : function() {
			event.preventDefault();
			let success =  true;
			
			let username = document.getElementsByName("username")[0];
			if(!username.value){
				username.style.background = "red";
				success = false;
			}
			let password = document.getElementsByName("password")[0];
			if(!password.value){
				password.style.background = "red";
				success = false;
			}
			let confirmPassword = document.getElementsByName("confirmPassword")[0];
			if(!confirmPassword.value){
				confirmPassword.style.background = "red";
				success = false;
			}
			if(password.value != confirmPassword.value){
				password.style.background = "red";
                confirmPassword.style.background = "red";
                success = false;
			}
			let firstName = document.getElementsByName("firstName")[0];
			if(!firstName.value){
				firstName.style.background = "red";
				success = false;
			}
			let lastName = document.getElementsByName("lastName")[0];
			if(!lastName.value){
				lastName.style.background = "red";
				success = false;
			}
			let gender = document.getElementsByName("gender")[0];
			if(!gender.value){
				gender.style.background = "red";
				success = false;
			}
			let dateOfBirth = document.getElementsByName("dateOfBirth")[0];
			if(!dateOfBirth.value){
				dateOfBirth.style.background = "red";
				success = false;
			}
			
			if(success){
				console.log("Entered if statement");
				router.push('/profileOverview');
				axios.post('rest/users', this.customer)
				.then(response)
				.catch(error=>{console.log(error.response)});
			}
			return success;
    	}
    }
});
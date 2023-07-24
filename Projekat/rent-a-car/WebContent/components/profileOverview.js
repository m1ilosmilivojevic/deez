Vue.component("profileOverview", { 
	data: function () {
	    return { customer:{id:0, username: null, type: null, points:0, firstName: null, lastName: null,
	    					gender: null, dateOfBirth: null} }
	},
	    template: 
	    `
		<!DOCTYPE html>
		<html lang="en">
		<head>
		    <meta charset="UTF-8">
		    <meta http-equiv="X-UA-Compatible" content="IE=edge">
		    <meta name="viewport" content="width=device-width, initial-scale=1.0">
		    <title>Profile overview</title>
		</head>
		<body>
		    <h1>Profile overview</h1>
		    <table>
		        <tr>
		            <td>
		                <label>Username:</label>
		            </td>
		            <td>
		                <label>{{username}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <label>Customer type:</label>
		            </td>
		            <td>
		                <label>{{type}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <label>Points:</label>
		            </td>
		            <td>
		                <label>{{points}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <label>First name:</label>
		            </td>
		            <td>
		                <label>{{firstName}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <label>Last name:</label>
		            </td>
		            <td>
		                <label>{{lastName}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <label>Gender:</label>
		            </td>
		            <td>
		                <label>{{gender}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <label>Date of birth:</label>
		            </td>
		            <td>
		                <label>{{dateOfBirth}}</label>
		            </td>
		        </tr>
		        <tr>
		            <td>
		                <input type="button" v-on:click="switchToProfileEdit()" value="Edit profile">
		            </td>
		        </tr>
		    </table>
		</body>
		</html>
	    `,
    mounted () {
        
    },
    methods: {
    	switchToProfileEdit : function() {
			
    	}
    }
});
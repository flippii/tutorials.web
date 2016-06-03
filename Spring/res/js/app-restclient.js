const client = require('./restclient'); #<1>

client({path: '/api/tasks/1'}).then(response => { #<2>
	console.log('response: ', response);
	document.write("response: " + response + " summary: " + response.summary);
}, error => { #<3>
	document.write("error: " + error);
});

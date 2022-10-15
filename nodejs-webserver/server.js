// Import the Node.js http module
var http = require('http'); 
  
// Create a server object
http.createServer(function (req, res) {
  
res.writeHead(200, {'Content-Type': 'text/html'}); 
  
    // Write a response to the client
    res.write('Hello World!');
  
    // End the response
    res.end();
  
}).listen(8000); // Server object listens on port 8081
  
console.log('Server running at port 8000..');

let http = require('http');
let express = require('express');


let server=express();
server.listen(6666);
console.log('Server is running on port 6666');
let fileName=__dirname+"/data.xml"

server.use(express.static(__dirname));

server.get('/', function(req, res){
    res.sendFile(fileName);
});

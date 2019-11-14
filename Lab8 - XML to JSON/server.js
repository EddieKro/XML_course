let http = require('http');
let express = require('express');


let server=express();
server.listen(6666);
console.log('Server is running on port 6666');
let fileName=__dirname+"/data.xml"


var fs = require('fs'),
    xml2js = require('xml2js');
 
var parser = new xml2js.Parser();
fs.readFile(__dirname + '/data.xml', function(err, data) {
    parser.parseString(data, function (err, result) {
        console.dir(result);
        console.log('Done');
    });
});

server.use(express.static(__dirname));

server.get('/', function(req, res){
    res.sendFile(fileName);
});

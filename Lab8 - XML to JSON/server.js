fs = require('fs');
var convert = require('xml-js');
var options = {compact:true, ignoreComment: true, alwaysChildren: false, spaces:4,textKey: '_', attributesKey: '$', commentKey: 'value'};


fs.readFile('./data.xml',function(err,data){
	var result = convert.xml2json(data,options);
	console.log("json ->", result);
	var data = JSON.stringify(result,null,4);
	fs.writeFileSync('data.json',data);
	console.log("\ndata written to file");
});

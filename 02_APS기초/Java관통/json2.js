// JSON 문자열 => 객체
// JSON.parse
var str = '{"name": "Luna", "age":4}';

var obj = JSON.parse(str);


// 배열
var arr = [1,2,3,"hi"];
var arrStr = JSON.stringify(arr);

var str2 = '[1,2,3,"hi","hello"]'
var arr2 = JSON.parse(str2)
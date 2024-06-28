function count(input) {
    let result = {};
    for(let i = 0; i < input.length; i++){
        if(result[input[i]] === undefined){
            result[input[i]] = 1;
        }else{
            result[input[i]] += 1;
        }
    }
    return result;
}
let input1 = ["a", "b", "c", "a", "c", "a", "x"];
console.log(count(input1));
// should print {a:3, b:1, c:2, x:1}

function groupByKey(input) {
    let result = {};
    for(let i = 0; i < input.length; i++){
        if(result[input[i].key] === undefined){
            result[input[i].key] = input[i].value;
        }else{
            result[input[i].key] += input[i].value;
        }
    }
    return result;
}
let input2 = [
{ key: "a", value: 3 },
{ key: "b", value: 1 },
{ key: "c", value: 2 },
{ key: "a", value: 3 },
{ key: "c", value: 5 },
];
console.log(groupByKey(input2));
// should print {a:6, b:1, c:7}
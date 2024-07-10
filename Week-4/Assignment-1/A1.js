// callback
function delayedResult(n1, n2, delayTime, callback) {
    setTimeout(() => {
        callback(n1 + n2);
    }, delayTime)
}
delayedResult(4, 5, 3000, function (result) {
console.log(result);
});
delayedResult(-5, 10, 2000, function (result) { console.log(result);
});


// promise
function delayedResultPromise(n1, n2, delayTime) { 
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            resolve(n1 + n2);
        }, delayTime)
    })
}
delayedResultPromise(4, 5, 3000).then(console.log);


// async/await
async function main(n1, n2, delayTime) {
    const result = await delayedResultPromise(n1, n2, delayTime);
    console.log(result);
}
  
main(4, 5, 3000);
  
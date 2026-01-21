console.log("teste");

let promessa = new Promise((resolve, reject)=>{
    setTimeout(() => {
        resolve("pronto");
    }, 3000);
});

promessa.then(valor => console.log(valor));
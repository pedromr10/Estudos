//seleciona as imagens:
const images = document.querySelectorAll(".image-container img");

//utiliza uma API do navegador para detecção de visibilidade de elementos na tela:
const observer = new IntersectionObserver((entries, observer) =>{
    entries.forEach((entry) =>{
        /*como entry é um obejto, podemos ver as propriedades dele aqui:
        console.log(entry);
        */
        //se a imagem nao estiver sendo observada, nao será necessário trocar o src:
        if(!entry.isIntersecting){
            return; //se a imagem não está visível, não faz nada.
        }
        else{
            const image = entry.target;
            //usar o replace para trocar uma parte do elemento por outro, nesse caso a width da imagem original:
            image.src = image.src.replace("?w=10", "?w=1000");
            observer.unobserve(image); //faz com que só mude uma vez o src.
        }
    })
}, {});

images.forEach((image) => {
   observer.observe(image);
});

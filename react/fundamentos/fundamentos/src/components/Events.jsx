// 6 - eventos
const Events = () => {

    // 7 - funcoes:
    const handleClick = () =>{
        console.log("clicou no botao com funcao")
    }

    //funcao de renderizacao:
    const renderSomething = (x) =>{
        if(x){
            return <h1>Renderizando isso!</h1>
        }
        else{
            return <h1>Renderizando outra coisa!</h1>
        }
    }

  return (
    <div>
        <div>
            <button onClick={() => console.log("clicou no botao simples")}>
                Botao simples
            </button>
        </div>
        {/* 7 - funcoes */}
        <div>
            <button onClick={handleClick}>Botao com funcao</button>
        </div>
        {/* 8 - funcao com render */}
        {renderSomething(true)}
        {renderSomething(false)}
    </div>
  )
}

export default Events
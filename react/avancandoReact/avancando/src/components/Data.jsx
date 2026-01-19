// 3 - useState:
import { useState } from "react";

const Data = () => {

    let someData = 10;
    //anotherNumber = valor atual do state;
    //setAnotherNumber = funcao para atualizar o valor;
    //15 = valor inicial
    //sempre que chama o setAnotherNumber o react atualiza o valor, renderiza o componente novamente e atualiza a tela automaticamente
    const [anotherNumber, setAnotherNumber] = useState(15);

  return (
    <div>
        <p>
            Valor: {someData}.
        </p>
        <button onClick={() => someData = 15}>Altere valor do numero</button> {/*ele altera o numero, mas nao renderiza o componente, por isso precisamos do userstate */}
        <div>
            <p>Valor: {anotherNumber}</p>
            <button onClick={()=>setAnotherNumber(anotherNumber+2)}>Mudar state</button>
        </div>
    </div>
  )
}

export default Data
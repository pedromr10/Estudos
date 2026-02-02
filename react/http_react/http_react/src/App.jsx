import { useState, useEffect, use } from 'react'
import { useFetch } from './hooks/useFetch';
import './App.css'

const url = "http://localhost:3000/products";

function App() {
  //1 - resgatando dados:
  const [products, setProducts] = useState([]);

  const {data: items} = useFetch(url);

  // 4 - custom hook:


  /*obs:
  o valor depois da funcao anonima é chamado de dependencia.
  sem ela, o codigo roda sempre, com ela, roda uma vez e depois roda toda vez que o valor dessa dependencia mudar.
   */
  /* comentado para utilizar o custom hook
  useEffect(()=>{
    async function getData() { //Cria uma função assíncrona chamada getData, ou seja, uma função que pode usar await para esperar respostas (tipo chamadas de API).
      const res = await fetch(url); //faz requisicao http para a url
      const data = await res.json(); //converte a resposta em json
      console.log(data);
      setProducts(data);
    }

    getData()
  }, []);*/

  //2 - envio de dados:
  const [name, setName] = useState("");
  const [price, setPrice] = useState("");

  const handleSubmit = async (e) =>{
    e.preventDefault();
    const product ={
      name, 
      price
    }

    const res = await fetch(url,{
      method: "POST",
      headers:{
        "Content-Type": "application/json"
      },
      body: JSON.stringify(product),
    });

    //3 - carregamento dinamico
    const addedProduct = await res.json();

    setProducts((prevProducts) => [...prevProducts, addedProduct]);
  }


  return (
      <>
        <div>
          {/*1 - resgate de dados */}
          <ul>
            {items && items.map((item)=>(
              <li key={item.id}>{item.name} - R${item.price}</li> 
            ))}
          </ul>
          {/*2 - enviando dados */}
          <div className="addProduct">
            <form onSubmit={handleSubmit}>
              <label>
                <span>Nome:</span>
                <input type="text" value={name} onChange={(e) => setName(e.target.value)}/>
              </label>
              <label>
                <span>Preço:</span>
                <input type="text" value={price} onChange={(e) => setPrice(e.target.value)}/>
              </label>
              <input type="submit" value="enviar"/>
            </form>
          </div>
        </div>
      </>
  )
}

export default App

import './App.css'

// 2 - imagem em assets:
import street from './assets/street.jpg';

// 3 - Hook - useState:
import Data from './components/Data';

// 4 - imprimindo listas:
import ListRender from './components/ListRender';

// 7 - conditional render:
import ConditionalRender from './components/ConditionalRender';

// 9 - props:
import ShowUserName from './components/ShowUserName';

// 10 - desestruturando props:
import CarDetails from './components/CarDetails';

// 12 - renderizacao de listar com componente:
const cars = [
  {id:1, brand: "Ferrari", color: "Amarelo", km:0},
  {id:2, brand: "KIA", color: "Branco", km:200000},
  {id:3, brand: "Renault", color: "Azul", km:32000},
];

//13 - fragment:
import Fragment from './components/Fragment';

//14 - children:
import Container from './components/Container';

//15 - funcao em prop:
import ExecuteFunction from './components/ExecuteFunction';

//16 - state lift:
import { useState } from 'react';
import Message from './components/Message';
import ChangeMessage from './components/ChangeMessage';

function App() {

  //15 - funcao em prop:
  function showMessage(){
    console.log("funcao em prop");
  }

  //16 - state lift:
  const [message, setMessage] = useState("");
  const handleMessage = (msg) =>{
    setMessage(msg);
  }

  return (
    <div className="App" style={{paddingBottom: "600px"}}>
      <h1>teste</h1>
      {/* 3 - useState */}
      <Data></Data>
      {/* 1 - imagem em public */}
      <img src="/forest.jpg" alt="forest" />
      {/* 2 - imagem em assets: */}
      <img src={street} alt="street" />

      {/* 4 - imprimindo lista */}
      <ListRender></ListRender>

      {/* 7 - conditional render: */}
      <ConditionalRender></ConditionalRender>

      {/* 9 - props 
      
      obs: normalmente os componentes tem mais de um prop*/}
      <ShowUserName name="pedro"></ShowUserName>

      {/*10 - desestruturando props */}
      <CarDetails brand="ferrari" km={1000} color="red"></CarDetails> {/* o que nao for string, usa as chaves */}

      {/*11 - reaproveitamento de componentes */}
      <CarDetails brand="fiat" km={28333} color="blue"></CarDetails>
      <CarDetails brand="audi" km={342442} color="gray"></CarDetails>

      {/* 12 - renderizacao de lista com componente */}
      {cars.map((car) => 
        <CarDetails key={car.id} brand={car.brand} km = {car.km} color={car.color}></CarDetails>
      )}

      {/* 13 - fragment: */}
      <Fragment></Fragment>

      {/* 14 - children: */}
      <Container>
        <p>alguma coisa</p>
      </Container>

      {/*15 - funcao em prop */}
      <ExecuteFunction myFunction={showMessage}></ExecuteFunction>

      {/* 16 - state lift */}
      <Message msg = {message}></Message> {/*exibe */}
      <ChangeMessage handleMessage={handleMessage}></ChangeMessage> {/*altera */}
    </div>
  )
}

export default App

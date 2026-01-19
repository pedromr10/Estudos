import './App.css'

// 2 - imagem em assets:
import street from './assets/street.jpg';

// 3 - Hook - useState:
import Data from './components/Data';

// 4 - imprimindo listas:
import ListRender from './components/ListRender';

function App() {
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
    </div>
  )
}

export default App

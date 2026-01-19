import './App.css';

//2 - impotando componente:
import FirstComponent from './components/FirstComponent';

// 4 - template expressions:
import TemplateExpression from './components/TemplateExpression';

// 5 - hierarquia de componentes:
import MyComponent from './components/MyComponent';

// 6 - evento de clique:
import Events from './components/Events';

function App() {
  // 3 - comentarios
  {/* 3- comentarios */}
  return (
    <div className='App'>
      <h1>Fundamentos</h1>
      <FirstComponent></FirstComponent>
      <TemplateExpression></TemplateExpression>
      <MyComponent></MyComponent>
      <Events></Events>
    </div>
  )
}

export default App

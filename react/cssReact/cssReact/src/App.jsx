import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'

//2 - css de componente:
import MyComponents from './components/MyComponents'

// 6 - css modules:
import Title from './components/Title'

import './App.css'

function App() {
  //4 - inline style dinamico
  const n = 15;
  // 5 - classe dinamica
  const redTitle = true;

  return (
    <>
    {/*1 - css global */}
      <div className="App">
        <h1>teste</h1>
        {/*2 - css de componente */}
        <MyComponents></MyComponents>
        <p>pegou o css do componente</p>
        {/*3 - inline style */}
        <p style={{color: "blue", padding: "25px", borderTop: "1px solid green"}}>este elemento tem estilos inline</p>

        {/*4 - inline style dinamico 
        
        obs: tem {} pq espera um objeto*/}
        <h2 style={n > 10 ? {color: "purple"}:{color: "gray"}}>
          css dinamico
        </h2>
        {/*5 - classe dinamica */}
        <h2 className={redTitle ? "red-title":"title"}> este titulo vai ter uma classe</h2>


        {/*6 - css modules */}
        <Title></Title>
      </div>
    </>
  )
}

export default App
